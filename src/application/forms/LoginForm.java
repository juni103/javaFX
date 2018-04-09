package application.forms;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

public class LoginForm {

	private JFXTextField usernameField;
	private JFXPasswordField passwordField;

	public LoginForm(JFXTextField usernameField, JFXPasswordField passwordField) {
		this.usernameField = usernameField;
		this.passwordField = passwordField;
	}

	public void login() {
		String username = usernameField.getText();
		String password = passwordField.getText();

		if( "junaid".equals( username ) && "123456".equals( password )) {
			System.out.println("Successful login.");
		} else {
			System.out.println("username or password is incorrect.");
		}
	}

}
