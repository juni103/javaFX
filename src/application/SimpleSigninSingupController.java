package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import application.forms.LoginForm;
import application.forms.RegisterForm;
import application.handlers.LoginRegiseterTextClickHanlder;
import application.handlers.LoginRegisterButtonsHandler;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class SimpleSigninSingupController implements Initializable {

	@FXML public AnchorPane loginPane;
    @FXML public AnchorPane registerPane;
    @FXML private MaterialDesignIconView closeBtn;
    @FXML private Text loginViewBtn;
    @FXML private Text registerViewBtn;
    @FXML private Button signinBtn;
    @FXML private Button registerBtn;

    //Register Form Fileds
    @FXML private JFXTextField registerUsername;
    @FXML private JFXPasswordField registerPassword;
    @FXML private JFXTextField registerEmail;

    //Login Form Fields
    @FXML private JFXTextField loginUsername;
    @FXML private JFXPasswordField loginPassword;

    private LoginForm loginForm;
    private RegisterForm registerForm;

    @Override
	public void initialize(URL location, ResourceBundle resources) {
//    	AlertUtil.init();
    	loginForm = new LoginForm( loginUsername, loginPassword );
    	registerForm = new RegisterForm(registerUsername, registerPassword, registerEmail);

    	loginViewBtn.setOnMouseClicked( new LoginRegiseterTextClickHanlder(loginPane, registerPane) );
    	registerViewBtn.setOnMouseClicked( new LoginRegiseterTextClickHanlder(loginPane, registerPane) );
    	closeBtn.setOnMouseClicked( new LoginRegiseterTextClickHanlder(loginPane, registerPane) );

    	signinBtn.setOnAction( new LoginRegisterButtonsHandler() );
    	registerBtn.setOnAction( new LoginRegisterButtonsHandler() );
	}

}
