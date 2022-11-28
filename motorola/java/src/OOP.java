

//member/instance variables are public
class Rectangle {
    private int width;
    private int height;
    private String backgroundColor;

    static int numberOfRectangles;

    //default constructor
    public Rectangle() {
       this(100, 100, "Red");
    }

    public Rectangle(int width, int height) {
        this(width, height, "Red");
    }


    public Rectangle(int width, int height, String backgroundColor) {
        System.out.println("Creating Rectangle ");
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void setWidth(int width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }

    int area() {
        return width * height;
    }
}

class Temperature {
    final static float boilingPoint = 100.0f;
    float celsius;
}



class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static void updatePoint(Point p, int deltaX, int deltaY) {
        p.x += deltaX;
        p.y += deltaY;
    }
}


class FileReader {

    private static String fileContents;

    static {
        System.out.println("File Contents Loaded");
        fileContents = "Hello World";
    }

    String getFileContents() {
        return fileContents;
    }
}

class NativeMethods {

    static {
        System.loadLibrary("task");
    }
    native void doSomething();


}


class Employee {
    private int id;
    private float salary;
    private float hoursWorked;

    private Address address;
}

class Address {
    private String houseNumber;
    private String buildingNumber;
    private String area;
    private String city;
    private String country;
}





public class OOP {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Width = " + rect1.getWidth());
        System.out.println("Height = " + rect1.getHeight());

        Rectangle rect2 = new Rectangle(99, 99);
        System.out.println("Width = " + rect2.getWidth());
        System.out.println("Height = " + rect2.getHeight());

        Temperature temp1 = new Temperature();
        temp1.celsius = 24.0f;


        Point p = new Point(100, 100);
        Point.updatePoint(p ,5, 5);
        System.out.println("x = " + p.x + " y = " + p.y);

        FileReader reader = new FileReader();
        reader.getFileContents();

    }
}
