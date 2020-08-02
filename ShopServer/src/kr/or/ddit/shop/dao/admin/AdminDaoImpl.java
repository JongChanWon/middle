package kr.or.ddit.shop.dao.admin;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.shop.util.SqlMapClientFactory;
import kr.or.ddit.shop.vo.admin.AdmwrtVO;
import kr.or.ddit.shop.vo.admin.BlackVO;
import kr.or.ddit.shop.vo.member.MemAllVO;

public class AdminDaoImpl implements IAdminDao{

	private SqlMapClient smc;
	
	private static AdminDaoImpl dao = new AdminDaoImpl();
	
	private AdminDaoImpl() {
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static AdminDaoImpl getInstance() {
		if(dao == null) {
			dao = new AdminDaoImpl();
		}
		return dao;
	}
	
	@Override
	public List<BlackVO> getAllBlackMem() {

		ArrayList<BlackVO> blackMemList = new ArrayList<BlackVO>();
		
		try {
			blackMemList = (ArrayList<BlackVO>) smc.queryForList("getAllBlackMember");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return blackMemList;
	}

	@Override
	public int insertBlackMem(BlackVO bv) {
		
		int cnt = 0;
		
		try {
			cnt = smc.update("insertBlackMem", bv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteBlackMem(BlackVO bv) {

		int cnt = 0;
		
		try {
			cnt = smc.update("deleteBlackMem", bv);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}
////////////////공지사항/////////////
	@Override
	public List<AdmwrtVO> getCommonNotice() {

		ArrayList<AdmwrtVO> commonNoticeList = new ArrayList<AdmwrtVO>();
		
		try {
			commonNoticeList = (ArrayList<AdmwrtVO>) smc.queryForList("getCommonNotice");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commonNoticeList;
	}

	@Override
	public List<AdmwrtVO> getCompanyNotice() {

		ArrayList<AdmwrtVO> companyNoticeList = new ArrayList<AdmwrtVO>();
		
		try {
			companyNoticeList = (ArrayList<AdmwrtVO>)smc.queryForList("getCompanyNotice");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return companyNoticeList;
	}
	
	@Override
	public int insertNotice(AdmwrtVO av) {

		int cnt = 0;
		
		try {
			cnt = smc.update("insertNotice", av);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int deleteNotice(AdmwrtVO av) {

		int cnt = 0;
		
		try {
			cnt = smc.update("deleteNotice", av);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnt;
	}

//adfasfad
}
