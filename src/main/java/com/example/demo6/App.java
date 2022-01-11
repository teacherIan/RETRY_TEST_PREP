package com.example.demo6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        Scene scene = new Scene(new Pane());

        SwitchScene.setCurrentScene(scene);
        SwitchScene.changeScene("sceneOne.fxml");
        stage.setScene(SwitchScene.getCurrentScene());
        stage.setScene(scene);
        stage.show();

        String hello = "hello";
        String helloTwo = "hello";
        String helloThree = new String("hello");

//        System.out.println(hello == helloTwo);
//        System.out.println(hello.equals(helloTwo));
//
//        System.out.println("---------------");
//        System.out.println(hello == helloThree);
//        System.out.println(hello.equals(helloThree));

    }

    public static void main(String[] args) {
        launch(args);
    }
}
