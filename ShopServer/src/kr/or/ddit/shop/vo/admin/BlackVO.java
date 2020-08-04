package kr.or.ddit.shop.vo.admin;

import java.io.Serializable;

public class BlackVO implements Serializable{

	private int memall_no      ;
	private String black_indate;
	private String black_why   ;
	
	public BlackVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public BlackVO(int mem_no, String black_indate, String black_why) {
		super();
		this.memall_no = mem_no;
		this.black_indate = black_indate;
		this.black_why = black_why;
	}

	public int getMem_no() {
		return memall_no;
	}

	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}

	public String getBlack_indate() {
		return black_indate;
	}

	public void setBlack_indate(String black_indate) {
		this.black_indate = black_indate;
	}

	public String getBlack_why() {
		return black_why;
	}

	public void setBlack_why(String black_why) {
		this.black_why = black_why;
	}

	@Override
	public String toString() {
		return "BlackVO [mem_no=" + memall_no + ", black_indate=" + black_indate + ", black_why=" + black_why + "]";
	}
	
	
	
}
