package kr.or.ddit.shop.view.orderList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OrderListMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("주문내역 조회 - 54.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setTitle("챠니의 오까게에 오신걸 환영합니다♥♥♥♥ 모두 패셔니스타가 되는 그날까지 ♥♥♥♥");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
