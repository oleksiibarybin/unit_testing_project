package ua.donnu.ta;

import static org.junit.jupiter.api.Assertions.*;

public class HexagonalPrismTestClass {

    public void hui(){
        assertEquals(1485.9994, HexagonalPrism.surface_area(HexagonalPrism.base_area(14),HexagonalPrism.side_area(13, 5)));
    }

}
