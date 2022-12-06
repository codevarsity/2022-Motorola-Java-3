package com.example.designpatterns;
import java.util.ArrayList;

interface  UIComponent {
    void draw();
    void layout();
}

class SwingButton implements UIComponent {

    @Override
    public void draw() {
        System.out.println("Drawing SwingButton");
    }

    @Override
    public void layout() {
        System.out.println("Layout SwingButton");
    }
}

class SwingTextField implements UIComponent {

    @Override
    public void draw() {
        System.out.println("Drawing SwingTextField");
    }

    @Override
    public void layout() {
        System.out.println("Layout SwingTextField");
    }
}

interface ComponentFactory {
    UIComponent createComponent(String type);
}

class SwingComponentFactory implements ComponentFactory {

    @Override
    public UIComponent createComponent(String type) {
        UIComponent component = null;
        if(type.equals("Button")) {
            component =  new SwingButton();
        } else if(type.equals("TextField")) {
            component = new SwingTextField();
        }
        return component;
    }
}

class AWTButton implements UIComponent {

    @Override
    public void draw() {
        System.out.println("Drawing AWTButton");
    }

    @Override
    public void layout() {
        System.out.println("Layout AWTButton");
    }
}

class AWTTextField implements UIComponent {

    @Override
    public void draw() {
        System.out.println("Drawing AWTTextField");
    }

    @Override
    public void layout() {
        System.out.println("Layout AWTTextField");
    }
}

class AWTComponentFactory implements ComponentFactory {

    @Override
    public UIComponent createComponent(String type) {
        UIComponent component = null;
        if(type.equals("Button")) {
            component =  new AWTButton();
        } else if(type.equals("TextField")) {
            component = new AWTTextField();
        }
        return component;
    }
}

class FactoryCreator {
    public static ComponentFactory createFactory(String type) {
        if(type.equals("AWT")) {
            return new AWTComponentFactory();
        } else if(type.equals("Swing")) {
            return new SwingComponentFactory();
        }
        return null;
    }
}

public class AbstractFactoryExample {

    public static void main(String[] args) {
        ArrayList<UIComponent> componentArrayList = new ArrayList<>();

        ComponentFactory factory = FactoryCreator.createFactory("Swing");
        UIComponent button = factory.createComponent("Button");
        UIComponent textField = factory.createComponent("TextField");

        componentArrayList.add(button);
        componentArrayList.add(textField);



    }
}
