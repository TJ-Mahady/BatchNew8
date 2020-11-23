package com.syntax.class29;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.*;

public class GUIAppPart2 extends Application {

    public static void main(String[] args) {

        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Button button=new Button("Click Me");
        Label label=new Label("Enter Your name");
        VBox vBoxLayout=new VBox();
        vBoxLayout.getChildren().add(label);
        vBoxLayout.getChildren().add(button);
        Scene scene= new Scene(vBoxLayout,600,600);
        primaryStage.setTitle("Next Billion Dollar App");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
