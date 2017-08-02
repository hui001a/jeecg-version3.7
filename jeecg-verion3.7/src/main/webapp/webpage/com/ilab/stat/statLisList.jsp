<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="statLisList" title="检验指标" actionUrl="statLisController.do?datagrid" idField="id" fit="true" fitColumns="false" queryMode="single">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="患者姓名" field="pname"   width="120" query="true" frozenColumn="true"></t:dgCol>
   <t:dgCol title="住院号" field="jzlsh"   width="120" query="true" frozenColumn="true"></t:dgCol>
   <t:dgCol title="入院时间" field="rysj" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="出院时间" field="cysj" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="同型半胱氨酸    " field="filed1"   width="120"></t:dgCol>
   <t:dgCol title="凝血酶原时间    " field="filed2"   width="120"></t:dgCol>
   <t:dgCol title="凝血酶原活动度  " field="filed3"   width="120"></t:dgCol>
   <t:dgCol title="凝血酶原INR值   " field="filed4"   width="120"></t:dgCol>
   <t:dgCol title="纤维蛋白原      " field="filed5"   width="120"></t:dgCol>
   <t:dgCol title="部分凝血活酶时间" field="filed6"   width="120"></t:dgCol>
   <t:dgCol title="部分凝血活酶R值 " field="filed7"   width="120"></t:dgCol>
   <t:dgCol title="凝血酶时间      " field="filed8"   width="120"></t:dgCol>
   <t:dgCol title="凝血酶时间R值   " field="filed9"   width="120"></t:dgCol>
   <t:dgCol title="D-二聚体        " field="filed10"   width="120"></t:dgCol>
   <t:dgCol title="血常规          " field="filed11"   width="120"></t:dgCol>
   <t:dgCol title="血管炎症指标    " field="filed12"   width="120"></t:dgCol>
   <t:dgCol title="肿瘤指标        " field="filed13"   width="120"></t:dgCol>
   <t:dgCol title="免疫指标        " field="filed14"   width="120"></t:dgCol>
   <t:dgCol title="甲状腺指标      " field="filed15"   width="120"></t:dgCol>
   <t:dgCol title="传染病指标      " field="filed16"   width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="statLisController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="statLisController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="statLisController.do?addorupdate" funname="update"></t:dgToolBar>
     <t:dgToolBar title="Excel导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="Excel导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>