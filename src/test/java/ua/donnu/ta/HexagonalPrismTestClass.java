package ua.donnu.ta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;


public class HexagonalPrismTestClass {
    //@Disabled
    @Test
    @DisplayName("Hexagonal prism surface area calculator logical functionality test for positive float numbers")
    public void checkSurfaceAreaCalculationIsCorrectForPositiveFloatHeightAndBaseSide(){
        assertEquals(1493.449462890625, HexagonalPrism.surfaceArea(14.5F, 12.5F));
    }

    @Test
    public void checkIllegalArgumentExceptionIsThrownForNegativeFloatHeight(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(-12.5F, 14.5F);
        });
    }

    @Test
    public void checkIllegalArgumentExceptionIsThrownForZeroHeight(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(0, 14.5F);
        });
    }

    @Test
    public void checkIllegalArgumentExceptionIsThrownForNegativeFloatBaseSide(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(12.5F, -14.5F);
        });
    }

    @Test
    public void checkIllegalArgumentExceptionIsThrownForZeroBaseSide(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(12.5F, 0);
        });
    }

    @Test
    @DisplayName("Hexagonal prism surface area calculator test for positive float height and integer base side")
    public void checkSurfaceAreaCalculationIsCorrectForPositiveFloatHeightAndIntegerBaseSide(){
        assertEquals(1418.123046875, HexagonalPrism.surfaceArea(14.5F, 12));
    }

    @Test
    public void checkSurfaceAreaCalculationIsCorrectForPositiveIntegerHeightAndBaseSide(){
        assertEquals(2239, HexagonalPrism.surfaceArea(10,20));
    }

    public static int[] [] data(){
        return new int[][]{{880331264, 1012000000, 1112000000}, {950, 8, 12}, {1395, 9, 15}};
    }

    @ParameterizedTest
    @MethodSource (value = "data")
    @DisplayName("Check that program can work with multi-digit values")
    void TestWithSetsOfParameters(int[] data){

        int expected = data[0];
        int height = data[1];
        int baseSide = data[2];

        assertEquals(expected, HexagonalPrism.surfaceArea(height, baseSide));
    }

}
