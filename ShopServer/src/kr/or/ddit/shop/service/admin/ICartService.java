package kr.or.ddit.shop.service.admin;

import java.util.List;

import kr.or.ddit.shop.vo.cart.CartVO;

public interface ICartService {
	
	public int addToCart(int prod_no);
	
	public int deleteFromCart(int prod_no);
	
	public int deleteAllCart();
	
	public List<CartVO> selectAllCart();
	
	public CartVO selectCart(int mem_no);
}
