package kr.or.ddit.shop.vo.member;

import java.io.Serializable;

public class BrandVO implements Serializable{

	private int brand_no    ;
	private String brand_regno ;
	private String brand_name  ;
	private int brand_zip;
	private String brand_addr1 ;
	private String brand_addr2 ;
	private String brand_phone ;
	private String brand_status;
	
	
	public BrandVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BrandVO(int brand_no, String brand_regno, String brand_name, String brand_addr1, String brand_addr2,
			int brand_zip, String brand_phone, String brand_status) {
		super();
		this.brand_no = brand_no;
		this.brand_regno = brand_regno;
		this.brand_name = brand_name;
		this.brand_addr1 = brand_addr1;
		this.brand_addr2 = brand_addr2;
		this.brand_zip = brand_zip;
		this.brand_phone = brand_phone;
		this.brand_status = brand_status;
	}


	public int getBrand_no() {
		return brand_no;
	}


	public void setBrand_no(int brand_no) {
		this.brand_no = brand_no;
	}


	public String getBrand_regno() {
		return brand_regno;
	}


	public void setBrand_regno(String brand_regno) {
		this.brand_regno = brand_regno;
	}


	public String getBrand_name() {
		return brand_name;
	}


	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}


	public String getBrand_addr1() {
		return brand_addr1;
	}


	public void setBrand_addr1(String brand_addr1) {
		this.brand_addr1 = brand_addr1;
	}


	public String getBrand_addr2() {
		return brand_addr2;
	}


	public void setBrand_addr2(String brand_addr2) {
		this.brand_addr2 = brand_addr2;
	}


	public String getBrand_phone() {
		return brand_phone;
	}


	public void setBrand_phone(String brand_phone) {
		this.brand_phone = brand_phone;
	}


	public String getBrand_status() {
		return brand_status;
	}


	public void setBrand_status(String brand_status) {
		this.brand_status = brand_status;
	}

	public int getBrand_zip() {
		return brand_zip;
	}
	
	
	public void setBrand_zip(int brand_zip) {
		this.brand_zip = brand_zip;
	}

	@Override
	public String toString() {
		return "BrandVO [brand_no=" + brand_no + ", brand_regno=" + brand_regno + ", brand_name=" + brand_name
				+ ", brand_addr1=" + brand_addr1 + ", brand_addr2=" + brand_addr2 +  ", brand_zip=" + brand_zip
				+ ", brand_phone=" + brand_phone + ", brand_status=" + brand_status + "]";
	}


	
	
	
	
}
