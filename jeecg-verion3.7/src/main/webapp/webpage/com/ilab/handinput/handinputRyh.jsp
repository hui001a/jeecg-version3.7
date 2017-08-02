<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>出院时评价</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
  <body style="overflow-x: hidden">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="handinputRyhController.do?save">
			<input id="id" name="id" type="hidden" value="${handinputRyhPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							患者姓名:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="pname" name="pname" ignore="ignore"  value="${handinputRyhPage.pname}" />
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
						<input class="inputxt" id="jzlsh" name="jzlsh" ignore="ignore"  value="${handinputRyhPage.jzlsh}" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="rysj" name="rysj" ignore="ignore"    value="<fmt:formatDate value='${handinputRyhPage.rysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="cysj" name="cysj" ignore="ignore"    value="<fmt:formatDate value='${handinputRyhPage.cysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时合并高血压的脑梗死患者降压治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed1" name="filed1" ignore="ignore"  value="${handinputRyhPage.filed1}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时给予他汀类药物治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed2" name="filed2" ignore="ignore"  value="${handinputRyhPage.filed2}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时合并糖尿病患者使用降糖药物:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed3" name="filed3" ignore="ignore"  value="${handinputRyhPage.filed3}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时房颤患者给予抗凝治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed4" name="filed4" ignore="ignore"  value="${handinputRyhPage.filed4}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							非房颤患者抗凝治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed5" name="filed5" ignore="ignore"  value="${handinputRyhPage.filed5}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							康复治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed6" name="filed6" ignore="ignore"  value="${handinputRyhPage.filed6}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>