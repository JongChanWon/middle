package kr.or.ddit.shop.vo.board;

import java.io.Serializable;

public class QnAVO implements Serializable{
	private int qna_no;
	private int mem_no;
	private int prod_no;
	private String qna_cont;
	private String qna_date;
	
	
	public QnAVO() {
		
	}
	
	public QnAVO(int qna_no, int mem_no, int prod_no, String qna_cont, String qna_date) {
		super();
		this.qna_no = qna_no;
		this.mem_no = mem_no;
		this.prod_no = prod_no;
		this.qna_cont = qna_cont;
		this.qna_date = qna_date;
	}

	@Override
	public String toString() {
		return "QnAVO [qna_no=" + qna_no + ", mem_no=" + mem_no + ", prod_no=" + prod_no + ", qna_cont=" + qna_cont
				+ ", qna_date=" + qna_date + "]";
	}
	
	public int getQna_no() {
		return qna_no;
	}
	public void setQna_no(int qna_no) {
		this.qna_no = qna_no;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public int getProd_no() {
		return prod_no;
	}
	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}
	public String getQna_cont() {
		return qna_cont;
	}
	public void setQna_cont(String qna_cont) {
		this.qna_cont = qna_cont;
	}
	public String getQna_date() {
		return qna_date;
	}
	public void setQna_date(String qna_date) {
		this.qna_date = qna_date;
	}
	
	
}
