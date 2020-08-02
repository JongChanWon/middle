package kr.or.ddit.shop.view.home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import kr.or.ddit.shop.session.LoginSession;
import kr.or.ddit.shop.vo.member.MemAllVO;

public class HomeController implements Initializable {

	@FXML private ImageView btnHome;
	@FXML private Button btnSearch;
	@FXML private Button btnRank;
	@FXML private Button btnUpdate;
	@FXML private Button btnBrand;
	@FXML private Button btnCodi;
	@FXML private Button btnEvent;
	@FXML private Button btnFirst;
	@FXML private Button btnSecond;
	@FXML private Button btnThird;
	@FXML private Button btnFourth;
	@FXML private Button btnFifth;
	@FXML private Button btnSixth;
	@FXML private Button btnSeventh;
	@FXML private Button btnBest;
	@FXML private Button btnTop;
	@FXML private Button btnOuter;
	@FXML private Button btnPants;
	@FXML private Button btnSkirt;
	@FXML private Button btnAccessory;
	@FXML private Button btnShoes;
	@FXML private ImageView btnChatbot;
	@FXML private ImageView btnCart;
	@FXML private ImageView btnRecentOne;
	@FXML private ImageView btnRecentTwo;
	@FXML private TextField txtf_search;
	
	MemAllVO mv = LoginSession.session;
	Stage primaryStage = new Stage();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		

		//비로그인 상태인 경우
		btnFirst.setOnAction(e -> logIn());
		btnSecond.setOnAction(e-> join());
		btnThird.setOnAction(e -> findIDorPW());
		btnFourth.setOnAction(e -> goCart());
		btnFifth.setOnAction(e -> goOrder());
		btnSixth.setOnAction(e -> goFAQ());
		btnSeventh.setOnAction(e -> goNotice());
		
		//일반회원 로그인 상태인 경우
		btnFirst.setOnAction(e -> logIn());
		btnSecond.setOnAction(e-> goCart());
		btnThird.setOnAction(e -> goMyPage());
		btnFourth.setOnAction(e -> goOrder());
		btnFifth.setOnAction(e -> goFAQ());
		btnSixth.setOnAction(e -> goNotice());
		btnSeventh.setOnAction(e -> goCart());
		
		
		//업체 관리자 로그인 상태인 경우
		btnFirst.setOnAction(e -> logIn());
		btnSecond.setText("나이키" + "관리자님");
		btnThird.setOnAction(e -> goBAdmin());
		btnFourth.setOnAction(e -> goManageProd());
		btnFifth.setOnAction(e -> goStat());
		btnSixth.setOnAction(e -> goFAQ());
		btnSeventh.setOnAction(e -> goNotice());
		
		//관리자 로그인 상태인 경우
		btnFirst.setOnAction(e -> logIn());
		btnSecond.setOnAction(e-> goAdminPage());
		btnThird.setOnAction(e -> goManageMem());
		btnFourth.setOnAction(e -> goManageProd());
		btnFifth.setOnAction(e -> goStat());
		btnSixth.setOnAction(e -> goNotice());
		btnSeventh.setOnAction(e -> goCart());
		
		btnBest.setOnAction(e -> goBest());;
		btnTop.setOnAction(e -> goTop());
		btnOuter.setOnAction(e -> goOuter());
		btnPants.setOnAction(e -> goPants());
		btnSkirt.setOnAction(e -> goSkirt());
		btnAccessory.setOnAction(e -> goAcc());
		btnShoes.setOnAction(e -> goShoes());
		
		
	}
	
	@FXML
    private void goMain(ActionEvent e){
        System.out.println("Hello");
    }

	private void goShoes() {
	}

	private void goAcc() {
	}

	private void goSkirt() {
	}

	private void goPants() {
	}

	private void goOuter() {
	}

	private void goTop() {
	}

	private void goBest() {
	}

	private void goManageMem() {
	}

	private void goAdminPage() {
	}

	private void goStat() {
	}

	private void goManageProd() {
	}

	private void goBAdmin() {
	}

	private void goMyPage() {
	}

	private void goNotice() {
	}

	private void goFAQ() {
	}

	private void goOrder() {
	}

	private void goCart() {
	}

	private void findIDorPW() {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.APPLICATION_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("챠니네오까게 ID/PW 찾기"); 
		Parent parent = null;
		
		try {
			parent = FXMLLoader.load(getClass().getResource("/kr/or/ddit/shop/view/logIn/BeforeFindIDPW.fxml"));
		} catch (IOException e) {
			System.out.println("id,비밀번호 찾기 쪽문제");
			e.printStackTrace();
		}
		 Scene scene = new Scene(parent);
         
	        dialog.setScene(scene);
	        dialog.setResizable(false); 
	        dialog.show();
	}

	private void join() {
	}

	private void logIn() {
		
	}

}
