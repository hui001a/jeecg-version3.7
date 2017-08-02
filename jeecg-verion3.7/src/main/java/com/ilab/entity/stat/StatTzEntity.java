package com.ilab.entity.stat;

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
 * @Description: 体征指标
 * @author zhangdaihao
 * @date 2017-07-19 22:54:21
 * @version V1.0   
 *
 */
@Entity
@Table(name = "hosp2_stat_tz", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class StatTzEntity implements java.io.Serializable {
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
	/**入院时血压        */
	private java.lang.String filed1;
	/**出院时血压        */
	private java.lang.String filed2;
	/**入院时血脂        */
	private java.lang.String filed3;
	/**入院时血糖        */
	private java.lang.String filed4;
	/**入院时糖化血红蛋白*/
	private java.lang.String filed5;
	/**出院时血糖        */
	private java.lang.String filed6;
	/**出院时糖化血红蛋白*/
	private java.lang.String filed7;
	/**入院时血液流变学  */
	private java.lang.String filed8;
	/**出院时血液流变学  */
	private java.lang.String filed9;
	
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
	 *@return: java.lang.String  入院时血压        
	 */
	@Column(name ="FILED_1",nullable=true,length=32)
	public java.lang.String getFiled1(){
		return this.filed1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时血压        
	 */
	public void setFiled1(java.lang.String filed1){
		this.filed1 = filed1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时血压        
	 */
	@Column(name ="FILED_2",nullable=true,length=32)
	public java.lang.String getFiled2(){
		return this.filed2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时血压        
	 */
	public void setFiled2(java.lang.String filed2){
		this.filed2 = filed2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院时血脂        
	 */
	@Column(name ="FILED_3",nullable=true,length=32)
	public java.lang.String getFiled3(){
		return this.filed3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时血脂        
	 */
	public void setFiled3(java.lang.String filed3){
		this.filed3 = filed3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院时血糖        
	 */
	@Column(name ="FILED_4",nullable=true,length=32)
	public java.lang.String getFiled4(){
		return this.filed4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时血糖        
	 */
	public void setFiled4(java.lang.String filed4){
		this.filed4 = filed4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院时糖化血红蛋白
	 */
	@Column(name ="FILED_5",nullable=true,length=32)
	public java.lang.String getFiled5(){
		return this.filed5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时糖化血红蛋白
	 */
	public void setFiled5(java.lang.String filed5){
		this.filed5 = filed5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时血糖        
	 */
	@Column(name ="FILED_6",nullable=true,length=32)
	public java.lang.String getFiled6(){
		return this.filed6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时血糖        
	 */
	public void setFiled6(java.lang.String filed6){
		this.filed6 = filed6;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时糖化血红蛋白
	 */
	@Column(name ="FILED_7",nullable=true,length=32)
	public java.lang.String getFiled7(){
		return this.filed7;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时糖化血红蛋白
	 */
	public void setFiled7(java.lang.String filed7){
		this.filed7 = filed7;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院时血液流变学  
	 */
	@Column(name ="FILED_8",nullable=true,length=32)
	public java.lang.String getFiled8(){
		return this.filed8;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时血液流变学  
	 */
	public void setFiled8(java.lang.String filed8){
		this.filed8 = filed8;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时血液流变学  
	 */
	@Column(name ="FILED_9",nullable=true,length=32)
	public java.lang.String getFiled9(){
		return this.filed9;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时血液流变学  
	 */
	public void setFiled9(java.lang.String filed9){
		this.filed9 = filed9;
	}
}
