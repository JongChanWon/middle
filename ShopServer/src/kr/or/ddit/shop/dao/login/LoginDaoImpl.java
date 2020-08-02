package kr.or.ddit.shop.dao.login;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.shop.util.SqlMapClientFactory;
import kr.or.ddit.shop.vo.member.MemAllVO;
import kr.or.ddit.shop.vo.member.MemDetailVO;

public class LoginDaoImpl implements ILoginDao{
	
	private SqlMapClient smc;
	private static LoginDaoImpl dao;
	
	private LoginDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	public static LoginDaoImpl getInstance() {
		if(dao == null) {
			dao = new LoginDaoImpl();
		}
		return dao;
	}
	
	@Override
	public MemDetailVO memLogin(MemDetailVO mv) throws RemoteException {
		MemDetailVO mvo = null;
		try {
			mvo = (MemDetailVO) smc.queryForObject("login.loginSelect", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mvo;
	}

	@Override
	public List<MemDetailVO> findId(MemDetailVO mv) throws RemoteException {
		List<MemDetailVO> memList = null;
		
		try {
			memList = smc.queryForList("LoginFindId", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}
	
	@Override
	public List<MemDetailVO> findPw(MemDetailVO mv) throws RemoteException {
		List<MemDetailVO> memList = null;
		
		try {
			memList = smc.queryForList("LoginFindPw", mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memList;
	}

}
