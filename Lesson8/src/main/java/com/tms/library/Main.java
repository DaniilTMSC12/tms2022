package com.tms.library;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В.В", 25421, "Машиностроение", "21.01.1999", +53819);
        readers[1] = new Reader("Иванова И.И", 21345, "Архитектурный", "01.01.2001", +321321);
        readers[2] = new Reader("Кутузов К.К", 20223, "Филологический", "22.11.2001", +375491);


        Book[] books = new Book[3];
        books[0] = new Book("Энциклопедия", "Голубев Г.Г");
        books[1] = new Book("Словарь", "Смирнов С.С");
        books[2] = new Book("Приключения", "Королёв К.К");

        readers[0].takeBook(3);

    }
}
