package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.Cylinder.Cylinder;

public class CylinderTestClass {

    @Test
    @DisplayName("Testing of surface area calculation for positive integer numbers")
    public void checkIfSurfaceAreaCalculationForPositiveIntNumbersIsCorrect(){
        Assertions.assertEquals(628, Cylinder.surfaceArea(15,5));
    }


}
