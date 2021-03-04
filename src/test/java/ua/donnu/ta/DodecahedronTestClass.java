package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.dodecahedron.Dodecahedron;

public class DodecahedronTestClass {

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with float edge value")
    public void FloatValue() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(6.0F), "The calculation is not correct");
    }

    @Test
    @Tag("exp: fail")
    @DisplayName("Check the result of dodecahedron area calculation with integer edge value")
    public void IntegerValue() {
        Assertions.assertNotEquals(743.2462, 743, Dodecahedron.float_area_value(6), "For integer edge value we will get approximate value of dodecahedron area. Please, use float.");
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

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with five positive digits value")
    public void PositiveFiveDigitsValue() {
        Assertions.assertEquals(2.548804352E9, Dodecahedron.float_area_value(11111.0f));
    }

    @Test
    @DisplayName("Check the result of dodecahedron area calculation with double data value")
    public void DoubleValue() {
        Assertions.assertEquals(743.2462370544337, 743.2462370544337, Dodecahedron.double_area_value(6), "Calculation is not correct");
    }

    public void ZeroValue() {
        Assertions.assertEquals();
    }
/*
    @Test
    @Tag("exp: fail")
    @DisplayName("Check the result of dodecahedron area calculation without edge value")
    public void NoValue() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(null), "There is no edge value");
    }

 */
    /*
    @Test
    @DisplayName("Check the result of dodecahedron area calculation with string edge value")
    public void StringValue() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(), "The calculation is not correct");
    }


     */
}
