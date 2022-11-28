import java.util.ArrayList;

public class Polymorphism {
    public static void main(String[] args) {

        //layout objects
        ArrayList<Moveable> moveables = new ArrayList<>();



        //objects we want to draw
        ArrayList<Drawable> shapes = new ArrayList<>();

        //code for creating the object
        //creating instances of concrete objects
        RectangleShape rect = new RectangleShape(100, 100);
        shapes.add(rect);
        moveables.add(rect);
        CircleShape circle = new CircleShape(10);
        shapes.add(circle);
        moveables.add(circle);

        EllipseShape ellipse = new EllipseShape(10, 20);
        shapes.add(ellipse);
        moveables.add(ellipse);

        TriangleShape triangle = new TriangleShape();
        shapes.add(triangle);
        moveables.add(triangle);

        PolygonShape polygon = new PolygonShape();
        shapes.add(polygon);
        moveables.add(polygon);


        //moving objects
        for(Moveable obj : moveables) {
            obj.move(0, 0);
        }

        //drawing
        for (Drawable obj : shapes) {
            obj.draw();
        }

    }
}
