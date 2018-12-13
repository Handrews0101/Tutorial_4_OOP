package fxmlexample;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
 
// Looks at the action and if something happened 
public class FXMLExampleController {
    @FXML private Text actiontarget;
    
 // Looks at when the signin button is pressed
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
    }
}
