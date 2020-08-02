package kr.or.ddit.shop.dao.orderList;

import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.order.OrderTbVO;

public interface IOrderListDao {
	public List<OrderTbVO> getOrderList(int user_no);
	
	public List<OrderTbVO> getOrderView(int user_no);
}
