<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>数据集元模型</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
  <body style="overflow-x: hidden">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="metaboxDatasetMasterController.do?save">
			<input id="id" name="id" type="hidden" value="${metaboxDatasetMasterPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							元数据类型:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="metadataCategory" name="metadataCategory"   value="${metaboxDatasetMasterPage.metadataCategory}" datatype="*" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							中文名称:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="cname" name="cname"   value="${metaboxDatasetMasterPage.cname}" datatype="*" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							英文名称:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="ename" name="ename" ignore="ignore"  value="${metaboxDatasetMasterPage.ename}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							元数据标识符:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="metadataId" name="metadataId"   value="${metaboxDatasetMasterPage.metadataId}" datatype="*" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							卫宁元数据标识符:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="winningMetadataId" name="winningMetadataId" ignore="ignore"  value="${metaboxDatasetMasterPage.winningMetadataId}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							版本号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="version" name="version"   value="${metaboxDatasetMasterPage.version}" datatype="*" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							同义名称:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="synNames" name="synNames" ignore="ignore"  value="${metaboxDatasetMasterPage.synNames}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							语境:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="context" name="context" ignore="ignore"  value="${metaboxDatasetMasterPage.context}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							定义:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="definition" name="definition" ignore="ignore"  value="${metaboxDatasetMasterPage.definition}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							分类模式:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="classScheme" name="classScheme" ignore="ignore"  value="${metaboxDatasetMasterPage.classScheme}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							关键字:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="keywords" name="keywords" ignore="ignore"  value="${metaboxDatasetMasterPage.keywords}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							表示形式:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dataRepresent" name="dataRepresent" ignore="ignore"  value="${metaboxDatasetMasterPage.dataRepresent}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							数据类型:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dataType" name="dataType" ignore="ignore"  value="${metaboxDatasetMasterPage.dataType}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							最小长度:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="minLength" name="minLength" ignore="ignore"  value="${metaboxDatasetMasterPage.minLength}" datatype="n" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							最大长度:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="maxLength" name="maxLength" ignore="ignore"  value="${metaboxDatasetMasterPage.maxLength}" datatype="n" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							表示格式:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dataFormat" name="dataFormat" ignore="ignore"  value="${metaboxDatasetMasterPage.dataFormat}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							计量单位:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="unitOfMeasure" name="unitOfMeasure" ignore="ignore"  value="${metaboxDatasetMasterPage.unitOfMeasure}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							值域:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="vdId" name="vdId" ignore="ignore"  value="${metaboxDatasetMasterPage.vdId}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							数据元概念:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dacId" name="dacId" ignore="ignore"  value="${metaboxDatasetMasterPage.dacId}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							对象类:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="objectId" name="objectId" ignore="ignore"  value="${metaboxDatasetMasterPage.objectId}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							删除标记:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="delflag" name="delflag" ignore="ignore"  value="${metaboxDatasetMasterPage.delflag}" datatype="n" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							删除时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="delDate" name="delDate" ignore="ignore"    value="<fmt:formatDate value='${metaboxDatasetMasterPage.delDate}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							注册状态:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="registStatus" name="registStatus"   value="${metaboxDatasetMasterPage.registStatus}" datatype="*" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							生效时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="cdcStartdate" name="cdcStartdate" ignore="ignore"    value="<fmt:formatDate value='${metaboxDatasetMasterPage.cdcStartdate}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							失效时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="cdcEnddate" name="cdcEnddate" ignore="ignore"    value="<fmt:formatDate value='${metaboxDatasetMasterPage.cdcEnddate}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							数据元来源:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="srcOfData" name="srcOfData" ignore="ignore"  value="${metaboxDatasetMasterPage.srcOfData}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							数据元内部标识符:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="innerId" name="innerId" ignore="ignore"  value="${metaboxDatasetMasterPage.innerId}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							允许值:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="allowData" name="allowData" ignore="ignore"  value="${metaboxDatasetMasterPage.allowData}" />
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>