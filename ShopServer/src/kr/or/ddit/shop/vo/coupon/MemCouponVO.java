package kr.or.ddit.shop.vo.coupon;

import java.io.Serializable;

public class MemCouponVO implements Serializable{
	private int coup_no;
	private int memall_no;
	private int coup_pcent;
	
	public MemCouponVO() {
		
	}
	
	public MemCouponVO(int coup_no, int memall_no, int coup_pcent) {
		super();
		this.coup_no = coup_no;
		this.memall_no = memall_no;
		this.coup_pcent = coup_pcent;
	}
	
	public int getCoup_no() {
		return coup_no;
	}
	public void setCoup_no(int coup_no) {
		this.coup_no = coup_no;
	}
	public int getMem_no() {
		return memall_no;
	}
	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}

	public int getCoup_pcent() {
		return coup_pcent;
	}
	
	public void setCoup_pcent(int coup_pcent) {
		this.coup_pcent = coup_pcent;
	}

	@Override
	public String toString() {
		return "MemCouponVO [coup_no=" + coup_no + ", mem_no=" + memall_no + ", coup_pcent=" +
							coup_pcent + "]";
	}

	
	
}
