package controller_view;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class LoginCreateAccountPane extends GridPane {
  
  private Label label = new Label("Login or Create Account");
 
  public LoginCreateAccountPane() { 
    this.add(label, 0, 0);
  }
}