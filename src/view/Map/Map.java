package view.Map;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import view.MainMenu.Main;

import java.net.URL;


public class Map extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        PlayerShape playerShape = new PlayerShape();
        primaryStage.setTitle("Salam");
        primaryStage.setWidth(1280);
        primaryStage.setHeight(720);
        primaryStage.setResizable(false);

        Pane root = new Pane();
        Scene scene = new Scene(root);
        scene.getStylesheets().addAll(this.getClass().getResource("backgroundMap.css").toExternalForm());
        primaryStage.setScene(scene);
        root.setId("pane");
        root.getChildren().addAll(playerShape.imageView);


        Image image = new Image(getClass().getResourceAsStream("return-arrow.png"));
        Button button4 = new Button();
        button4.setLayoutX(-400);
        button4.setLayoutY(130);
        button4.setGraphic(new ImageView(image));
        button4.setScaleX(0.1);
        button4.setScaleY(0.1);
        button4.setFont(Font.font(null, FontWeight.BOLD, 20));
        button4.setStyle(
                "-fx-background-color: transparent"
        );
        button4.getStylesheets().addAll(this.getClass().getResource("../MainMenu/glow-of-setting-and-exit.css").toExternalForm());
        root.getChildren().addAll(button4);

        button4.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                final URL resource = getClass().getResource("button.mp3");
                final Media media = new Media(resource.toString());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setCycleCount(1);
                mediaPlayer.play();

                }
        }
        );

        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                view.MainMenu.Main menu = new Main();
                try {
                    menu.start(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        );

        scene.setOnKeyPressed(event -> {

            switch (event.getCode()){
                case LEFT: playerShape.goLeft();
                    break;
                case UP:  playerShape.goUp();
                    break;
                case RIGHT:  playerShape.goRight();
                    break;
                case DOWN: playerShape.goDown();
                    break;
            }
        });

        scene.setOnKeyReleased(event -> {

        });


        primaryStage.show();
    }
}
