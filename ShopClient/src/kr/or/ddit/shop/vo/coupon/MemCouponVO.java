package kr.or.ddit.shop.vo.coupon;

import java.io.Serializable;

public class MemCouponVO implements Serializable{
	private int coup_no;
	private int mem_no;
	
	public MemCouponVO() {
		
	}
	
	public MemCouponVO(int coup_no, int mem_no) {
		super();
		this.coup_no = coup_no;
		this.mem_no = mem_no;
	}
	
	public int getCoup_no() {
		return coup_no;
	}
	public void setCoup_no(int coup_no) {
		this.coup_no = coup_no;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	@Override
	public String toString() {
		return "MemCouponVO [coup_no=" + coup_no + ", mem_no=" + mem_no + "]";
	}
	
	
}
