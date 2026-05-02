package com.kaptalis;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    public void testTemperatureCorrect() {
        assertTrue(App.isTemperatureValid(5.0));
    }


    @Test
    public void testTemperatureTooHigh() {
        assertFalse(App.isTemperatureValid(10.0));
    }
}
