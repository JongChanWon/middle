package kr.or.ddit.shop.vo.search;

import java.io.Serializable;

public class CateVO implements Serializable{

	
	private int cate_no;
	private String cate_name;
	
	public CateVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CateVO(int cate_no, String cate_name) {
		super();
		this.cate_no = cate_no;
		this.cate_name = cate_name;
	}


	public int getCate_no() {
		return cate_no;
	}


	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}


	public String getCate_name() {
		return cate_name;
	}


	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}


	@Override
	public String toString() {
		return "CateVO [cate_no=" + cate_no + ", cate_name=" + cate_name + "]";
	}
	
	
}
