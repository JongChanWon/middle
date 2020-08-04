package kr.or.ddit.shop.vo.board;

import java.io.Serializable;

public class QnACommentVO implements Serializable{
	private int qnacom_no;
	private int qna_no;
	private int memall_no;
	private String qnacom_cont;
	private String qnacom_date;
	
	public QnACommentVO() {
		
	}
	
	public QnACommentVO(int comm_no, int mem_no, String comm_wrt, int qnacom_no, String comm_date) {
		super();
		this.qnacom_no = comm_no;
		this.memall_no = mem_no;
		this.qnacom_cont = comm_wrt;
		this.qna_no = qnacom_no;
		this.qnacom_date = comm_date;
	}

	@Override
	public String toString() {
		return "QnACommentVO [comm_no=" + qnacom_no + ", mem_no=" + memall_no + ", comm_wrt=" + qnacom_cont + ", qnacom_no="
				+ qna_no + ", comm_date=" + qnacom_date + "]";
	}
	
	public int getComm_no() {
		return qnacom_no;
	}
	public void setComm_no(int comm_no) {
		this.qnacom_no = comm_no;
	}
	public int getMem_no() {
		return memall_no;
	}
	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}
	public String getComm_wrt() {
		return qnacom_cont;
	}
	public void setComm_wrt(String comm_wrt) {
		this.qnacom_cont = comm_wrt;
	}
	public int getQnacom_no() {
		return qna_no;
	}
	public void setQnacom_no(int qnacom_no) {
		this.qna_no = qnacom_no;
	}
	public String getComm_date() {
		return qnacom_date;
	}
	public void setComm_date(String comm_date) {
		this.qnacom_date = comm_date;
	}
	
	
}
