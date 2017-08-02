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
 * @Description: 检验指标
 * @author zhangdaihao
 * @date 2017-07-19 22:54:35
 * @version V1.0   
 *
 */
@Entity
@Table(name = "hosp2_stat_lis", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class StatLisEntity implements java.io.Serializable {
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
	/**同型半胱氨酸    */
	private java.lang.String filed1;
	/**凝血酶原时间    */
	private java.lang.String filed2;
	/**凝血酶原活动度  */
	private java.lang.String filed3;
	/**凝血酶原INR值   */
	private java.lang.String filed4;
	/**纤维蛋白原      */
	private java.lang.String filed5;
	/**部分凝血活酶时间*/
	private java.lang.String filed6;
	/**部分凝血活酶R值 */
	private java.lang.String filed7;
	/**凝血酶时间      */
	private java.lang.String filed8;
	/**凝血酶时间R值   */
	private java.lang.String filed9;
	/**D-二聚体        */
	private java.lang.String filed10;
	/**血常规          */
	private java.lang.String filed11;
	/**血管炎症指标    */
	private java.lang.String filed12;
	/**肿瘤指标        */
	private java.lang.String filed13;
	/**免疫指标        */
	private java.lang.String filed14;
	/**甲状腺指标      */
	private java.lang.String filed15;
	/**传染病指标      */
	private java.lang.String filed16;
	
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
	 *@return: java.lang.String  同型半胱氨酸    
	 */
	@Column(name ="FILED_1",nullable=true,length=32)
	public java.lang.String getFiled1(){
		return this.filed1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  同型半胱氨酸    
	 */
	public void setFiled1(java.lang.String filed1){
		this.filed1 = filed1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凝血酶原时间    
	 */
	@Column(name ="FILED_2",nullable=true,length=32)
	public java.lang.String getFiled2(){
		return this.filed2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凝血酶原时间    
	 */
	public void setFiled2(java.lang.String filed2){
		this.filed2 = filed2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凝血酶原活动度  
	 */
	@Column(name ="FILED_3",nullable=true,length=32)
	public java.lang.String getFiled3(){
		return this.filed3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凝血酶原活动度  
	 */
	public void setFiled3(java.lang.String filed3){
		this.filed3 = filed3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凝血酶原INR值   
	 */
	@Column(name ="FILED_4",nullable=true,length=32)
	public java.lang.String getFiled4(){
		return this.filed4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凝血酶原INR值   
	 */
	public void setFiled4(java.lang.String filed4){
		this.filed4 = filed4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  纤维蛋白原      
	 */
	@Column(name ="FILED_5",nullable=true,length=32)
	public java.lang.String getFiled5(){
		return this.filed5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  纤维蛋白原      
	 */
	public void setFiled5(java.lang.String filed5){
		this.filed5 = filed5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  部分凝血活酶时间
	 */
	@Column(name ="FILED_6",nullable=true,length=32)
	public java.lang.String getFiled6(){
		return this.filed6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  部分凝血活酶时间
	 */
	public void setFiled6(java.lang.String filed6){
		this.filed6 = filed6;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  部分凝血活酶R值 
	 */
	@Column(name ="FILED_7",nullable=true,length=32)
	public java.lang.String getFiled7(){
		return this.filed7;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  部分凝血活酶R值 
	 */
	public void setFiled7(java.lang.String filed7){
		this.filed7 = filed7;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凝血酶时间      
	 */
	@Column(name ="FILED_8",nullable=true,length=32)
	public java.lang.String getFiled8(){
		return this.filed8;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凝血酶时间      
	 */
	public void setFiled8(java.lang.String filed8){
		this.filed8 = filed8;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  凝血酶时间R值   
	 */
	@Column(name ="FILED_9",nullable=true,length=32)
	public java.lang.String getFiled9(){
		return this.filed9;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  凝血酶时间R值   
	 */
	public void setFiled9(java.lang.String filed9){
		this.filed9 = filed9;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  D-二聚体        
	 */
	@Column(name ="FILED_10",nullable=true,length=32)
	public java.lang.String getFiled10(){
		return this.filed10;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  D-二聚体        
	 */
	public void setFiled10(java.lang.String filed10){
		this.filed10 = filed10;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  血常规          
	 */
	@Column(name ="FILED_11",nullable=true,length=32)
	public java.lang.String getFiled11(){
		return this.filed11;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  血常规          
	 */
	public void setFiled11(java.lang.String filed11){
		this.filed11 = filed11;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  血管炎症指标    
	 */
	@Column(name ="FILED_12",nullable=true,length=32)
	public java.lang.String getFiled12(){
		return this.filed12;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  血管炎症指标    
	 */
	public void setFiled12(java.lang.String filed12){
		this.filed12 = filed12;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  肿瘤指标        
	 */
	@Column(name ="FILED_13",nullable=true,length=32)
	public java.lang.String getFiled13(){
		return this.filed13;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  肿瘤指标        
	 */
	public void setFiled13(java.lang.String filed13){
		this.filed13 = filed13;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  免疫指标        
	 */
	@Column(name ="FILED_14",nullable=true,length=32)
	public java.lang.String getFiled14(){
		return this.filed14;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  免疫指标        
	 */
	public void setFiled14(java.lang.String filed14){
		this.filed14 = filed14;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  甲状腺指标      
	 */
	@Column(name ="FILED_15",nullable=true,length=32)
	public java.lang.String getFiled15(){
		return this.filed15;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  甲状腺指标      
	 */
	public void setFiled15(java.lang.String filed15){
		this.filed15 = filed15;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  传染病指标      
	 */
	@Column(name ="FILED_16",nullable=true,length=32)
	public java.lang.String getFiled16(){
		return this.filed16;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  传染病指标      
	 */
	public void setFiled16(java.lang.String filed16){
		this.filed16 = filed16;
	}
}
