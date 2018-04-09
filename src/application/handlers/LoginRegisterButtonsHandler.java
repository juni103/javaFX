package application.handlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class LoginRegisterButtonsHandler implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent event) {
		Button btn = (Button) event.getSource();
		handleBuutonIDs( btn.getId() );
	}

	private void handleBuutonIDs(String btnId) {
		switch (btnId) {
		case "signinBtn":
			handleLoginBtn();
			break;
		case "registerBtn":
			handleRegisterBtn();
		default:
			System.out.println("There is something wrong.");
			break;

		}
	}

	private void handleLoginBtn() {
		System.out.println("signin btn....");
		//login user
	}

	private void handleRegisterBtn() {
		System.out.println("regiseter btn...");
		//register user
	}

}
