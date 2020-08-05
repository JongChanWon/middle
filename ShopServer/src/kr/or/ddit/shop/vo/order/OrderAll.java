package kr.or.ddit.shop.vo.order;

import java.io.Serializable;

public class OrderAll implements Serializable{
	private int orderall_no;
	private int order_no;
	private int prod_no;
	private int opt_no;
	private int prod_ordqty;
	private int prod_price;
	
	public OrderAll() {
	
	}

	public OrderAll(int orderall_no, int order_no, int prod_no, int opt_no, int prod_ordqty, int prod_price) {
		super();
		this.orderall_no = orderall_no;
		this.order_no = order_no;
		this.prod_no = prod_no;
		this.opt_no = opt_no;
		this.prod_ordqty = prod_ordqty;
		this.prod_price = prod_price;
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

	public int getProd_no() {
		return prod_no;
	}

	public void setProd_no(int prod_no) {
		this.prod_no = prod_no;
	}

	public int getOpt_no() {
		return opt_no;
	}

	public void setOpt_no(int opt_no) {
		this.opt_no = opt_no;
	}

	public int getProd_ordqty() {
		return prod_ordqty;
	}

	public void setProd_ordqty(int prod_ordqty) {
		this.prod_ordqty = prod_ordqty;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	@Override
	public String toString() {
		return "OrderAll [orderall_no=" + orderall_no + ", order_no=" + order_no + ", prod_no=" + prod_no + ", opt_no="
				+ opt_no + ", prod_ordqty=" + prod_ordqty + ", prod_price=" + prod_price + "]";
	}

	
}
