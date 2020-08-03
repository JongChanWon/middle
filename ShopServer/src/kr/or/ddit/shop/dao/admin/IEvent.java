package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.admin.EventVO;

public interface IEvent {
	public int insertEvent(EventVO vo);
	
	public int addEvent(EventVO vo);
	
	public int updateEvent(EventVO vo);
	
	public EventVO selectEvent(EventVO vo);
	
	public List<EventVO> selectAllEvent();
}
