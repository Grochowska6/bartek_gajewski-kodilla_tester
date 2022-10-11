package com.kodilla.collections.adv.immutable.special.homework;

import java.sql.Array;
import java.util.*;

public class BookManager {

    List<Book> Book = new ArrayList<>();

    public static Book createBook(String title, String author) {
        return new Book(title, author);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookManager that = (BookManager) o;
        return Objects.equals(Book, that.Book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Book);
    }
}

