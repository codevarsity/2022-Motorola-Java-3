import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

class Person implements Closeable {
    String firstName;
    String lastName;
    String city;

    int age;

    FileInputStream inStream;

    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;

        return  this.lastName.equals(p.lastName) &&
                this.firstName.equals(p.firstName) &&
                this.city.equals(p.city);
    }

    @Override
    public String toString() {
        return "Person name " + firstName + " " + lastName + " " + age ;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Person object getting deallocated");
        inStream.close();
    }

    @Override
    public void close() throws IOException {

    }
}

public class ObjectExample {
    public static void main(String[] args) {
        Person person = new Person("Raj", "Singh", "New Delhi", 21);
        System.out.println(person.toString());

        Person person1 = new Person("Raj", "Singh", "New Delhi",21);

        if(person.equals(person1)) {
            System.out.println("Objects are same");
        } else {
            System.out.println("Objects are different");
        }

        //primitives (value types)
        //int, float, double, ...

        //reference types
        //String, StringBuilder, Person,


        //primitive array
        int[] array = new int[] {1, 2, 3};

        //Boxing
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(Integer.valueOf(10));
        numbers.add(Integer.valueOf(10));


        int value = numbers.get(0);

    }
}
