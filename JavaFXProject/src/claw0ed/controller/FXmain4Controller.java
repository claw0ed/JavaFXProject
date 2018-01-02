package claw0ed.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FXmain4Controller {

	// FXML에 정의된 컨트롤을 Controller 에서
	// 제어하기 위해 멤버변수로 정의
	@FXML TextField uid;
	@FXML PasswordField pwd;
	@FXML Label loginok;
	@FXML Label loginno;
	
	// FXML에 정의된 컨트롤의 이벤트를 처리하기 위해
	// 이벤트 처리 메서드 정의
	String isLogin = "로그인 실패!!";
	
	public void go2login(ActionEvent ae) {
		if(uid.getText().equals("claw0ed") && pwd.getText().equals("123456")) {
			System.out.println("로그인 성공!!");
			isLogin = "로그인 성공!!";
			loginok.setVisible(true);
		} else {
			System.out.println("로그인 실패!!");
			loginno.setVisible(true);
		}
			
		// 대화상자 만들기
		Alert dialog = new Alert(Alert.AlertType.WARNING);
		dialog.setTitle(isLogin);
		dialog.setHeaderText(isLogin);
		dialog.setContentText(isLogin);
		
		// 대화상자 화면에 표시
		dialog.showAndWait();
	}
	
	public void  go2reset(ActionEvent ae) {
		// 입력상자의 모든 내용을 지움
		uid.setText("");
		pwd.clear();
		loginok.setVisible(false);
		loginno.setVisible(false);
		
	}
}
