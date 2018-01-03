package claw0ed.main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Lab01 extends Application {

	@Override
	public void start(Stage pStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/claw0ed/view/Lab01.fxml"));
		
		pStage.setTitle("성적처리 프로그램 v1.0");
		pStage.getIcons().add(new Image("/claw0ed/icons/twitter.png"));
		pStage.setScene(new Scene(root)); // 크기 지정 안하면 기본 크기
		
		pStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
