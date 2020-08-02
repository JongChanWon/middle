package kr.or.ddit.shop.view.join;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.member.MemAllVO;
import kr.or.ddit.shop.vo.member.MemDetailVO;
import kr.or.ddit.shop.vo.zipcode.ZipcodeVO;

//service안에도 있으니까 조심
public interface IJoinService extends Remote{
	public List<MemDetailVO> selectByMail(String mem_mail) throws RemoteException;
	
	public List<MemDetailVO> selectByNick(String mem_nick) throws RemoteException;
	
	public List<ZipcodeVO> selectByZipcode(String mem_zip) throws RemoteException;
	
	
	public int insertMember(MemDetailVO mv) throws RemoteException;

}
