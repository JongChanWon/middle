package kr.or.ddit.shop.vo.board;

import java.io.Serializable;

public class FileTbVO implements Serializable{
	private int file_no;
	private String file_name;
	private String file_addr;
	private int admwrt_no;
	private int rev_no;
	
	public FileTbVO() {
		
	}
	
	public FileTbVO(int file_no, String file_name, String file_addr, int admwrt_no, int rev_no) {
		super();
		this.file_no = file_no;
		this.file_name = file_name;
		this.file_addr = file_addr;
		this.admwrt_no = admwrt_no;
		this.rev_no = rev_no;
	}
	
	public int getFile_no() {
		return file_no;
	}
	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_addr() {
		return file_addr;
	}
	public void setFile_addr(String file_addr) {
		this.file_addr = file_addr;
	}
	public int getAdmwrt_no() {
		return admwrt_no;
	}
	public void setAdmwrt_no(int admwrt_no) {
		this.admwrt_no = admwrt_no;
	}
	public int getRev_no() {
		return rev_no;
	}
	public void setRev_no(int rev_no) {
		this.rev_no = rev_no;
	}

	@Override
	public String toString() {
		return "FileTbVO [file_no=" + file_no + ", file_name=" + file_name + ", file_addr=" + file_addr + ", admwrt_no="
				+ admwrt_no + ", rev_no=" + rev_no + "]";
	}
	 
	
}
