package com.winning.entity.metabox;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 数据元管理
 * @author zhangdaihao
 * @date 2017-07-11 13:32:20
 * @version V1.0   
 *
 */
@Entity
@Table(name = "metabox_de_master", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class MetaboxDeMasterEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**元数据类型*/
	private java.lang.String metadataCategory;
	/**中文名称*/
	private java.lang.String cname;
	/**英文名称*/
	private java.lang.String ename;
	/**元数据标识符*/
	private java.lang.String metadataId;
	/**卫宁元数据标识符*/
	private java.lang.String winningMetadataId;
	/**版本号*/
	private java.lang.String version;
	/**同义名称*/
	private java.lang.String synNames;
	/**语境*/
	private java.lang.String context;
	/**定义*/
	private java.lang.String definition;
	/**分类模式*/
	private java.lang.String classScheme;
	/**关键字*/
	private java.lang.String keywords;
	/**表示形式*/
	private java.lang.String dataRepresent;
	/**数据类型*/
	private java.lang.String dataType;
	/**最小长度*/
	private java.lang.Integer minLength;
	/**最大长度*/
	private java.lang.Integer maxLength;
	/**表示格式*/
	private java.lang.String dataFormat;
	/**计量单位*/
	private java.lang.String unitOfMeasure;
	/**值域*/
	private java.lang.String vdId;
	/**数据元概念*/
	private java.lang.String dacId;
	/**对象类*/
	private java.lang.String objectId;
	/**删除标记*/
	private java.lang.Integer delflag;
	/**删除时间*/
	private java.util.Date delDate;
	/**创建人*/
	private java.lang.String createBy;
	/**创建时间*/
	private java.util.Date createDate;
	/**注册状态*/
	private java.lang.String registStatus;
	/**更新人*/
	private java.lang.String updateBy;
	/**更新时间*/
	private java.util.Date updateDate;
	/**生效时间*/
	private java.util.Date cdcStartdate;
	/**失效时间*/
	private java.util.Date cdcEnddate;
	/**数据元来源*/
	private java.lang.String srcOfData;
	/**数据元内部标识符*/
	private java.lang.String innerId;
	/**允许值*/
	private java.lang.String allowData;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=36)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  元数据类型
	 */
	@Column(name ="METADATA_CATEGORY",nullable=false,length=32)
	public java.lang.String getMetadataCategory(){
		return this.metadataCategory;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  元数据类型
	 */
	public void setMetadataCategory(java.lang.String metadataCategory){
		this.metadataCategory = metadataCategory;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  中文名称
	 */
	@Column(name ="CNAME",nullable=false,length=32)
	public java.lang.String getCname(){
		return this.cname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  中文名称
	 */
	public void setCname(java.lang.String cname){
		this.cname = cname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  英文名称
	 */
	@Column(name ="ENAME",nullable=true,length=32)
	public java.lang.String getEname(){
		return this.ename;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  英文名称
	 */
	public void setEname(java.lang.String ename){
		this.ename = ename;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  元数据标识符
	 */
	@Column(name ="METADATA_ID",nullable=false,length=32)
	public java.lang.String getMetadataId(){
		return this.metadataId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  元数据标识符
	 */
	public void setMetadataId(java.lang.String metadataId){
		this.metadataId = metadataId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  卫宁元数据标识符
	 */
	@Column(name ="WINNING_METADATA_ID",nullable=true,length=32)
	public java.lang.String getWinningMetadataId(){
		return this.winningMetadataId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  卫宁元数据标识符
	 */
	public void setWinningMetadataId(java.lang.String winningMetadataId){
		this.winningMetadataId = winningMetadataId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  版本号
	 */
	@Column(name ="VERSION",nullable=false,length=32)
	public java.lang.String getVersion(){
		return this.version;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  版本号
	 */
	public void setVersion(java.lang.String version){
		this.version = version;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  同义名称
	 */
	@Column(name ="SYN_NAMES",nullable=true,length=32)
	public java.lang.String getSynNames(){
		return this.synNames;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  同义名称
	 */
	public void setSynNames(java.lang.String synNames){
		this.synNames = synNames;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  语境
	 */
	@Column(name ="CONTEXT",nullable=true,length=32)
	public java.lang.String getContext(){
		return this.context;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  语境
	 */
	public void setContext(java.lang.String context){
		this.context = context;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  定义
	 */
	@Column(name ="DEFINITION",nullable=true,length=200)
	public java.lang.String getDefinition(){
		return this.definition;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  定义
	 */
	public void setDefinition(java.lang.String definition){
		this.definition = definition;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  分类模式
	 */
	@Column(name ="CLASS_SCHEME",nullable=true,length=32)
	public java.lang.String getClassScheme(){
		return this.classScheme;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  分类模式
	 */
	public void setClassScheme(java.lang.String classScheme){
		this.classScheme = classScheme;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  关键字
	 */
	@Column(name ="KEYWORDS",nullable=true,length=128)
	public java.lang.String getKeywords(){
		return this.keywords;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  关键字
	 */
	public void setKeywords(java.lang.String keywords){
		this.keywords = keywords;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  表示形式
	 */
	@Column(name ="DATA_REPRESENT",nullable=false,length=32)
	public java.lang.String getDataRepresent(){
		return this.dataRepresent;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  表示形式
	 */
	public void setDataRepresent(java.lang.String dataRepresent){
		this.dataRepresent = dataRepresent;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据类型
	 */
	@Column(name ="DATA_TYPE",nullable=false,length=32)
	public java.lang.String getDataType(){
		return this.dataType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据类型
	 */
	public void setDataType(java.lang.String dataType){
		this.dataType = dataType;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  最小长度
	 */
	@Column(name ="MIN_LENGTH",nullable=true,precision=10,scale=0)
	public java.lang.Integer getMinLength(){
		return this.minLength;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  最小长度
	 */
	public void setMinLength(java.lang.Integer minLength){
		this.minLength = minLength;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  最大长度
	 */
	@Column(name ="MAX_LENGTH",nullable=true,precision=10,scale=0)
	public java.lang.Integer getMaxLength(){
		return this.maxLength;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  最大长度
	 */
	public void setMaxLength(java.lang.Integer maxLength){
		this.maxLength = maxLength;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  表示格式
	 */
	@Column(name ="DATA_FORMAT",nullable=true,length=10)
	public java.lang.String getDataFormat(){
		return this.dataFormat;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  表示格式
	 */
	public void setDataFormat(java.lang.String dataFormat){
		this.dataFormat = dataFormat;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  计量单位
	 */
	@Column(name ="UNIT_OF_MEASURE",nullable=true,length=32)
	public java.lang.String getUnitOfMeasure(){
		return this.unitOfMeasure;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  计量单位
	 */
	public void setUnitOfMeasure(java.lang.String unitOfMeasure){
		this.unitOfMeasure = unitOfMeasure;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  值域
	 */
	@Column(name ="VD_ID",nullable=true,length=32)
	public java.lang.String getVdId(){
		return this.vdId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  值域
	 */
	public void setVdId(java.lang.String vdId){
		this.vdId = vdId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据元概念
	 */
	@Column(name ="DAC_ID",nullable=true,length=32)
	public java.lang.String getDacId(){
		return this.dacId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据元概念
	 */
	public void setDacId(java.lang.String dacId){
		this.dacId = dacId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  对象类
	 */
	@Column(name ="OBJECT_ID",nullable=true,length=32)
	public java.lang.String getObjectId(){
		return this.objectId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  对象类
	 */
	public void setObjectId(java.lang.String objectId){
		this.objectId = objectId;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  删除标记
	 */
	@Column(name ="DELFLAG",nullable=true,precision=10,scale=0)
	public java.lang.Integer getDelflag(){
		return this.delflag;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  删除标记
	 */
	public void setDelflag(java.lang.Integer delflag){
		this.delflag = delflag;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  删除时间
	 */
	@Column(name ="DEL_DATE",nullable=true)
	public java.util.Date getDelDate(){
		return this.delDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  删除时间
	 */
	public void setDelDate(java.util.Date delDate){
		this.delDate = delDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  创建人
	 */
	@Column(name ="CREATE_BY",nullable=true,length=32)
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  创建人
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  创建时间
	 */
	@Column(name ="CREATE_DATE",nullable=true)
	public java.util.Date getCreateDate(){
		return this.createDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  创建时间
	 */
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  注册状态
	 */
	@Column(name ="REGIST_STATUS",nullable=false,length=32)
	public java.lang.String getRegistStatus(){
		return this.registStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  注册状态
	 */
	public void setRegistStatus(java.lang.String registStatus){
		this.registStatus = registStatus;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  更新人
	 */
	@Column(name ="UPDATE_BY",nullable=true,length=32)
	public java.lang.String getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  更新人
	 */
	public void setUpdateBy(java.lang.String updateBy){
		this.updateBy = updateBy;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  更新时间
	 */
	@Column(name ="UPDATE_DATE",nullable=true)
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  更新时间
	 */
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  生效时间
	 */
	@Column(name ="CDC_STARTDATE",nullable=true)
	public java.util.Date getCdcStartdate(){
		return this.cdcStartdate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  生效时间
	 */
	public void setCdcStartdate(java.util.Date cdcStartdate){
		this.cdcStartdate = cdcStartdate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  失效时间
	 */
	@Column(name ="CDC_ENDDATE",nullable=true)
	public java.util.Date getCdcEnddate(){
		return this.cdcEnddate;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  失效时间
	 */
	public void setCdcEnddate(java.util.Date cdcEnddate){
		this.cdcEnddate = cdcEnddate;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据元来源
	 */
	@Column(name ="SRC_OF_DATA",nullable=true,length=32)
	public java.lang.String getSrcOfData(){
		return this.srcOfData;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据元来源
	 */
	public void setSrcOfData(java.lang.String srcOfData){
		this.srcOfData = srcOfData;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  数据元内部标识符
	 */
	@Column(name ="INNER_ID",nullable=true,length=32)
	public java.lang.String getInnerId(){
		return this.innerId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  数据元内部标识符
	 */
	public void setInnerId(java.lang.String innerId){
		this.innerId = innerId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  允许值
	 */
	@Column(name ="ALLOW_DATA",nullable=true,length=200)
	public java.lang.String getAllowData(){
		return this.allowData;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  允许值
	 */
	public void setAllowData(java.lang.String allowData){
		this.allowData = allowData;
	}
}
