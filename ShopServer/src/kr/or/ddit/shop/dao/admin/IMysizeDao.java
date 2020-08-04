package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.mypage.MySizeVO;

public interface IMysizeDao {
	public int insertMysize(MySizeVO vo);
	
	public int updateMysize(MySizeVO vo);
	
	public int deleteMysize(int MySize_no);
	
	public MySizeVO selectMysize(int MySize_no);
}
