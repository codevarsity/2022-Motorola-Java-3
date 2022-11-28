
//aggregation
    //composition
    //association


import java.lang.ref.WeakReference;

class Rectangle2D {
    Point2D center;
    Size size;

    Color backgroundColor;

    Rectangle2D(int x, int y, int width, int height) {
        center = new Point2D(x, y);
        size = new Size(width, height);
    }
}


class Color {
    int red;
    int green;
    int blue;
    int alpha;

}

class Size {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Size(int height, int width) {
        this.height = height;
        this.width = width;
    }
}


class Point2D {
    int x = 0;
    int y = 0;

    Point2D() {
        x = 0;
        y = 0;
    }
    Point2D(int x, int y) {
        setZero();

        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("x = " + this.x + " " + " y = " + this.y );
    }

    void setZero() {
        x = 0;
        y = 0;
    }

}

enum Direction {
    EAST, WEST, NORTH, SOUTH
}

enum DaysOfTheWeek {
    MONDAY, TUESDAY, WEDNESDAY
}

public class MemoryModel {

    public static void main(String[] args) {

        DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.MONDAY;

        Direction direction = Direction.EAST;

        if (direction == Direction.EAST) {
            System.out.println("Headed East");
        } else if (direction == Direction.WEST) {
            System.out.println("Headed West");
        }


        Point2D point = new Point2D();
        point.x = 100;
        point.y = 100;
        point.printPoint();

        makeZero(point);
        point.printPoint();


        Point2D anotherPoint = point;

        int myInteger = 100;
        System.out.println("myInteger = " + myInteger);
        makeZero(myInteger);
        System.out.println("myInteger = " + myInteger);


        int anotherInteger = myInteger;


        //primitives have a copy semantic
        //class instances have a reference semantic

        Point2D oneMorePoint = new Point2D();
        oneMorePoint.x = 200;
        oneMorePoint.y = 200;

        oneMorePoint.printPoint();

        Rectangle2D rect = new Rectangle2D(0, 0, 100, 100);
        rect = null;

    }


    public static void makeZero(int value) {
        value = 0;
    }

    public static void makeZero(Point2D point) {
        point.x = 0;
        point.y = 0;
    }
}

class Parent {
    Child child;
}


class Child {
    void signUpForClasses(Parent parent) {

    }
}




