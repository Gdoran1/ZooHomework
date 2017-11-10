package com.example.graemedoran.zoohomework;

import com.example.graemedoran.zoohomework.Animal.Animal;
import com.example.graemedoran.zoohomework.Animal.Cheetah;
import com.example.graemedoran.zoohomework.Animal.Lion;
import com.example.graemedoran.zoohomework.Animal.Tiger;
import com.example.graemedoran.zoohomework.Animal.Zoo;
import com.example.graemedoran.zoohomework.Enclosure.Enclosure;

import org.junit.Before;
import org.junit.Test;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class ZooTest {

    Zoo zoo;
    Enclosure enclosure;

    @Before
    public void Before() {
        zoo = new Zoo();
        enclosure = new Enclosure();
    }

    @Test
    public void TestNumberOfEnclosures(){
        int actual = zoo.numberOfEnclosures();
        assertEquals(0, actual);
    }

    @Test
    public void canAddEnclosureToZoo() {
        zoo.addEnclosure(enclosure);
        assertEquals(1, zoo.numberOfEnclosures());
    }

//    @Test
//    public void testTotalNumberOfAnimals(){
//        zoo.addEnclosure(Tiger);
//        zoo.addEnclosure(Lion);
//        zoo.addEnclosure(Cheetah);
//        enclosure.canAddAnimalToEnclosure(Tiger);
//        enclosure.canAddAnimalToEnclosure(Lion);
//        enclosure.canAddAnimalToEnclosure(Cheetah);
//
//    }

}