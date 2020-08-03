package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.codi.CodiVO;

public interface ICodi {
	public int insertCodi(CodiVO vo);
	
	public int updateCodi(CodiVO vo);
	
	public int deleteCodi(int codi_no);
}
