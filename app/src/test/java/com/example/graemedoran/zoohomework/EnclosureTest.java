package com.example.graemedoran.zoohomework;
import com.example.graemedoran.zoohomework.Animal.Tiger;
import com.example.graemedoran.zoohomework.Enclosure.Enclosure;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by graemedoran on 10/11/2017.
 */

public class EnclosureTest {

    Enclosure<Tiger> enclosure;
    Tiger tiger;

    @Before
    public void before(){
        enclosure = new Enclosure<Tiger>();
        tiger = new Tiger("Big Cat", "Tigger", "1500", "Spots");
    }


}
