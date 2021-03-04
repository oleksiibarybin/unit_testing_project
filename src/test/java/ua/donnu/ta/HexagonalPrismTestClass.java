package ua.donnu.ta;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HexagonalPrismTestClass {
    //@Disabled
    @Test
    @DisplayName("Hexagonal prism surface area calculator logical functionality test for positive float numbers")
    public void HexagonalPrismSurfaceAreaAndVolumeCalculatorLogicalFunctionalityCheck(){
        assertEquals(1493.449462890625, HexagonalPrism.surface_area(HexagonalPrism.base_area((float)12.5),HexagonalPrism.side_area((float)14.5, (float)12.5)));
    }

    @Test
    public void HexagonalPrismSurfaceAreaAndVolumeCalculatorNegativeNumbersCalculationCheck(){
        assertEquals(2276.02294921875, HexagonalPrism.prism_volume(-12.5F, -14.5F));
    }

    @Test
    public void ExceptionTesting(){
        assertThrows(RuntimeException.class, () -> {
            HexagonalPrism.prism_volume(-12.5F, -14.5F);
        });
    }

    @Test
    public void NoInputTesting(){
        assertThrows(RuntimeException.class, () -> {
            HexagonalPrism.prism_volume(' ', ' ');
        });
    }

//    @Test
//    public void
//
}
