package kr.or.ddit.shop.vo.coupon;

import java.io.Serializable;

public class CouponVO implements Serializable{

	private int coup_no   ;
	private int event_no  ;
	private String coup_name ;
	private int coup_pcent;
	
	public CouponVO() {
		// TODO Auto-generated constructor stub
	}

	public CouponVO(int coup_no, int event_no, String coup_name, int coup_pcent) {
		super();
		this.coup_no = coup_no;
		this.event_no = event_no;
		this.coup_name = coup_name;
		this.coup_pcent = coup_pcent;
	}

	public int getCoup_no() {
		return coup_no;
	}

	public void setCoup_no(int coup_no) {
		this.coup_no = coup_no;
	}

	public int getEvent_no() {
		return event_no;
	}

	public void setEvent_no(int event_no) {
		this.event_no = event_no;
	}

	public String getCoup_name() {
		return coup_name;
	}

	public void setCoup_name(String coup_name) {
		this.coup_name = coup_name;
	}

	public int getCoup_pcent() {
		return coup_pcent;
	}

	public void setCoup_pcent(int coup_pcent) {
		this.coup_pcent = coup_pcent;
	}

	@Override
	public String toString() {
		return "CouponVO [coup_no=" + coup_no + ", event_no=" + event_no + ", coup_name=" + coup_name + ", coup_pcent="
				+ coup_pcent + "]";
	}
	
	
}
