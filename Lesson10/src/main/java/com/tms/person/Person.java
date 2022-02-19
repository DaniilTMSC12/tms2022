package com.tms.person;

import com.tms.person.jackets.IJacket;
import com.tms.person.pants.IPants;
import com.tms.person.shoes.IShoes;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements IPerson {
    private String name;
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;

    @Override
    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void getUndressed() {
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    @Override
    public int getPrice() {
        int result = jacket.getPrice() + pants.getPrice() + shoes.getPrice();
        return result;
    }
}
