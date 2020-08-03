package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.board.QnACommentVO;

public interface IQnAComm {
	public int insertQnaCom(QnACommentVO vo);
	
	public int updateQna(QnACommentVO vo);
	
	public int deleteQna(int qnacom_num);
}
