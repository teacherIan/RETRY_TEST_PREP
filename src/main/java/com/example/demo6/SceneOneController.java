package com.example.demo6;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Random;

public class SceneOneController {

//    @FXML
//    public void buttonPressed() {
//
//        int newNumber = 0;
//
//        Random random = new Random();
//        newNumber = random.nextInt(200);
//        Stage stage = new Stage();
//        stage.setX(random.nextDouble(2000));
//        stage.setY(random.nextDouble(2000));
//        Scene scene = new Scene(new Pane(),random.nextDouble(newNumber), random.nextDouble(newNumber));
//
//        stage.setScene(scene);
//        stage.show();
//    }
    @FXML
    public void goToSceneTwo() {
        SwitchScene.changeScene("sceneTwo.fxml");
    }


}
