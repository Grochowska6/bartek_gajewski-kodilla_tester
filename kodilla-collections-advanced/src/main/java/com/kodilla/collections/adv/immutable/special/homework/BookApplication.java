package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookApplication {
    public static void main(String[] args) {



        Book drama = BookManager.createBook("Zmierzch", "Stephanie Mayer");
        Book science = BookManager.createBook("Alhemik", "Paolo Coelho");
        Book sciencefiction = BookManager.createBook("Harry Potter", "J.K. Rowling");
        Book history = BookManager.createBook("Zmierzch", "Stephanie Mayer");

        System.out.println(drama);
        System.out.println(history);





        System.out.println(drama.hashCode());
        System.out.println(science.hashCode());
        System.out.println(sciencefiction.hashCode());
        System.out.println(history.hashCode());
        System.out.println("------");
        System.out.println(drama == science);
        System.out.println("------");
        System.out.println(science == sciencefiction);
        System.out.println("------");
        System.out.println(drama == sciencefiction);
        System.out.println("------");
        System.out.println(drama == history);



    }

}
