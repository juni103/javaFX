package application.handlers;

import application.SimpleSigninSingupController;
import application.utils.AppUtils;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class LoginRegiseterTextClickHanlder extends SimpleSigninSingupController implements EventHandler<MouseEvent> {

	@Override
	public void handle(MouseEvent event) {
		Object obj = event.getSource();
		String objId = null;

		if( obj instanceof Label ) {
			objId = ((Label) obj).getId() ;
		} else if( obj instanceof Text ) {
			objId = ((Text) obj).getId() ;
		} else if ( obj instanceof MaterialDesignIconView ) {
			objId= ((MaterialDesignIconView) obj).getId();
		}

		handleTextClick( objId );
	}

	private void handleTextClick( String objId ) {
		switch( objId ) {
		case "registerViewBtn":
			handleRegisterBtn();
			break;
		case "loginViewBtn":
			handleLoginBtn();
			break;
		case "closeBtn":
			AppUtils.exitApp();
		default:
			break;
		}
	}

	private void handleRegisterBtn() {
		if( !registerPane.isVisible() ) {
			loginPane.setVisible(false);
			registerPane.setVisible(true);
		}
	}

	private void handleLoginBtn() {
		if( !loginPane.isVisible() ) {
			registerPane.setVisible(false);
			loginPane.setVisible(true);
		}
	}

}
