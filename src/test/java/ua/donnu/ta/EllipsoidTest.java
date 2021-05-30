package ua.donnu.ta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.Ellipsoid.Ellipsoid;

public class EllipsoidTest {

    @Test
    @DisplayName("Input positive double values")
    public void CheckPositiveDoubleAxisValues(){
        Assertions.assertEquals("[1308.1062383345945, 2766.635590738511]", Ellipsoid.main(5.75,10.12,15.134));
    }

    @Test
    @DisplayName("Input negative axis n_1 value")
    public void CheckNegativeDoubleAxis1value() {
        Assertions.assertEquals("Error occurred", Ellipsoid.main(-5.34, 10.123, 15.442));
    }

    @Test
    @DisplayName("Input negative axis n_2 value")
    public void CheckNegativeDoubleAxis2Value(){
        Assertions.assertEquals("Error occurred", Ellipsoid.main(5.43, -10.78, 15.23));
    }

    @Test
    @DisplayName("Input negative axis n_3 value")
    public void CheckNegativeDoubleAxis3Value(){
        Assertions.assertEquals("Error occurred", Ellipsoid.main(5.23, 10.54, -15.234));
    }

    @Test
    @DisplayName("Input zero axis n_1 value")
    public void CheckZeroAxis1Value(){
        Assertions.assertEquals("Error occurred", Ellipsoid.main(0, 10.12, 15.76));
    }

    @Test
    @DisplayName("Input zero axis n_2 value")
    public void CheckZeroAxis2Value(){
        Assertions.assertEquals("Error occurred", Ellipsoid.main(5.213, 0, 15.324));
    }

    @Test
    @DisplayName("Input zero axis n_3 value")
    public void CheckZeroAxis3Value(){
        Assertions.assertEquals("Error occurred", Ellipsoid.main(5.13, 10.2, 0));
    }

    @Test
    @DisplayName("Input positive integer values")
    public void CheckPositiveIntegerAxisValues(){
        Assertions.assertEquals("[1223.4156346392629, 2356.194490192345]", Ellipsoid.main(5,10,15));
    }

}
