package kr.or.ddit.shop.vo.cart;

import java.io.Serializable;

public class CartVO implements Serializable{

	private int memall_no  ;
	private int opt_no ;
	private int cart_qty;
	
	public CartVO() {
		// TODO Auto-generated constructor stub
	}

	public CartVO(int prod_no, int mem_no, int cart_qty) {
		super();
		this.opt_no = prod_no;
		this.memall_no = mem_no;
		this.cart_qty = cart_qty;
	}

	public int getProd_no() {
		return opt_no;
	}

	public void setProd_no(int prod_no) {
		this.opt_no = prod_no;
	}

	public int getMem_no() {
		return memall_no;
	}

	public void setMem_no(int mem_no) {
		this.memall_no = mem_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	@Override
	public String toString() {
		return "CartVO [prod_no=" + opt_no + ", mem_no=" + memall_no + ", cart_qty=" + cart_qty + "]";
	}
	
	
}
