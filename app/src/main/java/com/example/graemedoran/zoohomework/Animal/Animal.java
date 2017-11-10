package com.example.graemedoran.zoohomework.Animal;
import java.util.ArrayList;
/**
 * Created by graemedoran on 10/11/2017.
 */

public abstract class Animal {

    private String Type;
    private String name;
    private int value;

    Animal(String Type, String name, int value) {
         this.Type = Type;
         this.name = name;
         this.value = value;
}


    public String getType() {
        return Type;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }


}


