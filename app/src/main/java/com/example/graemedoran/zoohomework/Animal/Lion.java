package com.example.graemedoran.zoohomework.Animal;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class Lion extends Animal{


    private final String characteristics;

    public Lion(String Type, String name, int value, String Characteristics) {
        super(Type, name, value);
        characteristics = Characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }

}
