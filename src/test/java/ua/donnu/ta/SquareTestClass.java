package ua.donnu.ta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ua.donnu.ta.square.Square;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTestClass {

    public static int[][] positiveNumbers(){
        return new int[][] {{4, 2, 2}, {16, 4, 4}};
    }

    @Tag("Positive")
    @Test
    @ParameterizedTest
    @MethodSource("positiveNumbers")
    @DisplayName("Check the result of square area calculation for positive numbers set")
        public void checkSquareAreaCalculationIsCorrectForPositiveNumbers(int[] data) {

        int expectedResult = data[0];
        int firstSide = data[1];
        int secondSide = data[2];

        assertEquals(expectedResult, Square.area(firstSide,secondSide), "The calculation is NOT correct");
    }

    @Tag("Negative")
    @Test
    @DisplayName("Check the result of square area calculation for negative numbers set")
    public void checkSquareAreaCalculationIsCorrectForNegativeNumbers() {
        assertEquals(4, Square.area(-2,-2), "The calculation is NOT correct");
    }

}
