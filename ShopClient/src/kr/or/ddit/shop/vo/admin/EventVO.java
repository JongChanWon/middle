package kr.or.ddit.shop.vo.admin;

import java.io.Serializable;

public class EventVO implements Serializable{

	private int event_no    ;
	private String event_title ;
	private String event_cont  ;
	
	public EventVO() {
		// TODO Auto-generated constructor stub
	}

	public EventVO(int event_no, String event_title, String event_cont) {
		super();
		this.event_no = event_no;
		this.event_title = event_title;
		this.event_cont = event_cont;
	}

	public int getEvent_no() {
		return event_no;
	}

	public void setEvent_no(int event_no) {
		this.event_no = event_no;
	}

	public String getEvent_title() {
		return event_title;
	}

	public void setEvent_title(String event_title) {
		this.event_title = event_title;
	}

	public String getEvent_cont() {
		return event_cont;
	}

	public void setEvent_cont(String event_cont) {
		this.event_cont = event_cont;
	}

	@Override
	public String toString() {
		return "EventVO [event_no=" + event_no + ", event_title=" + event_title + ", event_cont=" + event_cont + "]";
	}
	
	
}
