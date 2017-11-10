package com.example.graemedoran.zoohomework;

import com.example.graemedoran.zoohomework.Animal.Tiger;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class TigerTest {

    Tiger tiger;


    @Before
    public void Before() {
        tiger = new Tiger("Big Cat", "Tigger", 1500, "Stripes");
    }

    @Test
    public void getCharacteristic() {
        assertEquals("Stripes", tiger.getCharacteristics());
    }
}
