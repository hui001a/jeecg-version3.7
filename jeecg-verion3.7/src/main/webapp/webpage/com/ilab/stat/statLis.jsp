<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>检验指标</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
  <body style="overflow-x: hidden">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="statLisController.do?save">
			<input id="id" name="id" type="hidden" value="${statLisPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							患者姓名:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="pname" name="pname" ignore="ignore"  value="${statLisPage.pname}" />
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
						<input class="inputxt" id="jzlsh" name="jzlsh" ignore="ignore"  value="${statLisPage.jzlsh}" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="rysj" name="rysj" ignore="ignore"    value="<fmt:formatDate value='${statLisPage.rysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="cysj" name="cysj" ignore="ignore"    value="<fmt:formatDate value='${statLisPage.cysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							同型半胱氨酸    :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed1" name="filed1" ignore="ignore"  value="${statLisPage.filed1}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							凝血酶原时间    :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed2" name="filed2" ignore="ignore"  value="${statLisPage.filed2}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							凝血酶原活动度  :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed3" name="filed3" ignore="ignore"  value="${statLisPage.filed3}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							凝血酶原INR值   :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed4" name="filed4" ignore="ignore"  value="${statLisPage.filed4}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							纤维蛋白原      :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed5" name="filed5" ignore="ignore"  value="${statLisPage.filed5}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							部分凝血活酶时间:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed6" name="filed6" ignore="ignore"  value="${statLisPage.filed6}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							部分凝血活酶R值 :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed7" name="filed7" ignore="ignore"  value="${statLisPage.filed7}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							凝血酶时间      :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed8" name="filed8" ignore="ignore"  value="${statLisPage.filed8}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							凝血酶时间R值   :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed9" name="filed9" ignore="ignore"  value="${statLisPage.filed9}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							D-二聚体        :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed10" name="filed10" ignore="ignore"  value="${statLisPage.filed10}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							血常规          :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed11" name="filed11" ignore="ignore"  value="${statLisPage.filed11}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							血管炎症指标    :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed12" name="filed12" ignore="ignore"  value="${statLisPage.filed12}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							肿瘤指标        :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed13" name="filed13" ignore="ignore"  value="${statLisPage.filed13}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							免疫指标        :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed14" name="filed14" ignore="ignore"  value="${statLisPage.filed14}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							甲状腺指标      :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed15" name="filed15" ignore="ignore"  value="${statLisPage.filed15}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							传染病指标      :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed16" name="filed16" ignore="ignore"  value="${statLisPage.filed16}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>