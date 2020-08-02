package kr.or.ddit.shop.vo.codi;

import java.io.Serializable;

public class CodiDetailVO implements Serializable{

	private int codi_no;
	private int prod_no;
	
	public CodiDetailVO() {
		// TODO Auto-generated constructor stub
	}

	public CodiDetailVO(int codi_no, int prod_no) {
		super();
		this.codi_no = codi_no;
		this.prod_no = prod_no;
	}

	public int getCodi_no() {
		return codi_no;
	}

	public void setCodi_no(int codi_no) {
		this.codi_no = codi_no;
	}

	public int getProd_no() {
		return prod_no;
	}

	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}

	@Override
	public String toString() {
		return "CodiDetailVO [codi_no=" + codi_no + ", prod_no=" + prod_no + "]";
	}
	
	
}
