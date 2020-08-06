package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.review.ReviewVO;

public interface IReview {
	public List<ReviewVO> getMyReviews(int memall_no);
	
	public int insertReview(ReviewVO vo);
	
	public int updateReview(ReviewVO vo);
	
	public int deleteReview(int rev_num);
	
	public int blindReview(int rev_num);
	
	public int unBlindReview(int rev_num);
	
}
