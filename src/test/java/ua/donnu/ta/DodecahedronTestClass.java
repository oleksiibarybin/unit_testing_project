package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.dodecahedron.Dodecahedron;

public class DodecahedronTestClass {

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with float edge value")
    public void FloatValue() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(6.0F), "The calculation is not correct");
    }

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with integer edge value")
    public void IntegerValue() {
        Assertions.assertNotEquals(743, 743.2462, Dodecahedron.float_area_value(6), "Integer is not correct data type. Please, use float.");
    }

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with negative edge value")
    public void NegativeValue() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(-6.0f), "The calculation is not correct");
    }

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with positive edge value")
    public void PositiveValue() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(6), "The calculation is not correct");
    }
}
