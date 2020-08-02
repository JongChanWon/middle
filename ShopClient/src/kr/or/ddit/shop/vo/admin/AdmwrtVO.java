package kr.or.ddit.shop.vo.admin;

import java.io.Serializable;

public class AdmwrtVO implements Serializable{

	
	private int admwrt_no;
	private String admwrt_title ;
	private String admwrt_date  ;
	private String admwrt_cont  ;
	private String admwrt_what  ;
	
	public AdmwrtVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public AdmwrtVO(int admwrt_no, String admwrt_title, String admwrt_date, String admwrt_cont, String admwrt_what) {
		super();
		this.admwrt_no = admwrt_no;
		this.admwrt_title = admwrt_title;
		this.admwrt_date = admwrt_date;
		this.admwrt_cont = admwrt_cont;
		this.admwrt_what = admwrt_what;
	}
	

	public int getAdmwrt_no() {
		return admwrt_no;
	}

	public void setAdmwrt_no(int admwrt_no) {
		this.admwrt_no = admwrt_no;
	}

	public String getAdmwrt_title() {
		return admwrt_title;
	}

	public void setAdmwrt_title(String admwrt_title) {
		this.admwrt_title = admwrt_title;
	}

	public String getAdmwrt_date() {
		return admwrt_date;
	}

	public void setAdmwrt_date(String admwrt_date) {
		this.admwrt_date = admwrt_date;
	}

	public String getAdmwrt_cont() {
		return admwrt_cont;
	}

	public void setAdmwrt_cont(String admwrt_cont) {
		this.admwrt_cont = admwrt_cont;
	}

	public String getAdmwrt_what() {
		return admwrt_what;
	}

	public void setAdmwrt_what(String admwrt_what) {
		this.admwrt_what = admwrt_what;
	}


	@Override
	public String toString() {
		return "AdmwrtVO [admwrt_no=" + admwrt_no + ", admwrt_title=" + admwrt_title + ", admwrt_date=" + admwrt_date
				+ ", admwrt_cont=" + admwrt_cont + ", admwrt_what=" + admwrt_what + "]";
	}
	
	
	
}
