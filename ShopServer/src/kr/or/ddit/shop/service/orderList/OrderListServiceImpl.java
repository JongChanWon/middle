package kr.or.ddit.shop.service.orderList;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.shop.dao.orderList.OrderListDaoImpl;
import kr.or.ddit.shop.vo.order.OrderTbVO;

public class OrderListServiceImpl extends UnicastRemoteObject implements IOrderListService{

	OrderListDaoImpl orderDao; // 사용할 다오 멤버변수 선언
	private static OrderListServiceImpl service; // 싱글톤 패턴
	
	private OrderListServiceImpl() throws RemoteException{
		super();
		orderDao = OrderListDaoImpl.getInstance(); // 싱글톤 패턴
	}
	
	public static OrderListServiceImpl getInstance() throws RemoteException {
		if(service== null) {
			service = new OrderListServiceImpl();
		}
		return service;
	}
	
	@Override
	public List<OrderTbVO> getOrderList(int user_no) throws RemoteException {
		
		return orderDao.getOrderList(user_no);
	}

	@Override
	public List<OrderTbVO> getOrderView(int user_no) throws RemoteException {
		
		return orderDao.getOrderView(user_no);
	}

}
