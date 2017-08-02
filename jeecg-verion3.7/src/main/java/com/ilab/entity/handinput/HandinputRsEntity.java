package com.ilab.entity.handinput;

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
 * @Description: 溶栓评定
 * @author zhangdaihao
 * @date 2017-07-19 16:19:20
 * @version V1.0   
 *
 */
@Entity
@Table(name = "hosp2_handinput_rs", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class HandinputRsEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**患者姓名*/
	private java.lang.String pname;
	/**住院号*/
	private java.lang.String jzlsh;
	/**入院时间*/
	private java.util.Date rysj;
	/**出院时间*/
	private java.util.Date cysj;
	/**入急诊时间*/
	private java.lang.String filed1;
	/**完成CT检查时间*/
	private java.util.Date filed2;
	/**急诊45分钟内完成头颅CT检查*/
	private java.lang.String filed3;
	/**完成检验报告时间*/
	private java.util.Date filed4;
	/**急诊45分钟内获得检验报告*/
	private java.lang.String filed5;
	/**发病时间*/
	private java.util.Date filed6;
	/**开始rt-PA静脉溶栓治疗时间*/
	private java.lang.String filed7;
	/**发病3-4.5小时以内rt-PA静脉溶栓治疗*/
	private java.lang.String filed8;
	/**发病时间*/
	private java.util.Date filed9;
	/**开始rt-PA静脉溶栓治疗时间*/
	private java.util.Date filed10;
	/**发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗*/
	private java.lang.String filed11;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
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
	 *@return: java.lang.String  患者姓名
	 */
	@Column(name ="PNAME",nullable=true,length=32)
	public java.lang.String getPname(){
		return this.pname;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  患者姓名
	 */
	public void setPname(java.lang.String pname){
		this.pname = pname;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  住院号
	 */
	@Column(name ="JZLSH",nullable=true,length=32)
	public java.lang.String getJzlsh(){
		return this.jzlsh;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  住院号
	 */
	public void setJzlsh(java.lang.String jzlsh){
		this.jzlsh = jzlsh;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  入院时间
	 */
	@Column(name ="RYSJ",nullable=true)
	public java.util.Date getRysj(){
		return this.rysj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  入院时间
	 */
	public void setRysj(java.util.Date rysj){
		this.rysj = rysj;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  出院时间
	 */
	@Column(name ="CYSJ",nullable=true)
	public java.util.Date getCysj(){
		return this.cysj;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  出院时间
	 */
	public void setCysj(java.util.Date cysj){
		this.cysj = cysj;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入急诊时间
	 */
	@Column(name ="FILED_1",nullable=true,length=32)
	public java.lang.String getFiled1(){
		return this.filed1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入急诊时间
	 */
	public void setFiled1(java.lang.String filed1){
		this.filed1 = filed1;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  完成CT检查时间
	 */
	@Column(name ="FILED_2",nullable=true)
	public java.util.Date getFiled2(){
		return this.filed2;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  完成CT检查时间
	 */
	public void setFiled2(java.util.Date filed2){
		this.filed2 = filed2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  急诊45分钟内完成头颅CT检查
	 */
	@Column(name ="FILED_3",nullable=true,length=32)
	public java.lang.String getFiled3(){
		return this.filed3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  急诊45分钟内完成头颅CT检查
	 */
	public void setFiled3(java.lang.String filed3){
		this.filed3 = filed3;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  完成检验报告时间
	 */
	@Column(name ="FILED_4",nullable=true)
	public java.util.Date getFiled4(){
		return this.filed4;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  完成检验报告时间
	 */
	public void setFiled4(java.util.Date filed4){
		this.filed4 = filed4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  急诊45分钟内获得检验报告
	 */
	@Column(name ="FILED_5",nullable=true,length=32)
	public java.lang.String getFiled5(){
		return this.filed5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  急诊45分钟内获得检验报告
	 */
	public void setFiled5(java.lang.String filed5){
		this.filed5 = filed5;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  发病时间
	 */
	@Column(name ="FILED_6",nullable=true)
	public java.util.Date getFiled6(){
		return this.filed6;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  发病时间
	 */
	public void setFiled6(java.util.Date filed6){
		this.filed6 = filed6;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  开始rt-PA静脉溶栓治疗时间
	 */
	@Column(name ="FILED_7",nullable=true,length=32)
	public java.lang.String getFiled7(){
		return this.filed7;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  开始rt-PA静脉溶栓治疗时间
	 */
	public void setFiled7(java.lang.String filed7){
		this.filed7 = filed7;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发病3-4.5小时以内rt-PA静脉溶栓治疗
	 */
	@Column(name ="FILED_8",nullable=true,length=32)
	public java.lang.String getFiled8(){
		return this.filed8;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发病3-4.5小时以内rt-PA静脉溶栓治疗
	 */
	public void setFiled8(java.lang.String filed8){
		this.filed8 = filed8;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  发病时间
	 */
	@Column(name ="FILED_9",nullable=true)
	public java.util.Date getFiled9(){
		return this.filed9;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  发病时间
	 */
	public void setFiled9(java.util.Date filed9){
		this.filed9 = filed9;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  开始rt-PA静脉溶栓治疗时间
	 */
	@Column(name ="FILED_10",nullable=true)
	public java.util.Date getFiled10(){
		return this.filed10;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  开始rt-PA静脉溶栓治疗时间
	 */
	public void setFiled10(java.util.Date filed10){
		this.filed10 = filed10;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗
	 */
	@Column(name ="FILED_11",nullable=true,length=32)
	public java.lang.String getFiled11(){
		return this.filed11;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗
	 */
	public void setFiled11(java.lang.String filed11){
		this.filed11 = filed11;
	}
}
