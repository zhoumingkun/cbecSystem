package com.toughguy.alarmSystem.model.content;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.toughguy.alarmSystem.model.AbstractModel;
import com.toughguy.alarmSystem.util.JsonUtil;

/**
 *扫黑除恶表实体类
 * @author ZMK
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL) //为空字段不返回
public class Saoheichue extends AbstractModel {
	private int id;
	private int xzqh;    //行政区划代码
	private String tbdw;   //填报单位
	private int shcedzxs;  //报警情况
	private int djqbfzxs;       //违法犯罪案件
	private int djwwfzxs;    //治安案件
	private int phstfzxs;       //火灾事故
	private int ffjzfzxs;        //交通事故
	private int dxwlfzxs;   //治安灾害事故
	private int hj;   //来自杀源
	private String tbr;   //填报人
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getXzqh() {
		return xzqh;
	}
	public void setXzqh(int xzqh) {
		this.xzqh = xzqh;
	}
	public String getTbdw() {
		return tbdw;
	}
	public void setTbdw(String tbdw) {
		this.tbdw = tbdw;
	}
	public int getShcedzxs() {
		return shcedzxs;
	}
	public void setShcedzxs(int shcedzxs) {
		this.shcedzxs = shcedzxs;
	}
	public int getDjqbfzxs() {
		return djqbfzxs;
	}
	public void setDjqbfzxs(int djqbfzxs) {
		this.djqbfzxs = djqbfzxs;
	}
	public int getDjwwfzxs() {
		return djwwfzxs;
	}
	public void setDjwwfzxs(int djwwfzxs) {
		this.djwwfzxs = djwwfzxs;
	}
	public int getPhstfzxs() {
		return phstfzxs;
	}
	public void setPhstfzxs(int phstfzxs) {
		this.phstfzxs = phstfzxs;
	}
	public int getFfjzfzxs() {
		return ffjzfzxs;
	}
	public void setFfjzfzxs(int ffjzfzxs) {
		this.ffjzfzxs = ffjzfzxs;
	}
	public int getDxwlfzxs() {
		return dxwlfzxs;
	}
	public void setDxwlfzxs(int dxwlfzxs) {
		this.dxwlfzxs = dxwlfzxs;
	}
	public int getHj() {
		return hj;
	}
	public void setHj(int hj) {
		this.hj = hj;
	}
	public String getTbr() {
		return tbr;
	}
	public void setTbr(String tbr) {
		this.tbr = tbr;
	}
	
	
	

	
}