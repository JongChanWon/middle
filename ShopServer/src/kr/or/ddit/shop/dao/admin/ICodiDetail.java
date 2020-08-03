package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.codi.CodiDetailVO;

public interface ICodiDetail {
	
	public int insertCodiDetail(CodiDetailVO vo);
	
	public int updateCodiDetail(CodiDetailVO vo);
	
	public int deleteCodiDetail(int codiDetail_no);
}
