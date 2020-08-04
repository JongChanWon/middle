package kr.or.ddit.shop.vo.prod;

import java.io.Serializable;

public class ViewHistVO implements Serializable{

	private int memall_no   ;
	private int prod_no  ;
	private String view_date;
	
	public ViewHistVO() {
		// TODO Auto-generated constructor stub
	}

	public ViewHistVO(int mem_no, int prod_no, String view_date) {
		super();
		this.memall_no = mem_no;
		this.prod_no = prod_no;
		this.view_date = view_date;
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

	public String getView_date() {
		return view_date;
	}

	public void setView_date(String view_date) {
		this.view_date = view_date;
	}

	@Override
	public String toString() {
		return "ViewHistVO [mem_no=" + memall_no + ", prod_no=" + prod_no + ", view_date=" + view_date + "]";
	}
	
	
}   
