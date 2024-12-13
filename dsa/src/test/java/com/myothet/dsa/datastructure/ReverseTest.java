package com.myothet.dsa.datastructure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {

    Reverser reverse = new Reverser();

    @Test
    public void emptyTest() {

        String output = reverse.reverse("");
        assertEquals("", output);

    }

    @Test
    public void wordTest() {
        String output = reverse.reverse("car");
        assertEquals("rac", output);
    }
}
