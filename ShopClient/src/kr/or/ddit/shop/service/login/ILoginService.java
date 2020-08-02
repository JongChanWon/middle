package kr.or.ddit.shop.service.login;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.member.MemDetailVO;

public interface ILoginService extends Remote{
	
	public MemDetailVO memLogin(MemDetailVO mv) throws RemoteException;
	public List<MemDetailVO> findId(MemDetailVO mv) throws RemoteException;
	public List<MemDetailVO> findPw(MemDetailVO mv) throws RemoteException;
}
