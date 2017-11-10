package com.example.graemedoran.zoohomework;



import com.example.graemedoran.zoohomework.Animal.Tiger;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class AnimalTest {


    Tiger tiger;


    @Before
    public void Before() {

        tiger = new Tiger("Big Cat", "Tigger", "1500", "Stripes");

    }


    @Test
    public void getType() {
        assertEquals("Big Cat", tiger.getType());
    }

    @Test
    public void getName() {
        assertEquals("Tigger", tiger.getName());
    }

    @Test
    public void getValue() {
        assertEquals("1500", tiger.getValue());
    }

    @Test
    public void getCharacteristic() {
        assertEquals("Stripes", tiger.getCharacteristic());

    }

}
