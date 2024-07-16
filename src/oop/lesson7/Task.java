package oop.lesson7;
import oop.lesson7.book.book;

public class Task {
    public static void main(String[] args) {
        book book = new book("Три товарища", "Ремарк", 320, false);
//        book.printCountRows();
//        book.printCountRows(38);
        book.printInfo();

    }
}
