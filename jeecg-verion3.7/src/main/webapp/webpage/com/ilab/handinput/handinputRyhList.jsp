<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="handinputRyhList" title="出院评价" actionUrl="handinputRyhController.do?datagrid" idField="id" fit="true" queryMode="single" fitColumns="false">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="患者姓名" field="pname"   width="100" query="true"></t:dgCol>
   <t:dgCol title="住院号" field="jzlsh"   width="100" query="true"></t:dgCol>
   <t:dgCol title="入院时间" field="rysj" formatter="yyyy-MM-dd hh:mm:ss"  width="100"></t:dgCol>
   <t:dgCol title="间" field="cysj" formatter="yyyy-MM-dd hh:mm:ss"  width="100"></t:dgCol>
   <t:dgCol title="合并高血压的脑梗死患者降压治疗" field="filed1"   width="200"></t:dgCol>
   <t:dgCol title="给予他汀类药物治疗" field="filed2"   width="120"></t:dgCol>
   <t:dgCol title="合并糖尿病患者使用降糖药物" field="filed3"   width="200"></t:dgCol>
   <t:dgCol title="房颤患者给予抗凝治疗" field="filed4"   width="180"></t:dgCol>
   <t:dgCol title="非房颤患者抗凝治疗" field="filed5"   width="120"></t:dgCol>
   <t:dgCol title="康复治疗" field="filed6"   width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="handinputRyhController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="handinputRyhController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="handinputRyhController.do?addorupdate" funname="update"></t:dgToolBar>
      <t:dgToolBar title="Excel导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="Excel导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>