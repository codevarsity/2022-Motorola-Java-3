

interface Doable {
    void doSomething();
}

public class AnonymousClasses {
    public static void main(String[] args) {
        Doable d = new Doable() {
            @Override
            public void doSomething() {
                System.out.println("Doing Something");
            }
        };




    }
}
