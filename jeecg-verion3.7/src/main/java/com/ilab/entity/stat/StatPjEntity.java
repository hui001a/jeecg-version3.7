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
 * @Description: 评价指标
 * @author zhangdaihao
 * @date 2017-07-19 22:55:18
 * @version V1.0   
 *
 */
@Entity
@Table(name = "hosp2_stat_pj", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class StatPjEntity implements java.io.Serializable {
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
	/**ABCD2评分（出院时）                            */
	private java.lang.String filed1;
	/**急诊45分钟内完成头颅CT检查                     */
	private java.lang.String filed2;
	/**急诊就诊在45分钟内获得临床实验室               */
	private java.lang.String filed3;
	/**发病3-4.5小时以内rt-PA静脉溶栓治疗             */
	private java.lang.String filed4;
	/**发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗*/
	private java.lang.String filed5;
	/**入院48小时内阿司匹林或其他抗血小板药物治疗     */
	private java.lang.String filed6;
	/**预防深静脉血栓                                 */
	private java.lang.String filed7;
	/**住院1周内接受血管评价                          */
	private java.lang.String filed8;
	/**入院时合并高血压的脑出血患者降压治疗           */
	private java.lang.String filed9;
	/**入院时合并高血压的脑梗死患者降压治疗           */
	private java.lang.String filed10;
	/**住院期间患者使用他汀类药物治疗                 */
	private java.lang.String filed11;
	/**出院时给予抗栓治疗                             */
	private java.lang.String filed12;
	/**出院时合并高血压的脑出血患者降压治疗           */
	private java.lang.String filed13;
	/**出院时合并高血压的脑梗死患者降压治疗           */
	private java.lang.String filed14;
	/**出院时给予他汀类药物治疗                       */
	private java.lang.String filed15;
	/**出院时合并糖尿病患者使用降糖药物               */
	private java.lang.String filed16;
	/**出院时房颤患者给予抗凝治疗                     */
	private java.lang.String filed17;
	/**非房颤患者抗凝治疗                             */
	private java.lang.String filed18;
	/**康复治疗                                       */
	private java.lang.String filed19;
	
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
	 *@return: java.lang.String  ABCD2评分（出院时）                            
	 */
	@Column(name ="FILED_1",nullable=true,length=32)
	public java.lang.String getFiled1(){
		return this.filed1;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  ABCD2评分（出院时）                            
	 */
	public void setFiled1(java.lang.String filed1){
		this.filed1 = filed1;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  急诊45分钟内完成头颅CT检查                     
	 */
	@Column(name ="FILED_2",nullable=true,length=32)
	public java.lang.String getFiled2(){
		return this.filed2;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  急诊45分钟内完成头颅CT检查                     
	 */
	public void setFiled2(java.lang.String filed2){
		this.filed2 = filed2;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  急诊就诊在45分钟内获得临床实验室               
	 */
	@Column(name ="FILED_3",nullable=true,length=32)
	public java.lang.String getFiled3(){
		return this.filed3;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  急诊就诊在45分钟内获得临床实验室               
	 */
	public void setFiled3(java.lang.String filed3){
		this.filed3 = filed3;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发病3-4.5小时以内rt-PA静脉溶栓治疗             
	 */
	@Column(name ="FILED_4",nullable=true,length=32)
	public java.lang.String getFiled4(){
		return this.filed4;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发病3-4.5小时以内rt-PA静脉溶栓治疗             
	 */
	public void setFiled4(java.lang.String filed4){
		this.filed4 = filed4;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗
	 */
	@Column(name ="FILED_5",nullable=true,length=32)
	public java.lang.String getFiled5(){
		return this.filed5;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  发病2小时内到院，发病3小时以内rt-PA静脉溶栓治疗
	 */
	public void setFiled5(java.lang.String filed5){
		this.filed5 = filed5;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院48小时内阿司匹林或其他抗血小板药物治疗     
	 */
	@Column(name ="FILED_6",nullable=true,length=32)
	public java.lang.String getFiled6(){
		return this.filed6;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院48小时内阿司匹林或其他抗血小板药物治疗     
	 */
	public void setFiled6(java.lang.String filed6){
		this.filed6 = filed6;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  预防深静脉血栓                                 
	 */
	@Column(name ="FILED_7",nullable=true,length=32)
	public java.lang.String getFiled7(){
		return this.filed7;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  预防深静脉血栓                                 
	 */
	public void setFiled7(java.lang.String filed7){
		this.filed7 = filed7;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  住院1周内接受血管评价                          
	 */
	@Column(name ="FILED_8",nullable=true,length=32)
	public java.lang.String getFiled8(){
		return this.filed8;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  住院1周内接受血管评价                          
	 */
	public void setFiled8(java.lang.String filed8){
		this.filed8 = filed8;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院时合并高血压的脑出血患者降压治疗           
	 */
	@Column(name ="FILED_9",nullable=true,length=32)
	public java.lang.String getFiled9(){
		return this.filed9;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时合并高血压的脑出血患者降压治疗           
	 */
	public void setFiled9(java.lang.String filed9){
		this.filed9 = filed9;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  入院时合并高血压的脑梗死患者降压治疗           
	 */
	@Column(name ="FILED_10",nullable=true,length=32)
	public java.lang.String getFiled10(){
		return this.filed10;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  入院时合并高血压的脑梗死患者降压治疗           
	 */
	public void setFiled10(java.lang.String filed10){
		this.filed10 = filed10;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  住院期间患者使用他汀类药物治疗                 
	 */
	@Column(name ="FILED_11",nullable=true,length=32)
	public java.lang.String getFiled11(){
		return this.filed11;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  住院期间患者使用他汀类药物治疗                 
	 */
	public void setFiled11(java.lang.String filed11){
		this.filed11 = filed11;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时给予抗栓治疗                             
	 */
	@Column(name ="FILED_12",nullable=true,length=32)
	public java.lang.String getFiled12(){
		return this.filed12;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时给予抗栓治疗                             
	 */
	public void setFiled12(java.lang.String filed12){
		this.filed12 = filed12;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时合并高血压的脑出血患者降压治疗           
	 */
	@Column(name ="FILED_13",nullable=true,length=32)
	public java.lang.String getFiled13(){
		return this.filed13;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时合并高血压的脑出血患者降压治疗           
	 */
	public void setFiled13(java.lang.String filed13){
		this.filed13 = filed13;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时合并高血压的脑梗死患者降压治疗           
	 */
	@Column(name ="FILED_14",nullable=true,length=32)
	public java.lang.String getFiled14(){
		return this.filed14;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时合并高血压的脑梗死患者降压治疗           
	 */
	public void setFiled14(java.lang.String filed14){
		this.filed14 = filed14;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时给予他汀类药物治疗                       
	 */
	@Column(name ="FILED_15",nullable=true,length=32)
	public java.lang.String getFiled15(){
		return this.filed15;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时给予他汀类药物治疗                       
	 */
	public void setFiled15(java.lang.String filed15){
		this.filed15 = filed15;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时合并糖尿病患者使用降糖药物               
	 */
	@Column(name ="FILED_16",nullable=true,length=32)
	public java.lang.String getFiled16(){
		return this.filed16;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时合并糖尿病患者使用降糖药物               
	 */
	public void setFiled16(java.lang.String filed16){
		this.filed16 = filed16;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  出院时房颤患者给予抗凝治疗                     
	 */
	@Column(name ="FILED_17",nullable=true,length=32)
	public java.lang.String getFiled17(){
		return this.filed17;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  出院时房颤患者给予抗凝治疗                     
	 */
	public void setFiled17(java.lang.String filed17){
		this.filed17 = filed17;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  非房颤患者抗凝治疗                             
	 */
	@Column(name ="FILED_18",nullable=true,length=32)
	public java.lang.String getFiled18(){
		return this.filed18;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  非房颤患者抗凝治疗                             
	 */
	public void setFiled18(java.lang.String filed18){
		this.filed18 = filed18;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  康复治疗                                       
	 */
	@Column(name ="FILED_19",nullable=true,length=32)
	public java.lang.String getFiled19(){
		return this.filed19;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  康复治疗                                       
	 */
	public void setFiled19(java.lang.String filed19){
		this.filed19 = filed19;
	}
}
