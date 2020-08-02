package kr.or.ddit.shop.view.login;

import java.net.URL;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import kr.or.ddit.shop.service.login.ILoginService;
import kr.or.ddit.shop.vo.member.MemAllVO;
import javafx.scene.control.Button;

public class FindIdController implements Initializable{

	@FXML TextField inputHp;
	@FXML TextField inputName;
	@FXML Button btnConfirm;
	@FXML Button btnCancel;
	
	private Registry reg;
	private ILoginService loginService;
	private MemAllVO mv = new MemAllVO();
	
	List<MemAllVO> list = new ArrayList<MemAllVO>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			reg = LocateRegistry.getRegistry(9809);
			loginService = (ILoginService) reg.lookup("LoginService");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		
		btnConfirm.setOnAction(e->{
			
		});
	}
}
