package com.company;
import java.util.Scanner;

public class BookApp {

    public BookApp() {

    }
    public static void main(String[] args) {
        Book one = new Book();
        one.setTitle("Harry Potter");
        one.setAuthor("J.K.Rowling");
        one.setDescription("Awesome book series");
        one.setPrice(20);
        one.setIsInStock("Yes");

//        String title = one.getTitle();
//        String author = one.getAuthor();
//        String description = one.getDescription();
//        int price = one.getPrice();
//        String isInStock = one.getIsInStock();


        System.out.println(one.getDisplayText());


//        public class String getDisplayText() {
//            System.out.println(title);
//            System.out.println("By " + author);
//            System.out.println(description);
//
//            Scanner kbd = new Scanner(System.in);
//            int input = kbd.nextInt();
//            System.out.println(input);
//            return;
//        }

    }
}

