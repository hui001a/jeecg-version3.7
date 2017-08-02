package com.ilab.controller.handinput;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import org.jeecgframework.core.common.controller.BaseController;
import org.jeecgframework.core.common.hibernate.qbc.CriteriaQuery;
import org.jeecgframework.core.common.model.json.AjaxJson;
import org.jeecgframework.core.common.model.json.DataGrid;
import org.jeecgframework.core.constant.Globals;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.tag.core.easyui.TagUtil;
import org.jeecgframework.web.system.pojo.base.TSDepart;
import org.jeecgframework.web.system.service.SystemService;
import org.jeecgframework.core.util.MyBeanUtils;

import com.ilab.entity.handinput.HandinputRyhEntity;
import com.ilab.service.handinput.HandinputRyhServiceI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.jeecgframework.core.beanvalidator.BeanValidators;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.net.URI;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller
 * @Description: 出院时评价
 * @author zhangdaihao
 * @date 2017-07-19 21:43:54
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/handinputRyhController")
public class HandinputRyhController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(HandinputRyhController.class);

	@Autowired
	private HandinputRyhServiceI handinputRyhService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 出院时评价列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/ilab/handinput/handinputRyhList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(HandinputRyhEntity handinputRyh,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(HandinputRyhEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, handinputRyh, request.getParameterMap());
		this.handinputRyhService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除出院时评价
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(HandinputRyhEntity handinputRyh, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		handinputRyh = systemService.getEntity(HandinputRyhEntity.class, handinputRyh.getId());
		message = "出院时评价删除成功";
		handinputRyhService.delete(handinputRyh);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加出院时评价
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(HandinputRyhEntity handinputRyh, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(handinputRyh.getId())) {
			message = "出院时评价更新成功";
			HandinputRyhEntity t = handinputRyhService.get(HandinputRyhEntity.class, handinputRyh.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(handinputRyh, t);
				handinputRyhService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "出院时评价更新失败";
			}
		} else {
			message = "出院时评价添加成功";
			handinputRyhService.save(handinputRyh);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 出院时评价列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(HandinputRyhEntity handinputRyh, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(handinputRyh.getId())) {
			handinputRyh = handinputRyhService.getEntity(HandinputRyhEntity.class, handinputRyh.getId());
			req.setAttribute("handinputRyhPage", handinputRyh);
		}
		return new ModelAndView("com/ilab/handinput/handinputRyh");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<HandinputRyhEntity> list() {
		List<HandinputRyhEntity> listHandinputRyhs=handinputRyhService.getList(HandinputRyhEntity.class);
		return listHandinputRyhs;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		HandinputRyhEntity task = handinputRyhService.get(HandinputRyhEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody HandinputRyhEntity handinputRyh, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandinputRyhEntity>> failures = validator.validate(handinputRyh);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handinputRyhService.save(handinputRyh);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = handinputRyh.getId();
		URI uri = uriBuilder.path("/rest/handinputRyhController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody HandinputRyhEntity handinputRyh) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandinputRyhEntity>> failures = validator.validate(handinputRyh);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handinputRyhService.saveOrUpdate(handinputRyh);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		handinputRyhService.deleteEntityById(HandinputRyhEntity.class, id);
	}
}
