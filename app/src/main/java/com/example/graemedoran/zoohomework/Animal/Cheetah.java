package com.example.graemedoran.zoohomework.Animal;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class Cheetah extends Animal{


    private final String characteristics;

    public Cheetah(String Type, String name, int value, String Characteristics) {
        super(Type, name, value);
        characteristics = Characteristics;
    }

    public String getCharacteristics() {
        return characteristics;
    }
}
