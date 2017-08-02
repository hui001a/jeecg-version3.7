<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="metaboxDatasetMasterList" title="数据集元模型" actionUrl="metaboxDatasetMasterController.do?datagrid&method=${method}" idField="id" fit="true" fitColumns="true">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="中文名称" field="cname"   width="120"></t:dgCol>
   <t:dgCol title="元数据标识符" field="metadataId"   width="120"></t:dgCol>
   <t:dgCol title="卫宁元数据标识符" field="winningMetadataId"   width="120"></t:dgCol>
   <t:dgCol title="版本号" field="version"   width="50"></t:dgCol>
   <t:dgCol title="定义" field="definition"   width="330"></t:dgCol>
   <t:dgCol title="数据类型" field="dataType"   width="50"></t:dgCol>
   <t:dgCol title="表示格式" field="dataFormat"   width="50"></t:dgCol>
  
   <t:dgCol title="操作" field="opt" width="50"></t:dgCol>
   <t:dgDelOpt title="删除" url="metaboxDatasetMasterController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="metaboxDatasetMasterController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="metaboxDatasetMasterController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="metaboxDatasetMasterController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>