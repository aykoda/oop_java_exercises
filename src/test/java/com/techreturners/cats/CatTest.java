package com.techreturners.cats;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        ICat domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        ICat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        ICat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        ICat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        ICat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        ICat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        ICat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        ICat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void feedTheCat() {
        ICat domesticCat = new DomesticCat();
        assertEquals("Purrrrrrr", domesticCat.eat());
    }
}
