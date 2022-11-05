import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainFormController {

    public ComboBox<String> cmbLanguage;
    public TextField txtManual;

    public void initialize() {


    }

    public void clickMe(MouseEvent mouseEvent) {
        setData();
    }

    public void addOnAction(ActionEvent actionEvent) {
        setData();
    }
    private void setData(){
        cmbLanguage.getItems().add(txtManual.getText());
        txtManual.clear();
    }
}
