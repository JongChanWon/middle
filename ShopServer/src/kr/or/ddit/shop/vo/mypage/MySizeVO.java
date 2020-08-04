package kr.or.ddit.shop.vo.mypage;

import java.io.Serializable;

public class MySizeVO implements Serializable{          
	private int memall_no;
	//private int my_length;
	private int my_shoulder;
	private int my_breast;
	private int my_arm;
	private int my_hip;
	private int my_thigh;
	private int my_rise;
	private int my_feet;
	
	public MySizeVO() {
	
	}
	
	public MySizeVO(int mem_no, int my_shoulder, int my_breast, int my_arm, int my_hip, int my_thigh,
			int my_rise, int my_feet) {
		super();
		this.memall_no = mem_no;
		//this.my_length = my_length;
		this.my_shoulder = my_shoulder;
		this.my_breast = my_breast;
		this.my_arm = my_arm;
		this.my_hip = my_hip;
		this.my_thigh = my_thigh;
		this.my_rise = my_rise;
		this.my_feet = my_feet;
	}
	
	public int getMem_no() {
		return memall_no;
	}
	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}
	/*public int getMy_length() {
		return my_length;
	}
	public void setMy_length(int my_length) {
		this.my_length = my_length;
	}*/
	public int getMy_shoulder() {
		return my_shoulder;
	}
	public void setMy_shoulder(int my_shoulder) {
		this.my_shoulder = my_shoulder;
	}
	public int getMy_breast() {
		return my_breast;
	}
	public void setMy_breast(int my_breast) {
		this.my_breast = my_breast;
	}
	public int getMy_arm() {
		return my_arm;
	}
	public void setMy_arm(int my_arm) {
		this.my_arm = my_arm;
	}
	public int getMy_hip() {
		return my_hip;
	}
	public void setMy_hip(int my_hip) {
		this.my_hip = my_hip;
	}
	public int getMy_thigh() {
		return my_thigh;
	}
	public void setMy_thigh(int my_thigh) {
		this.my_thigh = my_thigh;
	}
	public int getMy_rise() {
		return my_rise;
	}
	public void setMy_rise(int my_rise) {
		this.my_rise = my_rise;
	}
	public int getMy_feet() {
		return my_feet;
	}
	public void setMy_feet(int my_feet) {
		this.my_feet = my_feet;
	}

	@Override
	public String toString() {
		return "MySizeVO [mem_no=" + memall_no + ", my_shoulder=" + my_shoulder
				+ ", my_breast=" + my_breast + ", my_arm=" + my_arm + ", my_hip=" + my_hip + ", my_thigh=" + my_thigh
				+ ", my_rise=" + my_rise + ", my_feet=" + my_feet + "]";
	}
	
}
