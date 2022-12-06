package com.example.designpatterns;


import java.lang.reflect.Member;

class Burger  {
    String customerName;
    Boolean pickles;
    Boolean mayo;
    Boolean lettuce;
    Boolean ketchup;
    int patties;
    Boolean veggie;

    Cooked cooked;

    boolean bacon;

    enum Cooked {
        RARE, MEDIUM, WELLDONE
    }

    public Burger(String customerName, Boolean pickles, Boolean mayo, Boolean lettuce, Boolean ketchup, int patties, Boolean veggie, Cooked cooked, Boolean bacon) {
        this.customerName = customerName;
        this.pickles = pickles;
        this.mayo = mayo;
        this.lettuce = lettuce;
        this.ketchup = ketchup;
        this.patties = patties;
        this.veggie = veggie;
        this.cooked = cooked;
    }

    Burger(String customerName) {
        this(customerName, true, true, true, true, 1, false, Cooked.MEDIUM, false);
    }


    void printDescription() {
        System.out.println("Name: = " + this.customerName);
        System.out.println("Pickles: = " + this.pickles);
        System.out.println("Mayo: = " + this.mayo);
    }



}


class BurgerBuilder {
    private Boolean pickles = true;
    private Boolean mayo = true;
    private Boolean lettuce = true;
    private Boolean ketchup = true;
    private int patties = 2;
    private Boolean veggie = false;
    private Burger.Cooked cooked = Burger.Cooked.MEDIUM;

    boolean bacon = false;

    private static BurgerBuilder builder = new BurgerBuilder();

    public static BurgerBuilder getBuilder(BurgerBuilderType type) {
        if(type == BurgerBuilderType.STANDARD) {
            return builder;
        } else if (type == BurgerBuilderType.BIGBURGER) {
            return new BigBurgerBuilder();
        }
        return null;
    }

    protected BurgerBuilder() {

    }

    public BurgerBuilder mayo(Boolean mayo) {
        this.mayo = mayo;
        return this;
    }

    public BurgerBuilder pickles(Boolean pickles) {
        this.pickles = pickles;
        return this;
    }

    public BurgerBuilder lettuce(Boolean lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    public BurgerBuilder ketchup(Boolean ketchup) {
        this.ketchup = ketchup;
        return this;
    }

    public BurgerBuilder patties(int patties) {
        this.patties = patties;
        return this;
    }

    public BurgerBuilder veggie(Boolean veggie) {
        this.ketchup = ketchup;
        return this;
    }

    public BurgerBuilder cooked(Burger.Cooked cooked) {
        this.cooked = cooked;
        return this;
    }

    public BurgerBuilder bacon(Boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public Burger build(String name) {
        return new Burger(name, pickles, mayo, lettuce, ketchup, patties, veggie, cooked, bacon);
    }

}

enum BurgerBuilderType {
    STANDARD, BIGBURGER
}

class BigBurgerBuilder extends  BurgerBuilder{
       BigBurgerBuilder() {
            super();
            super.patties(4);
       }

    @Override
    public BurgerBuilder patties(int patties) {
        System.out.println("Cannot add any more patties");
        return this;
    }
}

public class BuilderExample {

    public static void main(String[] args) {

        Burger burger = BurgerBuilder.getBuilder(BurgerBuilderType.STANDARD).build("Amit");
        Burger burger1 = BurgerBuilder.getBuilder(BurgerBuilderType.BIGBURGER).build("Amit");

    }
}
