package com.example.graemedoran.zoohomework;

import com.example.graemedoran.zoohomework.Enclosure.Enclosure;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by graemedoran on 10/11/2017.
 */

public class ZooTest {

    Zoo<enclosure>  zoo;
    Enclosure enclosure;

    @Test
    public void canAddEnclosureToZoo() {
        zoo.addEnclosure(enclosure);
        assertEquals(1, zoo.items.size());



