package com.example.graemedoran.zoohomework;

import com.example.graemedoran.zoohomework.Animal.Lion;
import com.example.graemedoran.zoohomework.Animal.Tiger;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class LionTest {

    Lion lion;


    @Before
    public void Before() {
        lion = new Lion("Big Cat", "Aslan", 2000, "Mane");
    }

    @Test
    public void getCharacteristic() {
        assertEquals("Mane", lion.getCharacteristics());
    }
}

