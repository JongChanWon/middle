package kr.or.ddit.shop.vo.mypage;

import java.io.Serializable;

public class ZzimVO implements Serializable{

	private int memall_no ;
	private int prod_no;
	private int opt_no;
	
	public ZzimVO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public ZzimVO(int memall_no, int prod_no, int opt_no) {
		super();
		this.memall_no = memall_no;
		this.prod_no = prod_no;
		this.setOpt_no(opt_no);
	}



	public int getMem_no() {
		return memall_no;
	}

	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}

	public int getProd_no() {
		return prod_no;
	}

	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}


	public int getOpt_no() {
		return opt_no;
	}


	public void setOpt_no(int opt_no) {
		this.opt_no = opt_no;
	}

	@Override
	public String toString() {
		return "ZzimVO [memall_no=" + memall_no + ", prod_no=" + prod_no + ", opt_no=" + opt_no + "]";
	}
	
	
}
