package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.dodecahedron.Dodecahedron;

public class DodecahedronTestClass {

    final float float_const = (float) 743.2462;
    final double double_const = (double) 743.2462370544337;

    @Test
    @Tag("Positive")
    @DisplayName("Float edge value")
    public void FloatValue() {
        Assertions.assertEquals(float_const, Dodecahedron.float_area_value(6.0F), "The calculation is not correct");
    }

    @Test
    @Tag("Negative")
    @DisplayName("Integer edge value")
    public void IntegerValue() {
        Assertions.assertNotEquals(float_const, 743, Dodecahedron.float_area_value(6), "For integer edge value we will get approximate value of dodecahedron area. Please, use float.");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Negative edge value")
    public void NegativeValue() {
        Assertions.assertEquals(float_const, Dodecahedron.float_area_value(-6.0f), "The calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Positive edge value")
    public void PositiveValue() {
        Assertions.assertEquals(float_const, Dodecahedron.float_area_value(6.0F), "The calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Positive five digits edge value")
    public void PositiveFiveDigitsValue() {
        Assertions.assertEquals(2.548804352E9, Dodecahedron.float_area_value(11111.0f));
    }

    @Test
    @Tag("Positive")
    @DisplayName("Zero edge value")
    public void ZeroValue() {
        Assertions.assertEquals(0, Dodecahedron.float_area_value(0));
    }

    @Test
    @Tag("Positive")
    @DisplayName("Double edge value(d)")
    public void DoubleValue() {
        Assertions.assertEquals(double_const, double_const, Dodecahedron.double_area_value(6), "Calculation is not correct");
    }

    @Test
    @Tag("Negative")
    @DisplayName("Integer edge value(d)")
    public void IntegerValue_() {
        Assertions.assertNotEquals(double_const, 743, Dodecahedron.double_area_value(6), "For integer edge value we will get approximate value of dodecahedron area. Please, use float/double.");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Negative edge value(d)")
    public void NegativeValue_() {
        Assertions.assertEquals(double_const, Dodecahedron.double_area_value(-6.0), "The calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Positive edge value(d)")
    public void PositiveValue_() {
        Assertions.assertEquals(double_const, Dodecahedron.double_area_value(6.0), "The calculation is not correct");
    }
 
    @Test
    @Tag("Positive")
    @DisplayName("Positive five digits edge value(d)")
    public void PositiveFiveDigitsValue_() {
        Assertions.assertEquals(2.548804431426671E9, Dodecahedron.double_area_value(11111.0));
    }

    @Test
    @Tag("Positive")
    @DisplayName("Zero edge value(d)")
    public void ZeroValue_() {
        Assertions.assertEquals(0, Dodecahedron.double_area_value(0));
    }
/*
    @Test
    @Tag("exp: fail")
    @DisplayName("Check the result of dodecahedron area calculation without edge value")
    public void NoValue() {
        Assertions.assert(743.2462f, Dodecahedron.float_area_value(null), "There is no edge value");
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