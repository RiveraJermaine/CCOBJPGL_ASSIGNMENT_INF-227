package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Burgerking bk = new Burgerking();
    Jollibee jolli = new Jollibee();
    Mcdo mcdo = new Mcdo();
    Shakeys shakeys = new Shakeys();
    Wendys wendys = new Wendys();

    public void initialize() {

        bk.setColor("Yellow");
        bk.setTaste("Very Sweet");

        jolli.setColor("Red");
        jolli.setTaste("Sweet");

        mcdo.setColor("Yellow");
        mcdo.setTaste("Very Sweet");

        shakeys.setColor("Red");
        shakeys.setTaste("Sweet");

        wendys.setColor("Yellow");
        wendys.setTaste("Very Sweet");

    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("I love Burgerking");
        }

        if (sourceButton == btn2) {
            alert.setContentText("I love Jollibee");
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("I love Wendys");
        }

        if (sourceButton == btn4) {
            alert.setContentText("I love Shakeys");
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("I love Mcdo");
        }

        alert.showAndWait();

    }
}