package com.example.graemedoran.zoohomework.Animal;

/**
 * Created by graemedoran on 10/11/2017.
 */

public abstract class Animal {
    private String Type;
    private String name;
    private String value;

    Animal(String Type, String name, String value) {
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

    public String getValue() {
        return value;
    }
}