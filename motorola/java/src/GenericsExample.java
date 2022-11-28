import java.util.*;

//stack
class SuperStack<T> {

    T[] values;
    void push(T value) {

    }

//    T pop() {
//        return 0;
//    }
//
//    T peek() {
//        return 0;
//    }
}



public class GenericsExample {

    //heterogeneous objects
    ArrayList<String> numbers = new ArrayList();

    public static void main(String[] args) {
        GenericsExample example = new GenericsExample();

        example.numbers.add("Amit");
        example.numbers.add("Raj");
        example.numbers.add("Sunil");
        String value = example.numbers.get(1);


        List<String> items;
        items = new LinkedList<>();
        items.add("Get Milk");
        items.add("Attend Training");
        items.add("Buy Groceries");

        for (String item : items) {
            System.out.println(item);
        }



        Map<String, Integer> scores = new HashMap<>();
        scores.put("Amit", 100);
        scores.put("Raj", 150);




    }

}
