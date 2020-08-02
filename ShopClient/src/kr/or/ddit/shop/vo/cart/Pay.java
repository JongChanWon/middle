package kr.or.ddit.shop.vo.cart;

import java.io.Serializable;

public class Pay implements Serializable{
	private int pay_no;
	private int coup_no;
	private int order_no;
	private String pay_how;
	private int point_use;
	private int pay_price;
	private String pay_status;
	
	public Pay() {
	
	}
	
	public Pay(int pay_no, int coup_no, int order_no, String pay_how, int point_use, int pay_price, String pay_status) {
		super();
		this.pay_no = pay_no;
		this.coup_no = coup_no;
		this.order_no = order_no;
		this.pay_how = pay_how;
		this.point_use = point_use;
		this.pay_price = pay_price;
		this.pay_status = pay_status;
	}
	
	public int getPay_no() {
		return pay_no;
	}
	public void setPay_no(int pay_no) {
		this.pay_no = pay_no;
	}
	public int getCoup_no() {
		return coup_no;
	}
	public void setCoup_no(int coup_no) {
		this.coup_no = coup_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public String getPay_how() {
		return pay_how;
	}
	public void setPay_how(String pay_how) {
		this.pay_how = pay_how;
	}
	public int getPoint_use() {
		return point_use;
	}
	public void setPoint_use(int point_use) {
		this.point_use = point_use;
	}
	public int getPay_price() {
		return pay_price;
	}
	public void setPay_price(int pay_price) {
		this.pay_price = pay_price;
	}
	public String getPay_status() {
		return pay_status;
	}
	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}

	@Override
	public String toString() {
		return "Pay [pay_no=" + pay_no + ", coup_no=" + coup_no + ", order_no=" + order_no + ", pay_how=" + pay_how
				+ ", point_use=" + point_use + ", pay_price=" + pay_price + ", pay_status=" + pay_status + "]";
	}
	
}
