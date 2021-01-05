package sample;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to my first screen");
        Button button1 = new Button("Go to other screen");
        button1.setOnAction(event -> window.setScene(scene2));

        //Layout 1 - children are laid in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        Label label2 = new Label("Welcome to my second screen");
        Button button2 = new Button("Nooo, go back to other screen");
        button2.setOnAction(event -> window.setScene(scene1));

        //Layout 2
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2);
        scene2 = new Scene(layout2, 300, 300);

        window.setScene(scene1);
        window.setTitle("Super Duper GUI");
        window.show();
    }


}
