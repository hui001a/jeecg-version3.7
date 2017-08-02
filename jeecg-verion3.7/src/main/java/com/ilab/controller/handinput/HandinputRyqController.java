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

import com.ilab.entity.handinput.HandinputRyqEntity;
import com.ilab.service.handinput.HandinputRyqServiceI;

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
 * @Description: 入院前评价
 * @author zhangdaihao
 * @date 2017-07-19 21:44:13
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/handinputRyqController")
public class HandinputRyqController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(HandinputRyqController.class);

	@Autowired
	private HandinputRyqServiceI handinputRyqService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 入院前评价列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/ilab/handinput/handinputRyqList");
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
	public void datagrid(HandinputRyqEntity handinputRyq,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(HandinputRyqEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, handinputRyq, request.getParameterMap());
		this.handinputRyqService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除入院前评价
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(HandinputRyqEntity handinputRyq, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		handinputRyq = systemService.getEntity(HandinputRyqEntity.class, handinputRyq.getId());
		message = "入院前评价删除成功";
		handinputRyqService.delete(handinputRyq);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加入院前评价
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(HandinputRyqEntity handinputRyq, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(handinputRyq.getId())) {
			message = "入院前评价更新成功";
			HandinputRyqEntity t = handinputRyqService.get(HandinputRyqEntity.class, handinputRyq.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(handinputRyq, t);
				handinputRyqService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "入院前评价更新失败";
			}
		} else {
			message = "入院前评价添加成功";
			handinputRyqService.save(handinputRyq);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 入院前评价列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(HandinputRyqEntity handinputRyq, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(handinputRyq.getId())) {
			handinputRyq = handinputRyqService.getEntity(HandinputRyqEntity.class, handinputRyq.getId());
			req.setAttribute("handinputRyqPage", handinputRyq);
		}
		return new ModelAndView("com/ilab/handinput/handinputRyq");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<HandinputRyqEntity> list() {
		List<HandinputRyqEntity> listHandinputRyqs=handinputRyqService.getList(HandinputRyqEntity.class);
		return listHandinputRyqs;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		HandinputRyqEntity task = handinputRyqService.get(HandinputRyqEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody HandinputRyqEntity handinputRyq, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandinputRyqEntity>> failures = validator.validate(handinputRyq);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handinputRyqService.save(handinputRyq);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = handinputRyq.getId();
		URI uri = uriBuilder.path("/rest/handinputRyqController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody HandinputRyqEntity handinputRyq) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandinputRyqEntity>> failures = validator.validate(handinputRyq);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handinputRyqService.saveOrUpdate(handinputRyq);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		handinputRyqService.deleteEntityById(HandinputRyqEntity.class, id);
	}
}
