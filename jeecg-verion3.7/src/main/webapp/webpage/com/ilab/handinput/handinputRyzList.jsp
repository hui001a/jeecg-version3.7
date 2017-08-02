<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="handinputRyzList" title="住院期评价" actionUrl="handinputRyzController.do?datagrid" idField="id" fit="true" queryMode="single" fitColumns="false">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="患者姓名" field="pname"   width="100" query="true"></t:dgCol>
   <t:dgCol title="住院号" field="jzlsh"   width="100" query="true"></t:dgCol>
   <t:dgCol title="入院时间" field="rysj" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="出院时间" field="cysj" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="住院期间患者使用他汀类药物治疗" field="filed1"   width="200"></t:dgCol>
   <t:dgCol title="预防深静脉血栓" field="filed2"   width="120"></t:dgCol>
   <t:dgCol title="住院1周内接受血管评价" field="filed3"   width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="handinputRyzController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="handinputRyzController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="handinputRyzController.do?addorupdate" funname="update"></t:dgToolBar>
      <t:dgToolBar title="Excel导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="Excel导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>