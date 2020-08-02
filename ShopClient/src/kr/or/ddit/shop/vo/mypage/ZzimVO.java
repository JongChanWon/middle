package kr.or.ddit.shop.vo.mypage;

import java.io.Serializable;

public class ZzimVO implements Serializable{

	private int mem_no ;
	private int prod_no;
	
	public ZzimVO() {
		// TODO Auto-generated constructor stub
	}

	public ZzimVO(int mem_no, int prod_no) {
		super();
		this.mem_no = mem_no;
		this.prod_no = prod_no;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public int getProd_no() {
		return prod_no;
	}

	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}

	@Override
	public String toString() {
		return "ZzimVO [mem_no=" + mem_no + ", prod_no=" + prod_no + "]";
	}
	
	
}
