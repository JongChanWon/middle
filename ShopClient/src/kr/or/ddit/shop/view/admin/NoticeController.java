package kr.or.ddit.shop.view.admin;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import kr.or.ddit.shop.service.admin.IAdminService;
import kr.or.ddit.shop.vo.admin.AdmwrtVO;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class NoticeController implements Initializable{

	private Registry reg;
	private IAdminService ias;
	private ObservableList<AdmwrtVO> commonTableData, companyTableData;
	private ArrayList<AdmwrtVO> list;
	
	
	@FXML TableView<AdmwrtVO> tb_noticeView;
	@FXML TableColumn<AdmwrtVO, Integer> colNo;
	@FXML TableColumn<AdmwrtVO, String> colTitle;
	@FXML TableColumn<AdmwrtVO, String> colDate;
	@FXML Button btn_reg;
	@FXML Button btn_revise;
	@FXML Button btn_delete;
	@FXML Button btn_home;
	@FXML Button btn_common;
	@FXML Button btn_company;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		try {
			reg = LocateRegistry.getRegistry("localhost", 9809);
			ias = (IAdminService) reg.lookup("AdminService");
			System.out.println("rmi 성공!!");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		colNo.setCellValueFactory(new PropertyValueFactory<>("admwrt_no"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("admwrt_title"));
		colDate.setCellValueFactory(new PropertyValueFactory<>("admwrt_date"));

		// 공통 공지사항 전체조회
		btn_common.setOnAction(e->{
			
			
			list = (ArrayList<AdmwrtVO>) ias.getCommonNotice();
			
			commonTableData = FXCollections.observableArrayList(list);
			
			tb_noticeView.setItems(commonTableData);
			
			
		});
	}


}
