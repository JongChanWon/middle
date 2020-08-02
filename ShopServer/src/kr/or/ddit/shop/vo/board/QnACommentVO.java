package kr.or.ddit.shop.vo.board;

import java.io.Serializable;

public class QnACommentVO implements Serializable{
	private int comm_no;
	private int mem_no;
	private String comm_wrt;
	private int qnacom_no;
	private String comm_date;
	
	public QnACommentVO() {
		
	}
	
	public QnACommentVO(int comm_no, int mem_no, String comm_wrt, int qnacom_no, String comm_date) {
		super();
		this.comm_no = comm_no;
		this.mem_no = mem_no;
		this.comm_wrt = comm_wrt;
		this.qnacom_no = qnacom_no;
		this.comm_date = comm_date;
	}

	@Override
	public String toString() {
		return "QnACommentVO [comm_no=" + comm_no + ", mem_no=" + mem_no + ", comm_wrt=" + comm_wrt + ", qnacom_no="
				+ qnacom_no + ", comm_date=" + comm_date + "]";
	}
	
	public int getComm_no() {
		return comm_no;
	}
	public void setComm_no(int comm_no) {
		this.comm_no = comm_no;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getComm_wrt() {
		return comm_wrt;
	}
	public void setComm_wrt(String comm_wrt) {
		this.comm_wrt = comm_wrt;
	}
	public int getQnacom_no() {
		return qnacom_no;
	}
	public void setQnacom_no(int qnacom_no) {
		this.qnacom_no = qnacom_no;
	}
	public String getComm_date() {
		return comm_date;
	}
	public void setComm_date(String comm_date) {
		this.comm_date = comm_date;
	}
	
	
}
