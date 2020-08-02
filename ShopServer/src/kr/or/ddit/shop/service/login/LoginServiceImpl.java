package kr.or.ddit.shop.service.login;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.shop.dao.login.LoginDaoImpl;
import kr.or.ddit.shop.vo.member.MemAllVO;
import kr.or.ddit.shop.vo.member.MemDetailVO;

public class LoginServiceImpl extends UnicastRemoteObject implements ILoginService{
	
	private LoginDaoImpl loginDao;
	private static LoginServiceImpl service; 
	
	protected LoginServiceImpl() throws RemoteException{
		super();
		loginDao = LoginDaoImpl.getInstance();
	}
	
	public static LoginServiceImpl getInstance() throws RemoteException {
		if(service == null) {
			service = new LoginServiceImpl();
		}
		return service;
	}
	@Override
	public MemDetailVO memLogin(MemDetailVO mv) throws RemoteException {
		return loginDao.memLogin(mv);
	}

	@Override
	public List<MemDetailVO> findId(MemDetailVO mv) throws RemoteException {
		
		return loginDao.findId(mv);
	}

	@Override
	public List<MemDetailVO> findPw(MemDetailVO mv) throws RemoteException {
		
		return loginDao.findPw(mv);
	}

}
