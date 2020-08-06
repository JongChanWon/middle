package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.order.OrderTbVO;

public interface IOrder {
	public OrderTbVO selectOrder(int order_no); //주문 하나를 선택
	
		
	public int insertOrder(OrderTbVO vo);

	public int updateOrder(OrderTbVO vo);
	
	//이 아래로 주문 상태 변경하는 메서드 만들기
	//주문 상태 1. 주문완료 2.배송완료 3.환불신청중 4.환불완료(주문취소)
	
	public int orderStatusDelDone(int order_no); //주문상태 배송완료로 변경
	
	public int orderStatusWaitRefund(int order_no); //주문상태 환불신청중으로 변경 

	public int orderStatusRefundDone(int order_no); //주문상태 환불완료로 변경 

	public List<OrderTbVO> getOrderByStatus(String order_status); //주문상태별로 주문 보기
}
