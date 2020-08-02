package kr.or.ddit.shop.service.admin;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import kr.or.ddit.shop.vo.admin.AdmwrtVO;
import kr.or.ddit.shop.vo.admin.BlackVO;
import kr.or.ddit.shop.vo.member.MemAllVO;

public interface IAdminService extends Remote{
	
	// 일반회원 블랙리스트 CRUD
		public List<BlackVO> getAllBlackMem() throws RemoteException; // 모든 블랙회원리스트 조회
		public int insertBlackMem(BlackVO bv) throws RemoteException; // 블랙리스트에 추가
		public int deleteBlackMem(BlackVO bv) throws RemoteException; // 블랙리스트 삭제
		
	// 공지사항 CRUD
		public List<AdmwrtVO> getCommonNotice(); // 일반회원 공지사항 조회
		public List<AdmwrtVO> getCompanyNotice(); // 업체회원 공지사항 조회
		public int insertNotice(AdmwrtVO av); // 공지사항 추가
		public int deleteNotice(AdmwrtVO av); // 공지사항 삭제
}
