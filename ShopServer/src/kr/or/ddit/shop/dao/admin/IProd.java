package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.prod.ProdVO;

public interface IProd {
	public int insertProd(ProdVO vo);
	
	public int updateProd(ProdVO vo);
	
	public int deleteProd(int Prod_no);
	
	public ProdVO selectProd(int Prod_no);
	
	public List<ProdVO> selectBrandProd(int brand_no);
}
