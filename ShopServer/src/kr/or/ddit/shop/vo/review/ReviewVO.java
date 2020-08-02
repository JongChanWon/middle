package kr.or.ddit.shop.vo.review;

import java.io.Serializable;

public class ReviewVO implements Serializable{
	private int rev_no;
	private int orderall_no;
	private String rev_date;
	private String rev_cont;
	private int rev_like;
	private String rev_why;
	private String rev_yn;
	
	public ReviewVO() {
		
	}
	
	public ReviewVO(int rev_no, int orderall_no, String rev_date, String rev_cont, int rev_like, String rev_why,
			String rev_yn) {
		super();
		this.rev_no = rev_no;
		this.orderall_no = orderall_no;
		this.rev_date = rev_date;
		this.rev_cont = rev_cont;
		this.rev_like = rev_like;
		this.rev_why = rev_why;
		this.rev_yn = rev_yn;
	}

	@Override
	public String toString() {
		return "ReviewVO [rev_no=" + rev_no + ", orderall_no=" + orderall_no + ", rev_date=" + rev_date + ", rev_cont="
				+ rev_cont + ", rev_like=" + rev_like + ", rev_why=" + rev_why + ", rev_yn=" + rev_yn + "]";
	}
	
	public int getRev_no() {
		return rev_no;
	}
	public void setRev_no(int rev_no) {
		this.rev_no = rev_no;
	}
	public int getOrderall_no() {
		return orderall_no;
	}
	public void setOrderall_no(int orderall_no) {
		this.orderall_no = orderall_no;
	}
	public String getRev_date() {
		return rev_date;
	}
	public void setRev_date(String rev_date) {
		this.rev_date = rev_date;
	}
	public String getRev_cont() {
		return rev_cont;
	}
	public void setRev_cont(String rev_cont) {
		this.rev_cont = rev_cont;
	}
	public int getRev_like() {
		return rev_like;
	}
	public void setRev_like(int rev_like) {
		this.rev_like = rev_like;
	}
	public String getRev_why() {
		return rev_why;
	}
	public void setRev_why(String rev_why) {
		this.rev_why = rev_why;
	}
	public String getRev_yn() {
		return rev_yn;
	}
	public void setRev_yn(String rev_yn) {
		this.rev_yn = rev_yn;
	}
	
	
}
