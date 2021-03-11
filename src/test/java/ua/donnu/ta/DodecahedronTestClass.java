package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.dodecahedron.Dodecahedron;

public class DodecahedronTestClass {

    static final float EXPECTED_POSITIVE_FLOAT_VALUE = (float) 743.2462;
    static final double EXPECTED_POSITIVE_DOUBLE_VALUE = (double) 743.2462370544337;

    @Test
    @Tag("Positive")
    @DisplayName("Check float positive edge value 6.0F")
    public void checkFloatPositiveValue() {
        Assertions.assertEquals(EXPECTED_POSITIVE_FLOAT_VALUE, Dodecahedron.calculate_float_area_value(6.0F), "The calculation is not correct");
    }


    @Test
    @Tag("Positive")
    @DisplayName("Check float negative edge value -6.0F")
    public void NegativeValue() {
        Assertions.assertEquals(EXPECTED_POSITIVE_FLOAT_VALUE, Dodecahedron.calculate_float_area_value(-6.0f), "The calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check float positive edge value 6.0F")
    public void PositiveValue() {
        Assertions.assertEquals(EXPECTED_POSITIVE_FLOAT_VALUE, Dodecahedron.calculate_float_area_value(6.0F), "The calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check float positive five digits edge value 11111.0f")
    public void PositiveFiveDigitsValue() {
        Assertions.assertEquals(2.548804352E9, Dodecahedron.calculate_float_area_value(11111.0f));
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check 0 edge value")
    public void ZeroValue() {
        Assertions.assertEquals(0, Dodecahedron.calculate_float_area_value(0));
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check double edge value 6.0")
    public void DoubleValue() {
        Assertions.assertEquals(EXPECTED_POSITIVE_DOUBLE_VALUE, EXPECTED_POSITIVE_DOUBLE_VALUE, Dodecahedron.calculate_double_area_value(6), "Calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check double negative edge value -6.0")
    public void NegativeValue_() {
        Assertions.assertEquals(EXPECTED_POSITIVE_DOUBLE_VALUE, Dodecahedron.calculate_double_area_value(-6.0), "The calculation is not correct");
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check double positive edge value 6.0")
    public void PositiveValue_() {
        Assertions.assertEquals(EXPECTED_POSITIVE_DOUBLE_VALUE, Dodecahedron.calculate_double_area_value(6.0), "The calculation is not correct");
    }
 
    @Test
    @Tag("Positive")
    @DisplayName("Check double positive five digits edge value 11111.0")
    public void PositiveFiveDigitsValue_() {
        Assertions.assertEquals(2.548804431426671E9, Dodecahedron.calculate_double_area_value(11111.0));
    }

    @Test
    @Tag("Positive")
    @DisplayName("Check 0 edge value")
    public void ZeroValue_() {
        Assertions.assertEquals(0, Dodecahedron.calculate_double_area_value(0));
    }

}