package kr.or.ddit.shop.vo.order;

public class MyOrderVO {

	private int memall_no;
	private int orderall_no;
	private int orderall_price;
	
	public MyOrderVO(int memall_no, int orderall_no, int orderall_price) {
		super();
		this.memall_no = memall_no;
		this.orderall_no = orderall_no;
		this.orderall_price = orderall_price;
	}
	
	public MyOrderVO() {
		
	}
	
	public int getMemall_no() {
		return memall_no;
	}
	public void setMemall_no(int memall_no) {
		this.memall_no = memall_no;
	}
	public int getOrderall_no() {
		return orderall_no;
	}
	public void setOrderall_no(int orderall_no) {
		this.orderall_no = orderall_no;
	}
	public int getOrderall_price() {
		return orderall_price;
	}
	public void setOrderall_price(int orderall_price) {
		this.orderall_price = orderall_price;
	}
	@Override
	public String toString() {
		return "MyOrderVO [memall_no=" + memall_no + ", orderall_no=" + orderall_no + ", orderall_price="
				+ orderall_price + "]";
	}
	
	
	
}
