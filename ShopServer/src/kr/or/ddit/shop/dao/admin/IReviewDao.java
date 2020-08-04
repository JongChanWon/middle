package kr.or.ddit.shop.dao.admin;

import kr.or.ddit.shop.vo.review.ReviewVO;

public interface IReviewDao {
	public int insertReview(ReviewVO vo);
	
	public int blindReview(int rev_num);
	
	public int cancelBlindReview(int rev_num);
	
	public int updateReview(ReviewVO vo);
	
	public int deleteReview(int rev_num);
	
}
