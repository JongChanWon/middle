package kr.or.ddit.shop.view.join;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TESTJoinMain extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("JoinIlban.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root);

		primaryStage.setTitle("챠니네 오까게:) ♥♥♥♥♥♥♥♥♥♥♥♥♥ 먹고, 나누고, 행복해지세요! ♥♥♥♥♥♥♥♥♥♥♥");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}