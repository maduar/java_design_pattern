package flyweight;

/**
 * Created by maduar on 01/11/2017.
 */
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;
    private int index;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius + ", index :" + index);
    }
}
