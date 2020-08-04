package kr.or.ddit.shop.vo.review;

import java.io.Serializable;

public class RevLikeVO implements Serializable{
	
	private int rev_no;
	private int memall_no;
	
	public RevLikeVO() {
		
	}
	
	public RevLikeVO(int rev_no, int mem_no) {
		super();
		this.rev_no = rev_no;
		this.memall_no = mem_no;
	}

	@Override
	public String toString() {
		return "RevLikeVO [rev_no=" + rev_no + ", mem_no=" + memall_no + "]";
	}
	
	public int getRev_no() {
		return rev_no;
	}
	public void setRev_no(int rev_no) {
		this.rev_no = rev_no;
	}
	public int getMem_no() {
		return memall_no;
	}
	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}
	
	
}
