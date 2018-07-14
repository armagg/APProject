package view.MainMenu;

import Models.Battle;
import Models.Heroes.Hero;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import view.Map.Map;

import java.net.URL;
import java.util.Scanner;

import static java.lang.System.clearProperty;
import static java.lang.System.exit;

/*public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static Hero hero;

    public static void setHero(Hero hero) {
        Main.hero = hero;
    }

    //TODO

    static public String showMenu() {
        System.out.println("1. Enter Shop : to enter shop and buy or sell Cards and Items \n" +
                "2. Edit Inventory\n" +
                "3. Next : To go to deck and amulet customization ");
        String s = scanner.nextLine();
        return s;
    }


    public static int nextMenu() {
        String s = scanner.next();
        if (s.equals("help")) {
            showMenu();
            return 0;
        } else {
            return Integer.parseInt(s);
        }
    }

    public static void GilPrinter() {
        System.out.println(hero.getGil());
    }

}*/

public class Main extends Application{

    static Scanner scanner = new Scanner(System.in);
    private static Hero hero;
    boolean sound = true;
    public static void setHero(Hero hero) {
        Main.hero = hero;
    }

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("Salam");
            primaryStage.setWidth(1280);
            primaryStage.setHeight(720);
            primaryStage.setResizable(false);

            Pane root = new Pane();
            Scene scene = new Scene(root);

            scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
            primaryStage.setScene(scene);
            root.setId("pane");

            final URL resource = getClass().getResource("1.mp3");
            final Media media = new Media(resource.toString());
             MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
            mediaPlayer.play();

            Image image;
            Button button = new Button("SINGLE PLAYER");
            button.setLayoutX(570);
            button.setLayoutY(30);
            button.setFont(Font.font(null, FontWeight.BOLD, 20));
            button.setFont(new Font(2));
            button.getStylesheets().addAll(this.getClass().getResource("shiny-orrange-button.css").toExternalForm());
            root.getChildren().addAll(button);

            Button button2 = new Button("CUSTOM GAME");
            button2.setLayoutX(570);
            button2.setLayoutY(130);
            button2.setFont(Font.font(null, FontWeight.BOLD, 20));
            button2.getStylesheets().addAll(this.getClass().getResource("shiny-orrange-button.css").toExternalForm());
            root.getChildren().addAll(button2);


            Button button3 = new Button("MULTI PLAYER");
            button3.setLayoutX(575);
            button3.setLayoutY(230);
            button3.setFont(Font.font(null, FontWeight.BOLD, 20));
            button3.getStylesheets().addAll(this.getClass().getResource("shiny-orrange-button.css").toExternalForm());
            root.getChildren().addAll(button3);

            image = new Image(getClass().getResourceAsStream("2.png"));
            Button button4 = new Button();
            button4.setLayoutX(-400);
            button4.setLayoutY(30);
            button4.setGraphic(new ImageView(image));
            button4.setScaleX(0.1);
            button4.setScaleY(0.1);
            button4.setFont(Font.font(null, FontWeight.BOLD, 20));
            button4.setStyle(
                    "-fx-background-color: transparent"
            );
            button4.getStylesheets().addAll(this.getClass().getResource("glow-of-setting-and-exit.css").toExternalForm());
            root.getChildren().addAll(button4);


            image = new Image(getClass().getResourceAsStream("3.png"));
            Button button5 = new Button("EXIT");
            button5.setLayoutX(610);
            button5.setLayoutY(30);
            button5.setGraphic(new ImageView(image));
            button5.setScaleX(0.1);
            button5.setScaleY(0.1);
            button5.setStyle(
                    "-fx-background-color: transparent"
            );
            button5.setFont(Font.font(null, FontWeight.BOLD, 20));
            button5.getStylesheets().addAll(this.getClass().getResource("glow-of-setting-and-exit.css").toExternalForm());
            root.getChildren().addAll(button5);

            image = new Image(getClass().getResourceAsStream("4.png"));
            Button button6 = new Button("EXIT");
            button6.setLayoutX(100);
            button6.setLayoutY(30);
            button6.setGraphic(new ImageView(image));
            button6.setScaleX(0.1);
            button6.setScaleY(0.1);
            button6.setStyle(
                    "-fx-background-color: transparent"
            );
            button6.setFont(Font.font(null, FontWeight.BOLD, 20));
            button6.getStylesheets().addAll(this.getClass().getResource("glow-of-setting-and-exit.css").toExternalForm());
            root.getChildren().addAll(button6);
            button5.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    try {
                        exit(0);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }));


            button6.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    try {
                        if(!mediaPlayer.isMute()){
                            Image image = new Image(getClass().getResourceAsStream("5.png"));
                            button6.setGraphic(new ImageView(image));
                            mediaPlayer.setMute(true);
                        }
                        else{
                            Image image = new Image(getClass().getResourceAsStream("4.png"));
                            button6.setGraphic(new ImageView(image));
                            mediaPlayer.setMute(false);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }));

            button.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {
                    try {
                        Map map = new Map();
                        mediaPlayer.pause();
                        map.start(primaryStage);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }));

            buttonHoverSound(button, getClass().getResource("button.mp3"));

            buttonHoverSound(button2, getClass().getResource("button.mp3"));

            buttonHoverSound(button3, getClass().getResource("button.mp3"));

            buttonHoverSound(button4, getClass().getResource("button.mp3"));

            buttonHoverSound(button5, getClass().getResource("button.mp3"));

            primaryStage.show();
        }

    private void buttonHoverSound(Button button4, URL resource2) {
        button4.setOnMouseEntered(new EventHandler<MouseEvent>() {
                                      @Override
                                      public void handle(MouseEvent event) {
                                          final URL resource = resource2;
                                          final Media media = new Media(resource.toString());
                                          MediaPlayer mediaPlayer = new MediaPlayer(media);
                                          mediaPlayer.setCycleCount(1);
                                          mediaPlayer.play();

                                      }
                                  }
        );
    }

    public static void GilPrinter() {
        System.out.println(hero.getGil());
    }

    static public String showMenu() {
        System.out.println("1. Enter Shop : to enter shop and buy or sell Cards and Items \n" +
                "2. Edit Inventory\n" +
                "3. Next : To go to deck and amulet customization ");
        String s = scanner.nextLine();
        return s;
    }





    public static int nextMenu() {
        String s = scanner.next();
        if (s.equals("help")) {
            showMenu();
            return 0;
        } else {
            return Integer.parseInt(s);
        }
    }




    }