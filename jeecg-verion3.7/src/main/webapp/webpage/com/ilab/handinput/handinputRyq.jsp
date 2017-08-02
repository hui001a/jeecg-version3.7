<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>入院前评价</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
  <body style="overflow-x: hidden">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="handinputRyqController.do?save">
			<input id="id" name="id" type="hidden" value="${handinputRyqPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							患者姓名:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="pname" name="pname" ignore="ignore"  value="${handinputRyqPage.pname}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							住院号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="jzlsh" name="jzlsh" ignore="ignore"  value="${handinputRyqPage.jzlsh}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="rysj" name="rysj" ignore="ignore"    value="<fmt:formatDate value='${handinputRyqPage.rysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="cysj" name="cysj" ignore="ignore"    value="<fmt:formatDate value='${handinputRyqPage.cysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院48小时内阿司匹林或其他抗血小板药物治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed1" name="filed1" ignore="ignore"  value="${handinputRyqPage.filed1}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							预防深静脉血栓:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed2" name="filed2" ignore="ignore"  value="${handinputRyqPage.filed2}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							住院1周内接受血管评价:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed3" name="filed3" ignore="ignore"  value="${handinputRyqPage.filed3}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院时合并高血压的脑出血患者降压治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed4" name="filed4" ignore="ignore"  value="${handinputRyqPage.filed4}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院时合并高血压的脑梗死患者降压治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed5" name="filed5" ignore="ignore"  value="${handinputRyqPage.filed5}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>