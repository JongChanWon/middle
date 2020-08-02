package kr.or.ddit.shop.view.login;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);


		primaryStage.setTitle("챠니네 오까게 ♥♥♥♥♥♥♥♥♥♥♥ 패셔니스타가 되는 그날까지 ♥♥♥♥♥♥♥♥♥♥♥");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
 
}