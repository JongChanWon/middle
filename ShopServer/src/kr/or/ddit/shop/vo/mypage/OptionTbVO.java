package kr.or.ddit.shop.vo.mypage;

import java.io.Serializable;

public class OptionTbVO implements Serializable{
	private int opt_no;
	private int prod_no;
	private String opt_size;
	private String opt_color;
	private int opt_length;
	private int opt_shoulder;
	private int opt_breast;
	private int opt_arm;
	private int opt_hip;
	private int opt_thigh;
	private int opt_rise;
	private int opt_feet;
	
	public OptionTbVO() {
	
	}
	
	public OptionTbVO(int opt_no, int prod_no, String opt_size, String opt_color, int opt_length, int opt_shoulder,
			          int opt_breast, int opt_arm, int opt_hip, int opt_thigh, int opt_rise, int opt_feet) {
		super();
		this.opt_no = opt_no;
		this.prod_no = prod_no;
		this.opt_size = opt_size;
		this.opt_color = opt_color;
		this.opt_length = opt_length;
		this.opt_shoulder = opt_shoulder;
		this.opt_breast = opt_breast;
		this.opt_arm = opt_arm;
		this.opt_hip = opt_hip;
		this.opt_thigh = opt_thigh;
		this.opt_rise = opt_rise;
		this.opt_feet = opt_feet;
	}
	
	public int getOpt_no() {
		return opt_no;
	}
	public void setOpt_no(int opt_no) {
		this.opt_no = opt_no;
	}
	public int getProd_no() {
		return prod_no;
	}
	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}
	public String getOpt_size() {
		return opt_size;
	}
	public void setOpt_size(String opt_size) {
		this.opt_size = opt_size;
	}
	public String getOpt_color() {
		return opt_color;
	}
	public void setOpt_color(String opt_color) {
		this.opt_color = opt_color;
	}
	public int getOpt_length() {
		return opt_length;
	}
	public void setOpt_length(int opt_length) {
		this.opt_length = opt_length;
	}
	public int getOpt_shoulder() {
		return opt_shoulder;
	}
	public void setOpt_shoulder(int opt_shoulder) {
		this.opt_shoulder = opt_shoulder;
	}
	public int getOpt_breast() {
		return opt_breast;
	}
	public void setOpt_breast(int opt_breast) {
		this.opt_breast = opt_breast;
	}
	public int getOpt_arm() {
		return opt_arm;
	}
	public void setOpt_arm(int opt_arm) {
		this.opt_arm = opt_arm;
	}
	public int getOpt_hip() {
		return opt_hip;
	}
	public void setOpt_hip(int opt_hip) {
		this.opt_hip = opt_hip;
	}
	public int getOpt_thigh() {
		return opt_thigh;
	}
	public void setOpt_thigh(int opt_thigh) {
		this.opt_thigh = opt_thigh;
	}
	public int getOpt_rise() {
		return opt_rise;
	}
	public void setOpt_rise(int opt_rise) {
		this.opt_rise = opt_rise;
	}
	public int getOpt_feet() {
		return opt_feet;
	}
	public void setOpt_feet(int opt_feet) {
		this.opt_feet = opt_feet;
	}

	@Override
	public String toString() {
		return "OptionTbVO [opt_no=" + opt_no + ", prod_no=" + prod_no + ", opt_size=" + opt_size + ", opt_color="
				+ opt_color + ", opt_length=" + opt_length + ", opt_shoulder=" + opt_shoulder + ", opt_breast="
				+ opt_breast + ", opt_arm=" + opt_arm + ", opt_hip=" + opt_hip + ", opt_thigh=" + opt_thigh
				+ ", opt_rise=" + opt_rise + ", opt_feet=" + opt_feet + "]";
	}
	
}
