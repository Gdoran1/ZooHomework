package com.example.graemedoran.zoohomework;

import com.example.graemedoran.zoohomework.Animal.Cheetah;
import com.example.graemedoran.zoohomework.Animal.Tiger;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class CheetahTest {

    Cheetah cheetah;


    @Before
    public void Before() {
        cheetah = new Cheetah("Big Cat", "Cheeto", 1000, "Spots");
    }

    @Test
    public void getCharacteristic() {
        assertEquals("Spots", cheetah.getCharacteristics());
    }
}

