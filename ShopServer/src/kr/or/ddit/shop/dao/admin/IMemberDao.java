package kr.or.ddit.shop.dao.admin;

import java.util.List;

import kr.or.ddit.shop.vo.member.MemDetailVO;

public interface IMemberDao {

	//���� vo�� �޴� �� ����
	public MemDetailVO selectMemDetail(MemDetailVO vO);
	
	public List<MemDetailVO> selectAllMember();
	
	public int insertMember(MemDetailVO vo);
	
	public int deleteMember(int mem_no);
	
	public int updateMember(MemDetailVO vo);
}
