package kr.or.ddit.shop.service.join;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.member.MemDetailVO;
import kr.or.ddit.shop.vo.zipcode.ZipcodeVO;

public interface IJoinService extends Remote{
	public List<MemDetailVO> selectByMail(String mem_mail) throws RemoteException;
	
	public List<MemDetailVO> selectByNick(String mem_nick) throws RemoteException;
	
	public List<ZipcodeVO> selectByZipcode(String mem_zip) throws RemoteException;
	
	//JoinController 보면 cnt로 들어감
	public int insertMember(MemDetailVO mv) throws RemoteException;

}
