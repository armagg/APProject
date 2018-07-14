package view.actionInGame;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class PlayGFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setFullScreen(true);
        primaryStage.setResizable(false);
        StackPane leftPane = new StackPane();
        StackPane rightPane = new StackPane();
        StackPane middlePane = new StackPane();
        SplitPane splitPane = new SplitPane();
        splitPane.getItems().addAll(leftPane,middlePane, rightPane);
        splitPane.setDividerPositions(0.25,0.75);


        leftPane.maxWidthProperty().bind(splitPane.widthProperty().multiply(0.25));
        leftPane.minWidthProperty().bind(splitPane.widthProperty().multiply(0.25));
        middlePane.maxWidthProperty().bind(splitPane.widthProperty().multiply(0.5));
        middlePane.minWidthProperty().bind(splitPane.widthProperty().multiply(0.5));


        TextArea cardInfoBox = new TextArea();
        cardInfoBox.setEditable(false);
        cardInfoBox.maxHeightProperty().bind(splitPane.heightProperty().multiply(0.7));
        cardInfoBox.minHeightProperty().bind(splitPane.heightProperty().multiply(0.7));

        TextArea battleEvents = new TextArea();
        battleEvents.setEditable(false);

        SplitPane textAreas = new SplitPane(cardInfoBox,battleEvents);
        textAreas.setStyle("-fx-padding: 13px");
        textAreas.setOrientation(Orientation.VERTICAL);
        leftPane.setStyle("-fx-padding: 10px");
        leftPane.getChildren().addAll(textAreas);

        Pane upperRightCardsList = new Pane();
        Pane lowerRightButtons = new Pane();
        lowerRightButtons.setLayoutY(primaryStage.getHeight());
        rightPane.getChildren().addAll(upperRightCardsList,lowerRightButtons);

        Button button1 = new Button();
        Button button2 = new Button();
        Button button3 = new Button();



        StackPane playerField = new StackPane();
        StackPane rivalField = new StackPane();
        middlePane.getChildren().addAll(rivalField,playerField);
        rivalField.setRotate(180);


        primaryStage.setScene(new Scene(new BorderPane(splitPane),2560,1440));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}