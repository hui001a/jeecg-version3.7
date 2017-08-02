<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="metabaseDeMasterList" title="数据源管理" actionUrl="metabaseDeMasterController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="元数据类型" field="metadataCategory"   width="120"></t:dgCol>
   <t:dgCol title="中文名称" field="cname"   width="120"></t:dgCol>
   <t:dgCol title="英文名称" field="ename"   width="120"></t:dgCol>
   <t:dgCol title="元数据标识符" field="metadataId"   width="120"></t:dgCol>
   <t:dgCol title="版本号" field="version"   width="120"></t:dgCol>
   <t:dgCol title="同义名称" field="synNames"   width="120"></t:dgCol>
   <t:dgCol title="语境" field="context"   width="120"></t:dgCol>
   <t:dgCol title="定义" field="definition"   width="120"></t:dgCol>
   <t:dgCol title="分类模式" field="classScheme"   width="120"></t:dgCol>
   <t:dgCol title="关键字" field="keywords"   width="120"></t:dgCol>
   <t:dgCol title="表示形式" field="dataRepresent"   width="120"></t:dgCol>
   <t:dgCol title="数据类型" field="dataType"   width="120"></t:dgCol>
   <t:dgCol title="最小长度" field="minLength"   width="120"></t:dgCol>
   <t:dgCol title="最大长度" field="maxLength"   width="120"></t:dgCol>
   <t:dgCol title="表示格式" field="dataFormat"   width="120"></t:dgCol>
   <t:dgCol title="计量单位" field="unitOfMeasure"   width="120"></t:dgCol>
   <t:dgCol title="值域" field="vdId"   width="120"></t:dgCol>
   <t:dgCol title="数据元概念" field="dacId"   width="120"></t:dgCol>
   <t:dgCol title="对象类" field="objectId"   width="120"></t:dgCol>
   <t:dgCol title="删除标记" field="delflag"   width="120"></t:dgCol>
   <t:dgCol title="删除时间" field="delDate" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="注册状态" field="registStatus"   width="120"></t:dgCol>
   <t:dgCol title="生效时间" field="cdcStartdate" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="失效时间" field="cdcEnddate" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="metabaseDeMasterController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="metabaseDeMasterController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="metabaseDeMasterController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="metabaseDeMasterController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>