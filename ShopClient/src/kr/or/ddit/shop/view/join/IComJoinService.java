package kr.or.ddit.shop.view.join;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.member.BrandVO;
import kr.or.ddit.shop.vo.member.MemAllVO;
import kr.or.ddit.shop.vo.member.MemDetailVO;
import kr.or.ddit.shop.vo.zipcode.ZipcodeVO;

public interface IComJoinService extends Remote{
	public List<BrandVO> selectByBrandNo(String brand_no) throws RemoteException;

		
		//public int insertComMember(ReadyComVO rvo) throws RemoteException;
		



}
