package claw0ed.controller;

import java.lang.Thread.State;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

import javax.swing.text.TabableView;

import claw0ed.model.SungJukModel;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

// implements Initializable 초기화
public class Lab01Controller implements Initializable {
	// 각종 컨트롤이 화면이 표시되기 전애
	// 미리 수행되어야 할 작업이 있다면
	// 인터페이스를 구현하고
	// Initializable 라는 메서드를 재정의하면 된다
	
	// 뷰에 정의된 컨트롤의 멤버변수 선언
	@FXML private TextField fxName;
	@FXML private TextField fxKor;
	@FXML private TextField fxEng;
	@FXML private TextField fxMat;
	
	// 테이블뷰와 테이블컬럼관련 멤버변수
	@FXML private TableView<SungJukModel> sjtable;
	@FXML private TableColumn<SungJukModel, String> sjname;
	@FXML private TableColumn<SungJukModel, String> sjkor;
	@FXML private TableColumn<SungJukModel, String> sjeng;
	@FXML private TableColumn<SungJukModel, String> sjmat;
	@FXML private TableColumn<SungJukModel, String> sjtot;
	@FXML private TableColumn<SungJukModel, String> sjavg;
	@FXML private TableColumn<SungJukModel, String> sjgrd;
	
	// 컨트롤애서 기타 목적으로 선언하는 변수
	private ObservableList<SungJukModel> sjlist = null;
	// Observer 패턴이 적용된 List 클래스
	// Observer 패턴 : 한 객체의 상태가 바뀌면
	// 그 객체의 의존하는 다름 객체들에게 그 정보를 알려주게 작성하는 방식
	// 하나의 주체를 여러 개체가 구독하는 1:다 관계
	
	private static int sjcnt = 0;
	// 전체 학생 수 저장용 변수

	// "추가"버튼 클릭시 이벤트 처리 메서드
	public void addSungjuk(ActionEvent ae) {

	}
	
	// "수정"버튼 클릭시 이벤트 처리 메서드
	public void modifySungjuk(ActionEvent ae) {
		
	}
	
	// "삭제"버튼 클릭시 이벤트 처리 메서드
	public void removeSungjuk(ActionEvent ae) {
		
	}
	
	// 마우스 버튼 더블클릭시 발생하는 이벤트 처리 메서드
	public void clickSungjuk(MouseEvent me) {
		
	}

	// 랩01이 읽혀지고 로드한후
	// 각종 유아이 요소에 대한 초가화 작업을 수행
	// 또는 기타 초기화 작업 (디비/파일연결, 종료등) 수행
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 자바에프엑스 빈즈규약에 따라 작성된 성적보델과
		// 데이블뷰의 각 컬럼과 바인딩 시키는 작업 필요
		// 즉, 해당 컬럼에 표시될 데이터와 종류를 결정
		sjname.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("name"));
		sjkor.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("kor"));
		sjeng.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("eng"));
		sjmat.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("mat"));
		sjtot.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("tot"));
		sjavg.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("avg"));
		sjgrd.setCellValueFactory(new PropertyValueFactory<SungJukModel, String>("grd"));
		
		sjlist = FXCollections.observableArrayList();
		// 자바에프엑스에서 지원하는 Collection 중
		// 옵져버패턴이 적용된 ArrayList 객체 생성
		
		// observableArrayList에 성적데이터 추가
		SungJukModel sj = new SungJukModel("혜교", 99+"", 98+"", 99+"");
		sjlist.add(sj);
		
		sj = new SungJukModel("지현", 45+"", 56+"", 98+"");
		sjlist.add(sj);
		
		sj = new SungJukModel("수지", 78+"", 23+"", 65+"");
		sjlist.add(sj);
		
		// 테이블 뷰에 생성된 성적데이터 겍체를 지정
		sjtable.setItems(sjlist);
		
		sjcnt = sjlist.size();
		
	}

}
