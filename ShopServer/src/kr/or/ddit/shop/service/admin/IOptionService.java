package kr.or.ddit.shop.service.admin;

import kr.or.ddit.shop.vo.mypage.OptionTbVO;

public interface IOptionService {
	
	public int insertOption(OptionTbVO vo);
	
	public int updateOption(OptionTbVO vo);
	
	public int deleteOption(int option_no);
	
	public OptionTbVO selectOption(int option_no);
}
