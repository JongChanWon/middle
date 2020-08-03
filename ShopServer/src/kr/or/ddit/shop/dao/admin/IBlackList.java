package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.admin.BlackVO;

public interface IBlackList {
	public BlackVO selectBlack(BlackVO vo);
	
	public List<BlackVO> getOneBlack(int mem_no);
	
	public int addBlack(BlackVO vo);
	
	public int cancelBlack(BlackVO vo);
}
