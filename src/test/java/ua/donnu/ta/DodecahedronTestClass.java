package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.dodecahedron.Dodecahedron;

public class DodecahedronTestClass {

    @Test
    @DisplayName("Check the result of dodecahedron area calculation float value")
    public void FloatNumber() {
        Assertions.assertEquals(743.2462f, Dodecahedron.float_area_value(6.0F), "The calculation is not correct");
    }

}
