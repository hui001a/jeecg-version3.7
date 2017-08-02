<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>溶栓评定</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
     function fn(){
    	  $("#filed3 ").get(0).value= "是";
    	  $("#filed5 ").get(0).value= "是";
    	  $("#filed8 ").get(0).value= "否";
    	  $("#filed11 ").get(0).value= "是";
    	  $("#filed11 ").get(1).value= "否";
    	 
     }
  </script>
  
  
 </head>
  <body style="overflow-x: hidden">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="handinputRsController.do?save">
			<input id="id" name="id" type="hidden" value="${handinputRsPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							患者姓名:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="pname" name="pname" ignore="ignore"  value="${handinputRsPage.pname}" />
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
						<input class="inputxt" id="jzlsh" name="jzlsh" ignore="ignore"  value="${handinputRsPage.jzlsh}" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"   onchange="fn();" style="width: 150px" id="rysj" name="rysj" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.rysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
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
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"   onchange="fn();" style="width: 150px" id="cysj" name="cysj" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.cysj}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							入急诊时间:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed1" name="filed1" ignore="ignore"  value="${handinputRsPage.filed1}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							完成CT检查时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  onchange="fn();"  style="width: 150px" id="filed2" name="filed2" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.filed2}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							急诊45分钟内完成头颅CT检查:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed3" name="filed3" ignore="ignore"  value="${handinputRsPage.filed3}"  readonly="readonly"  style="background-color: #e6e6e6"/>
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							完成检验报告时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  onchange="fn();"  style="width: 150px" id="filed4" name="filed4" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.filed4}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							急诊45分钟内获得检验报告:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed5" name="filed5" ignore="ignore"  value="${handinputRsPage.filed5}"  readonly="readonly"  style="background-color: #e6e6e6"/>
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发病时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  onchange="fn();"  style="width: 150px" id="filed6" name="filed6" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.filed6}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							开始rt-PA静脉溶栓治疗时间:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed7" name="filed7" ignore="ignore"  value="${handinputRsPage.filed7}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发病3-4.5小时以内rt-PA静脉溶栓治疗:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed8" name="filed8" ignore="ignore"  value="${handinputRsPage.filed8}"  readonly="readonly"  style="background-color: #e6e6e6"/>
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							发病时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"   onchange="fn();" style="width: 150px" id="filed9" name="filed9" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.filed9}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							开始rt-PA静脉溶栓治疗时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"   onchange="fn();" style="width: 150px" id="filed10" name="filed10" ignore="ignore"    value="<fmt:formatDate value='${handinputRsPage.filed10}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							DAT时间:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="filed11" name="filed11" ignore="ignore"  value="${handinputRsPage.filed11}"  readonly="readonly"  style="background-color: #e6e6e6"/>
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
						<input class="inputxt" id="filed11" name="filed11" ignore="ignore"  value="${handinputRsPage.filed11}"  readonly="readonly"  style="background-color: #e6e6e6"/>
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>