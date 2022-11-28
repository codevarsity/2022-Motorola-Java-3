//is-a

import java.awt.*;

abstract class Shape {
    int x;
    int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

interface Drawable {
    void draw();
}

interface Moveable {
    void move(int x, int y);
}

class RectangleShape extends Shape implements Drawable, Moveable {
    int width;
    int height;

    RectangleShape(int width, int height) {
        super(0, 0);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "x = " + x + " y = " + y + " width = " + width + " height = " + height;
    }

    @Override
    public boolean equals(Object obj) {
        RectangleShape that = (RectangleShape) obj;
        return  this.x == that.x &&
                this.y == that.y &&
                this.width == that.width &&
                this.height == that.height;
    }

    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

class CircleShape extends Shape implements Drawable, Moveable{
    int radius;

    CircleShape(int radius) {
        super(0, 0);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

class EllipseShape extends Shape implements Drawable, Moveable {
    int minorAxis;
    int majorAxis;

    EllipseShape(int minorAxis, int majorAxis) {
        super(0, 0);
        this.minorAxis = minorAxis;
        this.majorAxis = majorAxis;
    }

    public void draw() {
        System.out.println("Drawing Ellipse");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

class TriangleShape extends Shape implements Drawable, Moveable {
    TriangleShape() {
        super(0, 0);
    }

    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

class PolygonShape extends Shape implements Drawable, Moveable {
    PolygonShape() {
        super(0, 0);
    }


    public void draw() {
        System.out.println("Drawing a Polygon");
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}

class SpacerShape extends Shape implements Moveable{
    SpacerShape(int x, int y) {
        super(x, y);
    }
    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}


public class Inheritance {

    public static void main(String[] args) {
        RectangleShape rect = new RectangleShape(100, 200);
        System.out.println(rect);

        RectangleShape rect1 = new RectangleShape(100, 200);

        if( rect.equals(rect1)) {
            System.out.println("Rectangles are same");
        } else {
            System.out.println("Rectangles are not same");
        }
    }
}
