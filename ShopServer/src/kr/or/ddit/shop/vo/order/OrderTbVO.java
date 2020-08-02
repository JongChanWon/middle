package kr.or.ddit.shop.vo.order;

import java.io.Serializable;

public class OrderTbVO implements Serializable{
	private int order_no;
	private int mem_no;
	private String order_date;
	private int order_price;
	private String order_status;
	private String del_name;
	private String del_phone;
	private String del_addr1;
	private String del_addr2;
	private int del_zip;
	private String del_msg;
	
	public OrderTbVO() {
	
	}
	
	public OrderTbVO(int order_no, int mem_no, String order_date, int order_price, String order_status, String del_name,
			         String del_phone, String del_addr1, String del_addr2, int del_zip, String del_msg) {
		super();
		this.order_no = order_no;
		this.mem_no = mem_no;
		this.order_date = order_date;
		this.order_price = order_price;
		this.order_status = order_status;
		this.del_name = del_name;
		this.del_phone = del_phone;
		this.del_addr1 = del_addr1;
		this.del_addr2 = del_addr2;
		this.setDel_zip(del_zip);
		this.del_msg = del_msg;
	}
	
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public int getOrder_price() {
		return order_price;
	}
	public void setOrder_price(int order_price) {
		this.order_price = order_price;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getDel_name() {
		return del_name;
	}
	public void setDel_name(String del_name) {
		this.del_name = del_name;
	}
	public String getDel_phone() {
		return del_phone;
	}
	public void setDel_phone(String del_phone) {
		this.del_phone = del_phone;
	}
	public String getDel_addr1() {
		return del_addr1;
	}
	public void setDel_addr1(String del_addr1) {
		this.del_addr1 = del_addr1;
	}
	public String getDel_addr2() {
		return del_addr2;
	}
	public void setDel_addr2(String del_addr2) {
		this.del_addr2 = del_addr2;
	}
	public String getDel_msg() {
		return del_msg;
	}
	public void setDel_msg(String del_msg) {
		this.del_msg = del_msg;
	}

	public int getDel_zip() {
		return del_zip;
	}
	
	public void setDel_zip(int del_zip) {
		this.del_zip = del_zip;
	}
	
	@Override
	public String toString() {
		return "OrderTbVO [order_no=" + order_no + ", mem_no=" + mem_no + ", order_date=" + order_date
				+ ", order_price=" + order_price + ", order_status=" + order_status + ", del_name=" + del_name
				+ ", del_phone=" + del_phone + ", del_addr1=" + del_addr1 + ", del_addr2=" + del_addr2  
				+ ", del_zip=" + del_zip + ", del_msg="	+ del_msg + "]";
	}

	
}
