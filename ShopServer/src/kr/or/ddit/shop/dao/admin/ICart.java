package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.cart.CartVO;

public interface ICart {
	public int addToCart(int prod_no);
	
	public int deleteFromCart(int prod_no);
	
	public int deleteAllCart();
	
	public List<CartVO> selectAllCart();
	
	public CartVO selectCart(int mem_no);
}
