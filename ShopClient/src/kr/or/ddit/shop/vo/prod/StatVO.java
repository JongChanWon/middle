package kr.or.ddit.shop.vo.prod;

import java.io.Serializable;

public class StatVO implements Serializable{
	private int brand_no;
	private String stat_date;
	private int stat_sold;
	
	public StatVO() {
		
	}
	
	public StatVO(int brand_no, String stat_date, int stat_sold) {
		super();
		this.brand_no = brand_no;
		this.stat_date = stat_date;
		this.stat_sold = stat_sold;
	}

	@Override
	public String toString() {
		return "StatVO [brand_no=" + brand_no + ", stat_date=" + stat_date + ", stat_sold=" + stat_sold + "]";
	}
	
	public int getBrand_no() {
		return brand_no;
	}
	public void setBrand_no(int brand_no) {
		this.brand_no = brand_no;
	}
	public String getStat_date() {
		return stat_date;
	}
	public void setStat_date(String stat_date) {
		this.stat_date = stat_date;
	}
	public int getStat_sold() {
		return stat_sold;
	}
	public void setStat_sold(int stat_sold) {
		this.stat_sold = stat_sold;
	}
	
	
	
	
}
