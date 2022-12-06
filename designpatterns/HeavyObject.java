package com.example.designpatterns;

import java.io.*;

interface IPrototype {
    IPrototype copy();
    IPrototype deepCopy();
}
public class HeavyObject implements IPrototype{

    String contents;

    public HeavyObject() {

    }

    public HeavyObject(String pathToFile) {
        StringBuilder builder = new StringBuilder();
        try {
            File file = new File(pathToFile);
            FileInputStream fin = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();
            builder.append(line);
            while( line != null) {
                line = bufReader.readLine();
                builder.append(line);
            }

            contents = builder.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        HeavyObject object = new HeavyObject("/Users/amitgulati/dev/text.txt");
        System.out.println("Original");
        System.out.println(object.contents);

        HeavyObject object1 = (HeavyObject) object.copy();
        System.out.println("First Copy");
        System.out.println(object1.contents);

        HeavyObject object2 = (HeavyObject) object.copy();
        System.out.println("Second Copy");
        System.out.println(object2.contents);


    }

    @Override
    public IPrototype copy() {
        HeavyObject obj = new HeavyObject();
        obj.contents = this.contents;
        return obj;
    }

    @Override
    public IPrototype deepCopy() {
        HeavyObject obj = new HeavyObject();
        String contents = new String(this.contents);
        obj.contents = contents;
        return obj;

    }
}


