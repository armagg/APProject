package view.Map;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PlayerShape {

    Direction direction = Direction.DOWN;
    private int x;
    private int y;
    private Image image = new Image(getClass().getResourceAsStream("manshapes/down1.png"));
    ImageView imageView = new ImageView(image);
    {
        imageView.setScaleX(0.8);
        imageView.setScaleY(0.8);
    }
    int counter = 2;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void goLeft(){
        direction = Direction.LEFT;
        counter = counter<29 ? counter+1 : 3;
        imageView.setImage(new Image(getClass().getResourceAsStream("manshapes/left" + Integer.toString(counter/3)+".png")));
        imageView.setLayoutX(imageView.getLayoutX() - 2);

    }

    public void goRight(){
        direction = Direction.RIGHT;
        counter = counter<29 ? counter+1 : 3;
        imageView.setImage(new Image(getClass().getResourceAsStream("manshapes/right" + Integer.toString(counter/3)+".png")));
        imageView.setLayoutX(imageView.getLayoutX() + 2);
    }

    public void goUp(){
        direction = Direction.UP;
        counter = counter<29 ? counter+1 : 3;
        imageView.setImage(new Image(getClass().getResourceAsStream("manshapes/up" + Integer.toString(counter/3)+".png")));
        imageView.setLayoutY(imageView.getLayoutY() - 2);
    }

    public void goDown(){
        direction = Direction.DOWN;
        counter = counter<29 ? counter+1 : 3;
        imageView.setImage(new Image(getClass().getResourceAsStream("manshapes/down" + Integer.toString(counter/3)+".png")));
        imageView.setLayoutY(imageView.getLayoutY() + 2);
    }
}

enum Direction{
    UP,RIGHT,DOWN,LEFT
}
