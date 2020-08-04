package kr.or.ddit.shop.vo.member;

import java.io.Serializable;

public class MemAllVO implements Serializable{
	private int memall_no;
	private String mem_mail;
	private String mem_pw;
	//private int order_no;
	private String mem_who;
	
	public MemAllVO() {
	
	}
	
	public MemAllVO(int mem_no, String mem_mail, String mem_pw, String mem_who) {
		super();
		this.memall_no = mem_no;
		//this.order_no = order_no;
		this.mem_mail = mem_mail;
		this.mem_pw = mem_pw;
		this.mem_who = mem_who;
	}
	
	public int getMem_no() {
		return memall_no;
	}
	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}
/*	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}*/
	public String getMem_mail() {
		return mem_mail;
	}
	public void setMem_mail(String mem_mail) {
		this.mem_mail = mem_mail;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}
	public String getMem_who() {
		return mem_who;
	}
	public void setMem_who(String mem_who) {
		this.mem_who = mem_who;
	}

	@Override
	public String toString() {
		return "MemAllVO [mem_no=" + memall_no + ", mem_mail=" + mem_mail + ", mem_pw=" + mem_pw
				+ ", mem_who=" + mem_who + "]";
	}
	
}
