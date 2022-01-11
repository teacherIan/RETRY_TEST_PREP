package com.example.demo6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class SwitchScene {

    private static Scene currentScene;

    /* before we used the setter
    SwitchScene.scene ---->  private static Scene currentScene;

    App.scene ------------>  App.scene
     */

    /*
                                               private static Scene currentScene;
    SwitchScene.scene, App.scene ------------> App.scene

     */

    public static Scene getCurrentScene() {
        return currentScene;
    }

    public static void setCurrentScene(Scene scene) {
        SwitchScene.currentScene = scene;
    }

    public static void changeScene(String fxmlFile) {

        try {
            Parent root = FXMLLoader.load(SwitchScene.class.getResource(fxmlFile));
            currentScene.setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
