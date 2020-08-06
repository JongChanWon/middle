package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.order.MyOrderVO;

public interface IMyOrder {

	public MyOrderVO selectOrder(int order_no); //나의 주문 하나를 선택
	
	public int getOrderAllPrice(int memall_no); //누적구매가 구하기
}
