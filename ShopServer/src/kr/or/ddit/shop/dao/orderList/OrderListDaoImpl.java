package kr.or.ddit.shop.dao.orderList;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.shop.util.SqlMapClientFactory;
import kr.or.ddit.shop.vo.order.OrderTbVO;

public class OrderListDaoImpl implements IOrderListDao{

	private static SqlMapClient smc;
	
	private static OrderListDaoImpl dao;
	
	private OrderListDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static OrderListDaoImpl getInstance() {
			
		if(dao == null) {
			dao = new OrderListDaoImpl();
		}
			
		return dao;
	}
	
	@Override
	public List<OrderTbVO> getOrderList(int user_no) {
		
		List<OrderTbVO> orderList = null;
		try {
			orderList = (List<OrderTbVO>)smc.queryForList("orderList.getOrderList", user_no);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orderList;
	}

	@Override
	public List<OrderTbVO> getOrderView(int user_no) {
		
		List<OrderTbVO> orderList1 = null;
		try {
			orderList1 = (List<OrderTbVO>)smc.queryForList("orderList.getOrderView", user_no);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orderList1;
	}
	
}
