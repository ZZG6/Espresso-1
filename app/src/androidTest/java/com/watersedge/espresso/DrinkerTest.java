package com.watersedge.espresso;

import junit.framework.TestCase;

/**
 *
 */

public class DrinkerTest extends TestCase {

    public void testPersonAndDrink() {
        String mName = "Javy";
        String mDrink = "Whiskey";
        Drinker mDrinker = new Drinker();

        String result = mDrinker.personAndDrink(mName, mDrink);

        assertEquals("Javy likes to drink Whiskey", result);
    }
}
