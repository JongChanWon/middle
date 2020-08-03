package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.board.QnAVO;

public interface IQnA {
	public int insertQna(QnAVO vo);
	
	public int updateQna(QnAVO vo);
	
	public int deleteQna(int qna_num);
	
}
