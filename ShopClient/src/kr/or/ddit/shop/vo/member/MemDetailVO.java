package kr.or.ddit.shop.vo.member;

import java.io.Serializable;

public class MemDetailVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int mem_no;
	private String mem_mail;
	private String mem_pw;
	private String mem_name;
	private String mem_nick;
	private String mem_birth;
	private String mem_phone;
	private String mem_addr1;
	private String mem_addr2;
	private int mem_point;
	private String mem_rank;
	private String mem_age;
	private String mem_gender;
	private int mem_price;
	private String mem_picaddr;
	private String mem_zip;
	private int order_no;
	private String mem_who;
	
	
	public MemDetailVO() {
	
	}
	
	public MemDetailVO(String mem_mail, String mem_pw) {
		super();
		this.mem_mail = mem_mail;
		this.mem_pw = mem_pw;
	}

	

	public int getOrder_no() {
		return order_no;
	}

	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}

	public String getMem_who() {
		return mem_who;
	}

	public void setMem_who(String mem_who) {
		this.mem_who = mem_who;
	}

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
	
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_nick() {
		return mem_nick;
	}
	public void setMem_nick(String mem_nick) {
		this.mem_nick = mem_nick;
	}
	public String getMem_birth() {
		return mem_birth;
	}
	public void setMem_birth(String mem_birth) {
		this.mem_birth = mem_birth;
	}
	public String getMem_phone() {
		return mem_phone;
	}
	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public String getMem_addr1() {
		return mem_addr1;
	}
	public void setMem_addr1(String mem_addr1) {
		this.mem_addr1 = mem_addr1;
	}
	public String getMem_addr2() {
		return mem_addr2;
	}
	public void setMem_addr2(String mem_addr2) {
		this.mem_addr2 = mem_addr2;
	}
	public int getMem_point() {
		return mem_point;
	}
	public void setMem_point(int mem_point) {
		this.mem_point = mem_point;
	}
	public String getMem_rank() {
		return mem_rank;
	}
	public void setMem_rank(String mem_rank) {
		this.mem_rank = mem_rank;
	}
	public String getMem_age() {
		return mem_age;
	}
	public void setMem_age(String mem_age) {
		this.mem_age = mem_age;
	}
	public String getMem_gender() {
		return mem_gender;
	}
	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}
	public int getMem_price() {
		return mem_price;
	}
	public void setMem_price(int mem_price) {
		this.mem_price = mem_price;
	}
	public String getMem_picaddr() {
		return mem_picaddr;
	}
	public void setMem_picaddr(String mem_picaddr) {
		this.mem_picaddr = mem_picaddr;
	}

	public String getMem_zip() {
		return mem_zip;
	}
	
	public void setMem_zip(String mem_zip) {
		this.mem_zip = mem_zip;
	}
	
	@Override
	public String toString() {
		return "MemDetailVO [mem_no=" + mem_no + ", mem_mail=" + mem_mail + ", mem_pw=" + mem_pw 
				+ ", mem_name=" + mem_name + ", mem_nick=" + mem_nick + ", mem_birth="
				+ mem_birth + ", mem_phone=" + mem_phone + ", mem_addr1=" + mem_addr1 + ", mem_addr2=" + mem_addr2
				+ ", mem_point=" + mem_point + ", mem_rank=" + mem_rank + ", mem_age=" + mem_age + ", mem_gender="
				+ mem_gender + ", mem_price=" + mem_price + ", mem_picaddr=" + mem_picaddr + ", mem_zip=" + mem_zip + "]";
	}

	
}
