package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.mypage.ZzimVO;

public interface IZzim {
	public int insertZzim(ZzimVO vo);
	
	public int deleteAllZzim(int zzim_no);
	
	public int deleteZzim(int zzim_no);
	
	public List<ZzimVO> selectAllZzim(); //나의 찜 모두 선택
	
	public ZzimVO selectZzim(int zzim_no); //찜 하나 선택
}
