package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.Cylinder.Cylinder;

public class CylinderTestClass {

    @Test
    @DisplayName("Testing of surface area calculation for positive integer numbers")
    public void checkIfSurfaceAreaCalculationForPositiveIntNumbersIsCorrect() {
        Assertions.assertEquals(628, Cylinder.surfaceArea(15, 5));
    }

    @Test
    @DisplayName("Testing of surface area calculation for negative integer numbers")
    public void checkIfSurfaceAreaCalculationForNegativeIntNumbersIsCorrect() {
        Assertions.assertEquals(1, Cylinder.surfaceArea(-15, -5));
    }

    @Test
    @DisplayName("Testing of surface area calculation for positive float numbers")
    public void checkIfSurfaceAreaCalculationForPositiveFloatNumbersIsCorrect() {
        Assertions.assertEquals(628.0, Cylinder.surfaceArea(15f, 5f));
    }

    @Test
    @DisplayName("Testing of surface area calculation for negative float numbers")
    public void checkIfSurfaceAreaCalculationForNegativeFloatNumbersIsCorrect() {
        Assertions.assertEquals(1, Cylinder.surfaceArea(-15f, -5f));
    }

    @Test
    @DisplayName("Testing of surface area calculation for zero numbers")
    public void checkIfSurfaceAreaCalculationForZeroNumbersIsCorrect() {
        Assertions.assertEquals(1, Cylinder.surfaceArea(0, -5));
    }

    @Test
    @DisplayName("Testing of volume calculation for positive integer numbers")
    public void checkIfVolumeCalculationForPositiveIntNumbersIsCorrect() {
        Assertions.assertEquals(1125, Cylinder.cylinderVolume(15, 5));
    }

    @Test
    @DisplayName("Testing of volume calculation for negative integer numbers")
    public void checkIfVolumeCalculationForNegativeIntNumbersIsCorrect() {
        Assertions.assertEquals(1, Cylinder.cylinderVolume(-15, -5));
    }

    @Test
    @DisplayName("Testing of volume calculation for positive float numbers")
    public void checkIfVolumeCalculationForPositiveFloatNumbersIsCorrect() {
        Assertions.assertEquals(1177.5, Cylinder.cylinderVolume(15f, 5f));
    }

    @Test
    @DisplayName("Testing of volume calculation for negative float numbers")
    public void checkIfVolumeCalculationForNegativeFloatNumbersIsCorrect() {
        Assertions.assertEquals(1, Cylinder.cylinderVolume(-15f, -5f));
    }

    @Test
    @DisplayName("Testing of volume calculation for zero numbers")
    public void checkIfVolumeCalculationForZeroNumbersIsCorrect() {
        Assertions.assertEquals(1, Cylinder.cylinderVolume(15, 0));
    }
}