package kr.or.ddit.shop.service.orderList;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.order.OrderTbVO;

public interface IOrderListService extends Remote {
	
	public List<OrderTbVO> getOrderList(int user_no) throws RemoteException; 
	
	public List<OrderTbVO> getOrderView(int user_no) throws RemoteException;
}
