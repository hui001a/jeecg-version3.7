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

import com.winning.entity.metabox.MetaboxDatasetMasterEntity;
import com.winning.service.metabox.MetaboxDatasetMasterServiceI;

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
 * @Description: 数据集元模型
 * @author zhangdaihao
 * @date 2017-07-26 15:26:40
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/metaboxDatasetMasterController")
public class MetaboxDatasetMasterController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MetaboxDatasetMasterController.class);

	@Autowired
	private MetaboxDatasetMasterServiceI metaboxDatasetMasterService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 数据集元模型列表 页面跳转
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
		return new ModelAndView("com/winning/metabox/metaboxDatasetMasterList");
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
	public void datagrid(MetaboxDatasetMasterEntity metaboxDatasetMaster,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) throws UnsupportedEncodingException {
		CriteriaQuery cq = new CriteriaQuery(MetaboxDatasetMasterEntity.class, dataGrid);
		String  method = request.getParameter("method");
		method = new String(method.getBytes("ISO-8859-1"), "UTF-8");
		
		cq.eq("keywords", method);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, metaboxDatasetMaster, request.getParameterMap());
		this.metaboxDatasetMasterService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除数据集元模型
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(MetaboxDatasetMasterEntity metaboxDatasetMaster, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		metaboxDatasetMaster = systemService.getEntity(MetaboxDatasetMasterEntity.class, metaboxDatasetMaster.getId());
		message = "数据集元模型删除成功";
		metaboxDatasetMasterService.delete(metaboxDatasetMaster);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加数据集元模型
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(MetaboxDatasetMasterEntity metaboxDatasetMaster, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(metaboxDatasetMaster.getId())) {
			message = "数据集元模型更新成功";
			MetaboxDatasetMasterEntity t = metaboxDatasetMasterService.get(MetaboxDatasetMasterEntity.class, metaboxDatasetMaster.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(metaboxDatasetMaster, t);
				metaboxDatasetMasterService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "数据集元模型更新失败";
			}
		} else {
			message = "数据集元模型添加成功";
			metaboxDatasetMasterService.save(metaboxDatasetMaster);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 数据集元模型列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(MetaboxDatasetMasterEntity metaboxDatasetMaster, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(metaboxDatasetMaster.getId())) {
			metaboxDatasetMaster = metaboxDatasetMasterService.getEntity(MetaboxDatasetMasterEntity.class, metaboxDatasetMaster.getId());
			req.setAttribute("metaboxDatasetMasterPage", metaboxDatasetMaster);
		}
		return new ModelAndView("com/winning/metabox/metaboxDatasetMaster");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<MetaboxDatasetMasterEntity> list() {
		List<MetaboxDatasetMasterEntity> listMetaboxDatasetMasters=metaboxDatasetMasterService.getList(MetaboxDatasetMasterEntity.class);
		return listMetaboxDatasetMasters;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		MetaboxDatasetMasterEntity task = metaboxDatasetMasterService.get(MetaboxDatasetMasterEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody MetaboxDatasetMasterEntity metaboxDatasetMaster, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<MetaboxDatasetMasterEntity>> failures = validator.validate(metaboxDatasetMaster);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		metaboxDatasetMasterService.save(metaboxDatasetMaster);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = metaboxDatasetMaster.getId();
		URI uri = uriBuilder.path("/rest/metaboxDatasetMasterController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody MetaboxDatasetMasterEntity metaboxDatasetMaster) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<MetaboxDatasetMasterEntity>> failures = validator.validate(metaboxDatasetMaster);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		metaboxDatasetMasterService.saveOrUpdate(metaboxDatasetMaster);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		metaboxDatasetMasterService.deleteEntityById(MetaboxDatasetMasterEntity.class, id);
	}
}
