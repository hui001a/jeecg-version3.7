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

import com.ilab.entity.handinput.HandInputSJEntity;
import com.ilab.service.handinput.HandInputSJServiceI;

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
 * @Description: 神经功能评分
 * @author zhangdaihao
 * @date 2017-07-19 16:20:15
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/handInputSJController")
public class HandInputSJController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(HandInputSJController.class);

	@Autowired
	private HandInputSJServiceI handInputSJService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 神经功能评分列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/ilab/handinput/handInputSJList");
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
	public void datagrid(HandInputSJEntity handInputSJ,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(HandInputSJEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, handInputSJ, request.getParameterMap());
		this.handInputSJService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除神经功能评分
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(HandInputSJEntity handInputSJ, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		handInputSJ = systemService.getEntity(HandInputSJEntity.class, handInputSJ.getId());
		message = "神经功能评分删除成功";
		handInputSJService.delete(handInputSJ);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加神经功能评分
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(HandInputSJEntity handInputSJ, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(handInputSJ.getId())) {
			message = "神经功能评分更新成功";
			HandInputSJEntity t = handInputSJService.get(HandInputSJEntity.class, handInputSJ.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(handInputSJ, t);
				handInputSJService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "神经功能评分更新失败";
			}
		} else {
			message = "神经功能评分添加成功";
			handInputSJService.save(handInputSJ);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 神经功能评分列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(HandInputSJEntity handInputSJ, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(handInputSJ.getId())) {
			handInputSJ = handInputSJService.getEntity(HandInputSJEntity.class, handInputSJ.getId());
			req.setAttribute("handInputSJPage", handInputSJ);
		}
		return new ModelAndView("com/ilab/handinput/handInputSJ");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<HandInputSJEntity> list() {
		List<HandInputSJEntity> listHandInputSJs=handInputSJService.getList(HandInputSJEntity.class);
		return listHandInputSJs;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		HandInputSJEntity task = handInputSJService.get(HandInputSJEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody HandInputSJEntity handInputSJ, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandInputSJEntity>> failures = validator.validate(handInputSJ);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handInputSJService.save(handInputSJ);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = handInputSJ.getId();
		URI uri = uriBuilder.path("/rest/handInputSJController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody HandInputSJEntity handInputSJ) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<HandInputSJEntity>> failures = validator.validate(handInputSJ);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		handInputSJService.saveOrUpdate(handInputSJ);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		handInputSJService.deleteEntityById(HandInputSJEntity.class, id);
	}
}
