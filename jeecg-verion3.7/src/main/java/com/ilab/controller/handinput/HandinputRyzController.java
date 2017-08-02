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

import com.ilab.entity.handinput.HandinputRyzEntity;
import com.ilab.service.handinput.HandinputRyzServiceI;

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
 * @Description: 住院期评价
 * @author zhangdaihao
 * @date 2017-07-19 21:44:28
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/handinputRyzController")
public class HandinputRyzController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(HandinputRyzController.class);

	@Autowired
	private HandinputRyzServiceI handinputRyzService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 住院期评价列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/ilab/handinput/handinputRyzList");
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
	public void datagrid(HandinputRyzEntity handinputRyz,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(HandinputRyzEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, handinputRyz, request.getParameterMap());
		this.handinputRyzService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除住院期评价
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(HandinputRyzEntity handinputRyz, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		handinputRyz = systemService.getEntity(HandinputRyzEntity.class, handinputRyz.getId());
		message = "住院期评价删除成功";
		handinputRyzService.delete(handinputRyz);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加住院期评价
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(HandinputRyzEntity handinputRyz, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(handinputRyz.getId())) {
			message = "住院期评价更新成功";
			HandinputRyzEntity t = handinputRyzService.get(HandinputRyzEntity.class, handinputRyz.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(handinputRyz, t);
				handinputRyzService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "住院期评价更新失败";
			}
		} else {
			message = "住院期评价添加成功";
			handinputRyzService.save(handinputRyz);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 住院期评价列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(HandinputRyzEntity handinputRyz, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(handinputRyz.getId())) {
			handinputRyz = handinputRyzService.getEntity(HandinputRyzEntity.class, handinputRyz.getId());
			req.setAttribute("handinputRyzPage", handinputRyz);
		}
		return new ModelAndView("com/ilab/handinput/handinputRyz");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<HandinputRyzEntity> list() {
		List<HandinputRyzEntity> listHandinputRyzs=handinputRyzService.getList(HandinputRyzEntity.class);
		return listHandinputRyzs;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		HandinputRyzEntity task = handinputRyzService.get(HandinputRyzEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody HandinputRyzEntity handinputRyz, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandinputRyzEntity>> failures = validator.validate(handinputRyz);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handinputRyzService.save(handinputRyz);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = handinputRyz.getId();
		URI uri = uriBuilder.path("/rest/handinputRyzController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody HandinputRyzEntity handinputRyz) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandinputRyzEntity>> failures = validator.validate(handinputRyz);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handinputRyzService.saveOrUpdate(handinputRyz);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		handinputRyzService.deleteEntityById(HandinputRyzEntity.class, id);
	}
}
