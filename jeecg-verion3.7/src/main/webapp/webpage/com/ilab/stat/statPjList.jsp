<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:base type="jquery,easyui,tools,DatePicker"></t:base>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:0px;border:0px">
  <t:datagrid name="statPjList" title="评价指标" actionUrl="statPjController.do?datagrid" idField="id" fit="true" queryMode="single" fitColumns="false">
   <t:dgCol title="编号" field="id" hidden="true"></t:dgCol>
   <t:dgCol title="患者姓名" field="pname"   width="120" query="true" frozenColumn="true"></t:dgCol>
   <t:dgCol title="住院号" field="jzlsh"   width="120" query="true" frozenColumn="true"></t:dgCol>
   <t:dgCol title="入院时间" field="rysj" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="出院时间" field="cysj" formatter="yyyy-MM-dd hh:mm:ss"  width="120"></t:dgCol>
   <t:dgCol title="ABCD2评分（出院时）                            " field="filed1"   width="120"></t:dgCol>
   <t:dgCol title="急诊45分钟内完成头颅CT检查                     " field="filed2"   width="120"></t:dgCol>
   <t:dgCol title="急诊就诊在45分钟内获得临床实验室               " field="filed3"   width="120"></t:dgCol>
   <t:dgCol title="发病3-4.5小时以内rt-PA静脉溶栓治疗             " field="filed4"   width="120"></t:dgCol>
   <t:dgCol title="发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗" field="filed5"   width="120"></t:dgCol>
   <t:dgCol title="入院48小时内阿司匹林或其他抗血小板药物治疗     " field="filed6"   width="120"></t:dgCol>
   <t:dgCol title="预防深静脉血栓                                 " field="filed7"   width="120"></t:dgCol>
   <t:dgCol title="住院1周内接受血管评价                          " field="filed8"   width="120"></t:dgCol>
   <t:dgCol title="入院时合并高血压的脑出血患者降压治疗           " field="filed9"   width="120"></t:dgCol>
   <t:dgCol title="入院时合并高血压的脑梗死患者降压治疗           " field="filed10"   width="120"></t:dgCol>
   <t:dgCol title="住院期间患者使用他汀类药物治疗                 " field="filed11"   width="120"></t:dgCol>
   <t:dgCol title="出院时给予抗栓治疗                             " field="filed12"   width="120"></t:dgCol>
   <t:dgCol title="出院时合并高血压的脑出血患者降压治疗           " field="filed13"   width="120"></t:dgCol>
   <t:dgCol title="出院时合并高血压的脑梗死患者降压治疗           " field="filed14"   width="120"></t:dgCol>
   <t:dgCol title="出院时给予他汀类药物治疗                       " field="filed15"   width="120"></t:dgCol>
   <t:dgCol title="出院时合并糖尿病患者使用降糖药物               " field="filed16"   width="120"></t:dgCol>
   <t:dgCol title="出院时房颤患者给予抗凝治疗                     " field="filed17"   width="120"></t:dgCol>
   <t:dgCol title="非房颤患者抗凝治疗                             " field="filed18"   width="120"></t:dgCol>
   <t:dgCol title="康复治疗                                       " field="filed19"   width="120"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="statPjController.do?del&id={id}" urlclass="ace_button"  urlfont="fa-trash-o"/>
   <t:dgToolBar title="录入" icon="icon-add" url="statPjController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="statPjController.do?addorupdate" funname="update"></t:dgToolBar>
     <t:dgToolBar title="Excel导入" icon="icon-put" funname="ImportXls"></t:dgToolBar>
   <t:dgToolBar title="Excel导出" icon="icon-putout" funname="ExportXls"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>