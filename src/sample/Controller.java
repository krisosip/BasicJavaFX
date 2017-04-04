package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Controller {
    public TextField textField;
    public Text justText;
    public Text mirror;
    public VBox leftPanel;

    public void buttonIsPressed(ActionEvent actionEvent) {
        justText.setText(textField.getText());
    }

    public void initialize(){
        mirror.textProperty().bind(textField.textProperty());

        for (int i = 0; i < 5; i++){
            Button btn = new Button("Press " + i);
            leftPanel.getChildren().add(btn);
            btn.setOnAction(this::buttonIsPressed);
        }
    }
}
