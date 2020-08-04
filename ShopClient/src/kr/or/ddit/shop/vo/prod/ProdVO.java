package kr.or.ddit.shop.vo.prod;

import java.io.Serializable;

public class ProdVO implements Serializable{
	
	private int prod_no;
	private int cate_no;
	private int brand_no;
	private String prod_name;
	private int prod_price;
	private int prod_stock;
	private int prod_sold;
	private int prod_dc;
	private String prod_img;
	//private String prod_tag;
	private String prod_status;
	
	public ProdVO() {
		
	}
	
	public ProdVO(int prod_no, int cate_no, int brand_no, String prod_name, int prod_price, int prod_stock,
			int prod_sold, int prod_dc, String prod_img, String prod_status) {
		super();
		this.prod_no = prod_no;
		this.cate_no = cate_no;
		this.brand_no = brand_no;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_stock = prod_stock;
		this.prod_sold = prod_sold;
		this.prod_dc = prod_dc;
		this.prod_img = prod_img;
		//this.prod_tag = prod_tag;
		this.prod_status = prod_status;
	}

	@Override
	public String toString() {
		return "ProdVO [prod_no=" + prod_no + ", cate_no=" + cate_no + ", brand_no=" + brand_no + ", prod_name="
				+ prod_name + ", prod_price=" + prod_price + ", prod_stock=" + prod_stock + ", prod_sold=" + prod_sold
				+ ", prod_dc=" + prod_dc + ", prod_img=" + prod_img + ", prod_tag=" + prod_status + "]";
	}
	
	public int getProd_no() {
		return prod_no;
	}
	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}
	public int getCate_no() {
		return cate_no;
	}
	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}
	public int getBrand_no() {
		return brand_no;
	}
	public void setBrand_no(int brand_no) {
		this.brand_no = brand_no;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public int getProd_price() {
		return prod_price;
	}
	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}
	public int getProd_stock() {
		return prod_stock;
	}
	public void setProd_stock(int prod_stock) {
		this.prod_stock = prod_stock;
	}
	public int getProd_sold() {
		return prod_sold;
	}
	public void setProd_sold(int prod_sold) {
		this.prod_sold = prod_sold;
	}
	public int getProd_dc() {
		return prod_dc;
	}
	public void setProd_dc(int prod_dc) {
		this.prod_dc = prod_dc;
	}
	public String getProd_img() {
		return prod_img;
	}
	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}
	/*public String getProd_tag() {
		return prod_tag;
	}
	public void setProd_tag(String prod_tag) {
		this.prod_tag = prod_tag;
	}*/
	public String getProd_status() {
		return prod_status;
	}
	public void setProd_status(String prod_status) {
		this.prod_status = prod_status;
	}
	
	
}
