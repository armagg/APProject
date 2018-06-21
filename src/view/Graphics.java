package view;

import javafx.scene.control.Button;
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Duration;
import javafx.scene.media.MediaPlayer;

import java.util.ArrayList;
import java.util.Random;

public class Graphics extends Application {


    int x = 100;
    MediaPlayer mediaPlayer;
    int counter = 0;
    boolean finished = false;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Salam");
        primaryStage.setWidth(500);
        primaryStage.setHeight(800);
        primaryStage.setResizable(false);

        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);


        Button button = new Button("START");
        button.setLayoutX(180);
        button.setLayoutY(200);
        button.setFont(Font.font(null, FontWeight.BOLD, 32));
        root.getChildren().addAll(button);



        Button button2 = new Button("START");
        button.setLayoutX(180);
        button.setLayoutY(400);
        button.setFont(Font.font(null, FontWeight.BOLD, 32));
        root.getChildren().addAll(button2);



        Button button3 = new Button("START");
        button.setLayoutX(180);
        button.setLayoutY(600);
        button.setFont(Font.font(null, FontWeight.BOLD, 32));
        root.getChildren().addAll(button3);



        Button button4 = new Button("START");
        button.setLayoutX(180);
        button.setLayoutY(800);
        button.setFont(Font.font(null, FontWeight.BOLD, 32));
        root.getChildren().addAll(button4);


        Text Mute = new Text();
        Mute.setLayoutX(10);
        Mute.setLayoutY(10);
        Mute.setText("PRESS 'M' TO MUTE");
        Mute.setFont(Font.font(null, FontWeight.BOLD, 12));
        root.getChildren().add(Mute);

        Circle circle = new Circle(100,180,5,Color.LIGHTSKYBLUE);
        root.getChildren().addAll(circle);


        scene.setOnKeyPressed(event -> {
            String s = event.getText();

            if (s.equals(" ")){
            }

        });




        SimpleIntegerProperty score = new SimpleIntegerProperty(0);
        Text scoreText = new Text();
        scoreText.setLayoutX(250);
        scoreText.setLayoutY(100);
        scoreText.textProperty().bind(score.asString()); // an example of binding
        scoreText.setFont(Font.font(null, FontWeight.BOLD, 32));
        root.getChildren().add(scoreText);



        Timeline timeline = new Timeline();
        KeyFrame keyFrame = new KeyFrame(Duration.millis(20) , event -> {


            if (finished) {
                root.getChildren().clear();
                Text gameOver = new Text();
                gameOver.setLayoutX(150);
                gameOver.setLayoutY(400);
                gameOver.setText("Game Over...!");
                gameOver.setFont(Font.font(null, FontWeight.BOLD, 32));
                root.getChildren().add(gameOver);

                return;
            }
            counter++;


        });

        timeline.getKeyFrames().add(keyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();



        primaryStage.show();
    }



}