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
 * @Description: 检查指标
 * @author zhangdaihao
 * @date 2017-07-19 22:54:48
 * @version V1.0   
 *
 */
@Entity
@Table(name = "hosp2_stat_ris", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class StatRisEntity implements java.io.Serializable {
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
	/**头颅CT     */
	private java.lang.String filed1;
	/**颅颈CTA    */
	private java.lang.String filed2;
	/**头颅MR     */
	private java.lang.String filed3;
	/**头颅MRA    */
	private java.lang.String filed4;
	/**颈动脉彩超 */
	private java.lang.String filed5;
	/**椎动脉彩超 */
	private java.lang.String filed6;
	/**TCD        */
	private java.lang.String filed7;
	
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
	 *@return: java.lang.String  头颅CT     
	 */
	@Column(name ="FILED_1",nullable=true,length=32)
	public java.lang.String getFiled1(){
		return this.filed1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  头颅CT     
	 */
	public void setFiled1(java.lang.String filed1){
		this.filed1 = filed1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  颅颈CTA    
	 */
	@Column(name ="FILED_2",nullable=true,length=32)
	public java.lang.String getFiled2(){
		return this.filed2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  颅颈CTA    
	 */
	public void setFiled2(java.lang.String filed2){
		this.filed2 = filed2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  头颅MR     
	 */
	@Column(name ="FILED_3",nullable=true,length=32)
	public java.lang.String getFiled3(){
		return this.filed3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  头颅MR     
	 */
	public void setFiled3(java.lang.String filed3){
		this.filed3 = filed3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  头颅MRA    
	 */
	@Column(name ="FILED_4",nullable=true,length=32)
	public java.lang.String getFiled4(){
		return this.filed4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  头颅MRA    
	 */
	public void setFiled4(java.lang.String filed4){
		this.filed4 = filed4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  颈动脉彩超 
	 */
	@Column(name ="FILED_5",nullable=true,length=32)
	public java.lang.String getFiled5(){
		return this.filed5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  颈动脉彩超 
	 */
	public void setFiled5(java.lang.String filed5){
		this.filed5 = filed5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  椎动脉彩超 
	 */
	@Column(name ="FILED_6",nullable=true,length=32)
	public java.lang.String getFiled6(){
		return this.filed6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  椎动脉彩超 
	 */
	public void setFiled6(java.lang.String filed6){
		this.filed6 = filed6;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  TCD        
	 */
	@Column(name ="FILED_7",nullable=true,length=32)
	public java.lang.String getFiled7(){
		return this.filed7;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  TCD        
	 */
	public void setFiled7(java.lang.String filed7){
		this.filed7 = filed7;
	}
}
