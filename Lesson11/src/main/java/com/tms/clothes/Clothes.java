package com.tms.clothes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
abstract class Clothes {
    private Size size;
    private int price;
    private String color;
}
