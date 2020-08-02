package kr.or.ddit.shop.vo.codi;

import java.io.Serializable;

public class CodiVO implements Serializable{

	private int codi_no  ;
	private String codi_name;
	
	public CodiVO() {
		// TODO Auto-generated constructor stub
	}

	public CodiVO(int codi_no, String codi_name) {
		super();
		this.codi_no = codi_no;
		this.codi_name = codi_name;
	}

	public int getCodi_no() {
		return codi_no;
	}

	public void setCodi_no(int codi_no) {
		this.codi_no = codi_no;
	}

	public String getCodi_name() {
		return codi_name;
	}

	public void setCodi_name(String codi_name) {
		this.codi_name = codi_name;
	}

	@Override
	public String toString() {
		return "CodiVO [codi_no=" + codi_no + ", codi_name=" + codi_name + "]";
	}
	
	
}
