package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.Cuboid.Cuboid;

public class CuboidTestClass {

    @Test
    public void CheckNegativeHeightLengthWidthSurfaceAreaCalculation(){
            Assertions.assertEquals("Cuboid parameters can not be 0 or lower", Cuboid.surfaceArea(-5,-6,-7));
    }

    @Test
    public void CheckNegativeHeightLengthSurfaceAreaCalculation(){
        Assertions.assertEquals("Cuboid parameters can not be 0 or lower", Cuboid.surfaceArea(-5,-6,7));
    }

    @Test
    public void CheckNegativeHeightWidthSurfaceAreaCalculation(){
        Assertions.assertEquals("Cuboid parameters can not be 0 or lower", Cuboid.surfaceArea(-5,6,-7));
    }

    @Test
    public void CheckPositiveHeightLengthWidthSurfaceAreaCalculation() {
        Assertions.assertEquals(Integer.toString(214), Cuboid.surfaceArea(5, 6, 7));
    }

    @Test
    public void CheckNegativeHeightLengthVolumeCalculation() {
        Assertions.assertEquals("Cuboid parameters can not be 0 or lower", Cuboid.volume(-5, -6, 7));
    }

    @Test
    public void CheckPositiveHeightLengthWidthVolumeCalculation() {
        Assertions.assertEquals(Integer.toString(210), Cuboid.volume(5, 6, 7));
    }

    @Test
    public void CheckPositiveFLoatHeightSurfaceAreaCalculation() {
        Assertions.assertEquals(Float.toString(228.56f), Cuboid.surfaceArea(5.56f, 6, 7));
    }

    @Test
    public void CheckPositiveFloatHeightLengthWidthVolumeCalculation() {
        Assertions.assertEquals(Float.toString(288.5229f), Cuboid.volume(5.56f, 6.67f, 7.78f));
    }

    @Test
    public void CheckZeroHeightSurfaceAreaCalculation() {
        Assertions.assertEquals("Cuboid parameters can not be 0 or lower", Cuboid.surfaceArea(0, 6, 7));
    }

    @Test
    public void CheckFiveDigitHeightSurfaceAreaCalculation() {
        Assertions.assertEquals(Integer.toString(321054), Cuboid.surfaceArea(12345, 6, 7));
    }
}
