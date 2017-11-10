package com.example.graemedoran.zoohomework.Animal;

import com.example.graemedoran.zoohomework.Enclosure.Enclosure;

import java.util.ArrayList;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class Zoo {

    ArrayList<Enclosure> enclosure;

    public Zoo(){
        this.enclosure = new ArrayList<>();
    }

    public void addEnclosure(Enclosure enclosure) {
        this.enclosure.add(enclosure);}

    public int numberOfEnclosures() {
        return this.enclosure.size();

    }
}

