package com.kaptalis;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TemperatureSensorTest {
    @Test
    public void testTemperatureNormal() {
        TemperatureSensor sensor = new TemperatureSensor();
        assertTrue("La temperature de 5 C devrait etre valide", sensor.isSafe(5.0));
    }

    @Test
    public void testTemperatureTooCold() {
        TemperatureSensor sensor = new TemperatureSensor();
        assertFalse("La temperature de 1 C devrait etre invalide", sensor.isSafe(1.0));
    }
}
