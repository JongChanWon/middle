package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.mypage.ZzimVO;

public interface IZzimDao {
	public int insertZzim(ZzimVO vo);
	
	public int deleteAllZzim(int zzim_no);
	
	public int deleteZzim(int zzim_no);
	
	public List<ZzimVO> selectAllZzim();
	
	public ZzimVO selectZzim(int zzim_no);
}
