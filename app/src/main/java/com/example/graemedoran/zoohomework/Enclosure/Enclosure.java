package com.example.graemedoran.zoohomework.Enclosure;

import com.example.graemedoran.zoohomework.Animal.Animal;
import com.example.graemedoran.zoohomework.Animal.Tiger;

import java.util.ArrayList;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T> cats;


    public Enclosure(){
        this.cats = new ArrayList();
    }

    public void canAddAnimalToEnclosure(T cat) {
        this.cats.add(cat);
    }

    public int getNumberOfAnimals(){
        return this.cats.size();
    }

    public void canRemoveAnimalFromEnclosure(T cat) {
        this.cats.remove(cat);
    }

}
