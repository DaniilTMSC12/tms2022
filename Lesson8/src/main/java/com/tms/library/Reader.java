package com.tms.library;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reader {
    private String name;
    private int numberOfReadCard;
    private String faculty;
    private String birthday;
    private int telephone;


    public void takeBook(int numberOfBooks) {
        System.out.println(name + " взял " + numberOfBooks + " книгу(и)");
    }
}


//public String takeBook(books[])



