package com.example.designpatterns;


import java.util.ArrayList;

class Book {
    String author;
    String title;
    int pagesCount;

    public Book() {

    }
    public Book(String author, String title, int pagesCount) {
        this.author = author;
        this.title = title;
        this.pagesCount = pagesCount;
    }
}


class BookPool {
    int count;
    private ArrayList<Book> data = null;

    public BookPool(int count) {
        data = new ArrayList<Book>(count);

        for(int i = 0; i < count; ++i) {
            data.add(new Book());
        }
    }

    Book getFromPool() {
        Book result = null;
        if(data.size() > 0) {
            result = data.remove(0);
        }
        return result;
    }

    void returnToPool(Book item) {
        if(data.size() < count) {
            data.add(item);
        }
    }
}

public class ObjectPoolExample {
}
