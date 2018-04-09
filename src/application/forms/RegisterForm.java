package application.forms;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

public class RegisterForm {

	private JFXTextField usernameField;
    private JFXPasswordField passwordField;
    private JFXTextField emailField;

    public RegisterForm(JFXTextField usernameField, JFXPasswordField passwordField, JFXTextField emailField) {
    	this.usernameField = usernameField;
    	this.passwordField = passwordField;
    	this.emailField = emailField;
    }
}
