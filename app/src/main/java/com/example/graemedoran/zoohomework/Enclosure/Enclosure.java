package com.example.graemedoran.zoohomework.Enclosure;

import com.example.graemedoran.zoohomework.Animal.Animal;

import java.util.ArrayList;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T> cats;


    public Enclosure(){
        this.cats = new ArrayList();
    }

    public void add(T item) {
        this.cats.add(item);
    }

}
