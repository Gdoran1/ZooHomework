package com.example.graemedoran.zoohomework;
import com.example.graemedoran.zoohomework.Animal.Cheetah;
import com.example.graemedoran.zoohomework.Animal.Lion;
import com.example.graemedoran.zoohomework.Animal.Tiger;
import com.example.graemedoran.zoohomework.Enclosure.Enclosure;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class EnclosureTest {

    Enclosure<Tiger> enclosure;
    Tiger tiger;
//    Lion lion;
//    Cheetah cheetah;

    @Before
    public void before(){
        enclosure = new Enclosure<Tiger>();
        tiger = new Tiger("Big Cat", "Tigger", "1500", "Stripes");
//        lion = new Lion("big Cat", "Aslan", "2000", "Mane");
//        cheetah = new Cheetah(("Big Cat", "Cheeto", "1000", "Spots");
    }

    @Test
    public void testCanAddAnimalToEnclosure(){
        enclosure.canAddAnimalToEnclosure(tiger);
        assertEquals(1, enclosure.getNumberOfAnimals());
    }

    @Test
    public void testCanRemoveAnimalFromEnclosure(){
        enclosure.canRemoveAnimalFromEnclosure(tiger);
        assertEquals(0, enclosure.getNumberOfAnimals());
    }
}
