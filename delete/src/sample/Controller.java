package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Controller {
    @FXML
    private VBox rootBox;

    @FXML
    protected void deletePressed(ActionEvent e) {
        Node parent = ((Node) e.getSource()).getParent();

        rootBox.getChildren().remove(parent);
    }
}
