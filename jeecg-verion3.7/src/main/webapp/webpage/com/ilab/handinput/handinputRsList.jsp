<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="handinputRsList" title="溶栓评定" actionUrl="handinputRsController.do?datagrid" idField="id" fit="true" fitColumns="false" queryMode="single">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="患者姓名" field="pname"   width="80" query="true" frozenColumn="true"></t:dgCol>
   <t:dgCol title="住院号" field="jzlsh"   width="80" query="true" frozenColumn="true"></t:dgCol>
   <t:dgCol title="入院时间" field="rysj" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="出院时间" field="cysj" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="入急诊时间" field="filed1"   width="180"></t:dgCol>
   <t:dgCol title="完成CT检查时间" field="filed2" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="急诊45分钟内完成头颅CT检查" field="filed3"   width="180"></t:dgCol>
   <t:dgCol title="完成检验报告时间" field="filed4" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="急诊45分钟内获得检验报告" field="filed5"   width="180"></t:dgCol>
   <t:dgCol title="发病时间" field="filed6" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="开始rt-PA静脉溶栓治疗时间" field="filed7"   width="180"></t:dgCol>
   <t:dgCol title="发病3-4.5小时以内rt-PA静脉溶栓治疗" field="filed8"   width="200"></t:dgCol>
   <t:dgCol title="发病时间" field="filed9" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="开始rt-PA静脉溶栓治疗时间" field="filed10" formatter="yyyy-MM-dd hh:mm:ss"  width="180"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="handinputRsController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="handinputRsController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="handinputRsController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="Excel导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="Excel导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>