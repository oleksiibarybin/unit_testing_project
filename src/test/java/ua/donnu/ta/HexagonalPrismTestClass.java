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
    public void HexagonalPrismSurfaceAreaAndVolumeCalculatorLogicalFunctionalityCheck(){
        assertEquals(1493.449462890625, HexagonalPrism.surfaceArea(14.5F, 12.5F));
    }

    @Test
    public void HexagonalPrismNegativeHeightCalcTesting(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(-12.5F, 14.5F);
        });
    }

    @Test
    public void HexagonalPrismZeroHeightCalcTesting(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(0, 14.5F);
        });
    }

    @Test
    public void HexagonalPrismNegativeBaseSideCalcTesting(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(12.5F, -14.5F);
        });
    }

    @Test
    public void HexagonalPrismZeroBaseSideCalcTesting(){
        assertThrows(IllegalArgumentException.class, () -> {
            HexagonalPrism.prismVolume(12.5F, 0);
        });
    }

    @Test
    @DisplayName("Hexagonal prism surface area calculator test for positive float height and integer base side")
    public void HexagonalPrismSurfaceAreaAndVolumeCalculatorDifferentTypesOfDataCheck(){
        assertEquals(1418.123046875, HexagonalPrism.surfaceArea(14.5F, 12));
    }

    @Test
    public void HexagonalPrismSurfaceAreaAndVolumeCalculatorIntegerValuesCheck(){
        assertEquals(1460, HexagonalPrism.surfaceArea(HexagonalPrism.baseArea(10),HexagonalPrism.sideArea(10, 20)));
    }

    public static int[] [] data(){
        return new int[][]{{90, 2, 4}, {950, 8, 12}, {1395, 9, 15}};
    }

    @ParameterizedTest
    @MethodSource (value = "data")
    void TestWithSetsOfParameters(int[] data){

        int expected = data[0];
        int height = data[1];
        int base_side = data[2];

        assertEquals(expected, HexagonalPrism.surfaceArea(HexagonalPrism.baseArea(base_side),HexagonalPrism.sideArea(height, base_side)));
    }

}
