package com.winning.controller.metabox;
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

import com.winning.entity.metabox.MetaboxDeMasterEntity;
import com.winning.service.metabox.MetaboxDeMasterServiceI;

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

import java.io.UnsupportedEncodingException;
import java.net.URI;

import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponentsBuilder;

/**   
 * @Title: Controller
 * @Description: 数据元管理
 * @author zhangdaihao
 * @date 2017-07-11 13:32:19
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/metaboxDeMasterController")
public class MetaboxDeMasterController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MetaboxDeMasterController.class);

	@Autowired
	private MetaboxDeMasterServiceI metaboxDeMasterService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 数据元管理列表 页面跳转
	 * 
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) throws UnsupportedEncodingException {
	    String  method = request.getParameter("method");
	    method = new String(method.getBytes("ISO-8859-1"), "UTF-8");
	    //System.out.println("method+******"+  method);
	    request.setAttribute("method", method);
		return new ModelAndView("com/winning/metabox/metaboxDeMasterList");
	}

	/**
	 * easyui AJAX请求数据
	 * 
	 * @param request
	 * @param response
	 * @param dataGrid
	 * @param user
	 * @throws UnsupportedEncodingException 
	 */

	@RequestMapping(params = "datagrid")
	public void datagrid(MetaboxDeMasterEntity metaboxDeMaster,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) throws UnsupportedEncodingException {
		CriteriaQuery cq = new CriteriaQuery(MetaboxDeMasterEntity.class, dataGrid);
		String  method = request.getParameter("method");
		method = new String(method.getBytes("ISO-8859-1"), "UTF-8");
		//System.out.println("method+******"+  method);
		cq.eq("keywords", method);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, metaboxDeMaster, request.getParameterMap());
		this.metaboxDeMasterService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除数据元管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(MetaboxDeMasterEntity metaboxDeMaster, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		metaboxDeMaster = systemService.getEntity(MetaboxDeMasterEntity.class, metaboxDeMaster.getId());
		message = "数据元管理删除成功";
		metaboxDeMasterService.delete(metaboxDeMaster);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加数据元管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(MetaboxDeMasterEntity metaboxDeMaster, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(metaboxDeMaster.getId())) {
			message = "数据元管理更新成功";
			MetaboxDeMasterEntity t = metaboxDeMasterService.get(MetaboxDeMasterEntity.class, metaboxDeMaster.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(metaboxDeMaster, t);
				metaboxDeMasterService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "数据元管理更新失败";
			}
		} else {
			message = "数据元管理添加成功";
			metaboxDeMasterService.save(metaboxDeMaster);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 数据元管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(MetaboxDeMasterEntity metaboxDeMaster, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(metaboxDeMaster.getId())) {
			metaboxDeMaster = metaboxDeMasterService.getEntity(MetaboxDeMasterEntity.class, metaboxDeMaster.getId());
			req.setAttribute("metaboxDeMasterPage", metaboxDeMaster);
		}
		return new ModelAndView("com/winning/metabox/metaboxDeMaster");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<MetaboxDeMasterEntity> list() {
		List<MetaboxDeMasterEntity> listMetaboxDeMasters=metaboxDeMasterService.getList(MetaboxDeMasterEntity.class);
		return listMetaboxDeMasters;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		MetaboxDeMasterEntity task = metaboxDeMasterService.get(MetaboxDeMasterEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody MetaboxDeMasterEntity metaboxDeMaster, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<MetaboxDeMasterEntity>> failures = validator.validate(metaboxDeMaster);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		metaboxDeMasterService.save(metaboxDeMaster);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = metaboxDeMaster.getId();
		URI uri = uriBuilder.path("/rest/metaboxDeMasterController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody MetaboxDeMasterEntity metaboxDeMaster) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<MetaboxDeMasterEntity>> failures = validator.validate(metaboxDeMaster);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		metaboxDeMasterService.saveOrUpdate(metaboxDeMaster);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		metaboxDeMasterService.deleteEntityById(MetaboxDeMasterEntity.class, id);
	}
}
