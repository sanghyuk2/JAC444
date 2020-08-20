package Task2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SubmitButtonHandler implements EventHandler<ActionEvent> {
	
	@Override
	public void handle(ActionEvent event) {
		System.out.println("Submit Button is Pressed");
		
		// check pin
		//verify();

	}
	
	public boolean verify() {
		if(this.verify()) {
			return true;
		}
		else
			return false;
	}

}
