package kr.or.ddit.shop.vo.search;

import java.io.Serializable;

public class SearchVO implements Serializable{ // 검색할때 
	private int sc_no; // 검색
	private int mem_no;
	private String sc_word; 
	private String sc_date;
	
	public SearchVO() {
		
	}
	
	public SearchVO(int sc_no, int mem_no, String sc_word, String sc_date) {
		super();
		this.sc_no = sc_no;
		this.mem_no = mem_no;
		this.sc_word = sc_word;
		this.sc_date = sc_date;
	}

	@Override
	public String toString() {
		return "SearchVO [sc_no=" + sc_no + ", mem_no=" + mem_no + ", sc_word=" + sc_word + ", sc_date=" + sc_date
				+ "]";
	}
	
	public int getSc_no() {
		return sc_no;
	}
	public void setSc_no(int sc_no) {
		this.sc_no = sc_no;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getSc_word() {
		return sc_word;
	}
	public void setSc_word(String sc_word) {
		this.sc_word = sc_word;
	}
	public String getSc_date() {
		return sc_date;
	}
	public void setSc_date(String sc_date) {
		this.sc_date = sc_date;
	}
	
	
}
