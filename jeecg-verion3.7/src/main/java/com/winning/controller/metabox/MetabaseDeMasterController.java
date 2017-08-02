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

import com.winning.entity.metabox.MetabaseDeMasterEntity;
import com.winning.service.metabox.MetabaseDeMasterServiceI;

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
 * @Description: 元数据 管理
 * @author zhangdaihao
 * @date 2017-07-04 16:15:53
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("/metabaseDeMasterController")
public class MetabaseDeMasterController extends BaseController {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(MetabaseDeMasterController.class);

	@Autowired
	private MetabaseDeMasterServiceI metabaseDeMasterService;
	@Autowired
	private SystemService systemService;
	@Autowired
	private Validator validator;
	


	/**
	 * 元数据 管理列表 页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "list")
	public ModelAndView list(HttpServletRequest request) {
		return new ModelAndView("com/winning/metabox/metabaseDeMasterList");
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
	public void datagrid(MetabaseDeMasterEntity metabaseDeMaster,HttpServletRequest request, HttpServletResponse response, DataGrid dataGrid) {
		CriteriaQuery cq = new CriteriaQuery(MetabaseDeMasterEntity.class, dataGrid);
		//查询条件组装器
		org.jeecgframework.core.extend.hqlsearch.HqlGenerateUtil.installHql(cq, metabaseDeMaster, request.getParameterMap());
		this.metabaseDeMasterService.getDataGridReturn(cq, true);
		TagUtil.datagrid(response, dataGrid);
	}

	/**
	 * 删除元数据 管理
	 * 
	 * @return
	 */
	@RequestMapping(params = "del")
	@ResponseBody
	public AjaxJson del(MetabaseDeMasterEntity metabaseDeMaster, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		metabaseDeMaster = systemService.getEntity(MetabaseDeMasterEntity.class, metabaseDeMaster.getId());
		message = "元数据 管理删除成功";
		metabaseDeMasterService.delete(metabaseDeMaster);
		systemService.addLog(message, Globals.Log_Type_DEL, Globals.Log_Leavel_INFO);
		
		j.setMsg(message);
		return j;
	}


	/**
	 * 添加元数据 管理
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(params = "save")
	@ResponseBody
	public AjaxJson save(MetabaseDeMasterEntity metabaseDeMaster, HttpServletRequest request) {
		String message = null;
		AjaxJson j = new AjaxJson();
		if (StringUtil.isNotEmpty(metabaseDeMaster.getId())) {
			message = "元数据 管理更新成功";
			MetabaseDeMasterEntity t = metabaseDeMasterService.get(MetabaseDeMasterEntity.class, metabaseDeMaster.getId());
			try {
				MyBeanUtils.copyBeanNotNull2Bean(metabaseDeMaster, t);
				metabaseDeMasterService.saveOrUpdate(t);
				systemService.addLog(message, Globals.Log_Type_UPDATE, Globals.Log_Leavel_INFO);
			} catch (Exception e) {
				e.printStackTrace();
				message = "元数据 管理更新失败";
			}
		} else {
			message = "元数据 管理添加成功";
			metabaseDeMasterService.save(metabaseDeMaster);
			systemService.addLog(message, Globals.Log_Type_INSERT, Globals.Log_Leavel_INFO);
		}
		j.setMsg(message);
		return j;
	}

	/**
	 * 元数据 管理列表页面跳转
	 * 
	 * @return
	 */
	@RequestMapping(params = "addorupdate")
	public ModelAndView addorupdate(MetabaseDeMasterEntity metabaseDeMaster, HttpServletRequest req) {
		if (StringUtil.isNotEmpty(metabaseDeMaster.getId())) {
			metabaseDeMaster = metabaseDeMasterService.getEntity(MetabaseDeMasterEntity.class, metabaseDeMaster.getId());
			req.setAttribute("metabaseDeMasterPage", metabaseDeMaster);
		}
		return new ModelAndView("com/winning/metabox/metabaseDeMaster");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<MetabaseDeMasterEntity> list() {
		List<MetabaseDeMasterEntity> listMetabaseDeMasters=metabaseDeMasterService.getList(MetabaseDeMasterEntity.class);
		return listMetabaseDeMasters;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> get(@PathVariable("id") String id) {
		MetabaseDeMasterEntity task = metabaseDeMasterService.get(MetabaseDeMasterEntity.class, id);
		if (task == null) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(task, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<?> create(@RequestBody MetabaseDeMasterEntity metabaseDeMaster, UriComponentsBuilder uriBuilder) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<MetabaseDeMasterEntity>> failures = validator.validate(metabaseDeMaster);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		metabaseDeMasterService.save(metabaseDeMaster);

		//按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
		String id = metabaseDeMaster.getId();
		URI uri = uriBuilder.path("/rest/metabaseDeMasterController/" + id).build().toUri();
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(uri);

		return new ResponseEntity(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> update(@RequestBody MetabaseDeMasterEntity metabaseDeMaster) {
		//调用JSR303 Bean Validator进行校验，如果出错返回含400错误码及json格式的错误信息.
		Set<ConstraintViolation<MetabaseDeMasterEntity>> failures = validator.validate(metabaseDeMaster);
		if (!failures.isEmpty()) {
			return new ResponseEntity(BeanValidators.extractPropertyAndMessage(failures), HttpStatus.BAD_REQUEST);
		}

		//保存
		metabaseDeMasterService.saveOrUpdate(metabaseDeMaster);

		//按Restful约定，返回204状态码, 无内容. 也可以返回200状态码.
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		metabaseDeMasterService.deleteEntityById(MetabaseDeMasterEntity.class, id);
	}
}
