package kr.or.ddit.shop.vo.order;

import java.io.Serializable;

public class OrderAll implements Serializable{
	private int orderall_no;
	private int order_no;
	private int opt_no;
	private int order_qty;
	
	public OrderAll() {
	
	}
	
	public OrderAll(int orderall_no, int order_no, int opt_no, int order_qty) {
		super();
		this.orderall_no = orderall_no;
		this.order_no = order_no;
		this.opt_no = opt_no;
		this.order_qty = order_qty;
	}
	
	public int getOrderall_no() {
		return orderall_no;
	}
	public void setOrderall_no(int orderall_no) {
		this.orderall_no = orderall_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getOpt_no() {
		return opt_no;
	}
	public void setOpt_no(int opt_no) {
		this.opt_no = opt_no;
	}
	public int getOrder_qty() {
		return order_qty;
	}
	public void setOrder_qty(int order_qty) {
		this.order_qty = order_qty;
	}

	@Override
	public String toString() {
		return "OrderAll [orderall_no=" + orderall_no + ", order_no=" + order_no + ", opt_no=" + opt_no + ", order_qty="
				+ order_qty + "]";
	}
	
}
