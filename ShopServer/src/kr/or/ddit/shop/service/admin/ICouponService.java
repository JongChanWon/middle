package kr.or.ddit.shop.service.admin;

import java.util.List;

import kr.or.ddit.shop.vo.coupon.CouponVO;

public interface ICouponService {
	
	public int insertCoupon(CouponVO vo);
	
	public int addCoupon(CouponVO vo);
	
	public int updateCoupon(CouponVO vo);
	
	public CouponVO selectCoupon(CouponVO vo);
	
	public List<CouponVO> selectAllCoupon();
}
