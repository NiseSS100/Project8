package fmi.informatics.hw8;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTestJUnit {

    @Test
    public void HI() {
        TestJUnit j = new TestJUnit();
        String result = j.HI("Hello"," user!");
        assertEquals("Hello user!",result);

    }
}