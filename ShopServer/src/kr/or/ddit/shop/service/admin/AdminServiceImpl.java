package kr.or.ddit.shop.service.admin;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import kr.or.ddit.shop.dao.admin.AdminDaoImpl;
import kr.or.ddit.shop.vo.admin.AdmwrtVO;
import kr.or.ddit.shop.vo.admin.BlackVO;
import kr.or.ddit.shop.vo.member.MemAllVO;

public class AdminServiceImpl extends UnicastRemoteObject implements IAdminService{

	AdminDaoImpl dao;
	private static AdminServiceImpl service;
	
	private AdminServiceImpl() throws RemoteException{
		
		dao = AdminDaoImpl.getInstance();
	}
	
	public static AdminServiceImpl getInstance() throws RemoteException{
		if(service == null) {
			service = new AdminServiceImpl();
		}
		return service;
	}
	//블랙리스트
	@Override
	public List<BlackVO> getAllBlackMem() throws RemoteException{
		return dao.getAllBlackMem();
	}

	@Override
	public int insertBlackMem(BlackVO bv) throws RemoteException {
		return dao.insertBlackMem(bv);
	}

	@Override
	public int deleteBlackMem(BlackVO bv) throws RemoteException {
		return dao.deleteBlackMem(bv);
	}

	//공지사항
	@Override
	public List<AdmwrtVO> getCommonNotice() throws RemoteException {
		return dao.getCommonNotice();
	}

	@Override
	public List<AdmwrtVO> getCompanyNotice() throws RemoteException {
		return dao.getCompanyNotice();
	}

	@Override
	public int insertNotice(AdmwrtVO av) throws RemoteException {
		return dao.insertNotice(av);
	}

	@Override
	public int deleteNotice(AdmwrtVO av) throws RemoteException {
		return dao.deleteNotice(av);
	}


}
