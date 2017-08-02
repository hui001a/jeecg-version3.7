<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>评价指标</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
  <body style="overflow-x: hidden">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="statPjController.do?save">
			<input id="id" name="id" type="hidden" value="${statPjPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							患者姓名:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="pname" name="pname" ignore="ignore"  value="${statPjPage.pname}" />
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
						<input class="inputxt" id="jzlsh" name="jzlsh" ignore="ignore"  value="${statPjPage.jzlsh}" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="rysj" name="rysj" ignore="ignore"    value="<fmt:formatDate value='${statPjPage.rysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="cysj" name="cysj" ignore="ignore"    value="<fmt:formatDate value='${statPjPage.cysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							ABCD2评分（出院时）                            :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed1" name="filed1" ignore="ignore"  value="${statPjPage.filed1}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							急诊45分钟内完成头颅CT检查                     :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed2" name="filed2" ignore="ignore"  value="${statPjPage.filed2}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							急诊就诊在45分钟内获得临床实验室               :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed3" name="filed3" ignore="ignore"  value="${statPjPage.filed3}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发病3-4.5小时以内rt-PA静脉溶栓治疗             :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed4" name="filed4" ignore="ignore"  value="${statPjPage.filed4}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed5" name="filed5" ignore="ignore"  value="${statPjPage.filed5}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院48小时内阿司匹林或其他抗血小板药物治疗     :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed6" name="filed6" ignore="ignore"  value="${statPjPage.filed6}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							预防深静脉血栓                                 :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed7" name="filed7" ignore="ignore"  value="${statPjPage.filed7}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							住院1周内接受血管评价                          :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed8" name="filed8" ignore="ignore"  value="${statPjPage.filed8}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院时合并高血压的脑出血患者降压治疗           :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed9" name="filed9" ignore="ignore"  value="${statPjPage.filed9}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入院时合并高血压的脑梗死患者降压治疗           :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed10" name="filed10" ignore="ignore"  value="${statPjPage.filed10}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							住院期间患者使用他汀类药物治疗                 :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed11" name="filed11" ignore="ignore"  value="${statPjPage.filed11}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时给予抗栓治疗                             :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed12" name="filed12" ignore="ignore"  value="${statPjPage.filed12}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时合并高血压的脑出血患者降压治疗           :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed13" name="filed13" ignore="ignore"  value="${statPjPage.filed13}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时合并高血压的脑梗死患者降压治疗           :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed14" name="filed14" ignore="ignore"  value="${statPjPage.filed14}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时给予他汀类药物治疗                       :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed15" name="filed15" ignore="ignore"  value="${statPjPage.filed15}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时合并糖尿病患者使用降糖药物               :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed16" name="filed16" ignore="ignore"  value="${statPjPage.filed16}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							出院时房颤患者给予抗凝治疗                     :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed17" name="filed17" ignore="ignore"  value="${statPjPage.filed17}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							非房颤患者抗凝治疗                             :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed18" name="filed18" ignore="ignore"  value="${statPjPage.filed18}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							康复治疗                                       :
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed19" name="filed19" ignore="ignore"  value="${statPjPage.filed19}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>