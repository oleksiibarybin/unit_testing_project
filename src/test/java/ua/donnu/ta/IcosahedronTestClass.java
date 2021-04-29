package ua.donnu.ta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ua.donnu.ta.Icosahedron.*;

public class IcosahedronTestClass {

    @Test
    @DisplayName("Check float positive edge value 8.6F")
    public void checkSurfaceAreaIsCorrectWithFloatPositiveValueAsIcosahedronEdge() {
        Assertions.assertEquals(640.51245F, Icosahedron.calculateFloatAreaValue(8.6F), "The calculation is incorrect");
    }

    @Test
    @DisplayName("Check double positive edge value 8.6")
    public void checkSurfaceAreaIsCorrectWithDoublePositiveValueAsIcosahedronEdge() {
        Assertions.assertEquals(640.5123886389707, Icosahedron.calculateDoubleAreaValue(8.6), "The calculation is incorrect");
    }

    @Test
    @DisplayName("Check float negative edge value -8.6F for surface area")
    public void checkIllegalArgumentExceptionIsThrownForNegativeFloatEdgeInArea() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Icosahedron.calculateFloatAreaValue(-8.6F);
        });
    }

    @Test
    @DisplayName("Check float negative edge value -8.6F for volume")
    public void checkIllegalArgumentExceptionIsThrownForNegativeFloatEdgeInVolume() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Icosahedron.calculateFloatVolume(-8.6F);
        });
    }

    @Test
    @DisplayName("Check double negative edge value -8.6 for surface area")
    public void checkIllegalArgumentExceptionIsThrownForNegativeDoubleEdgeInArea() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Icosahedron.calculateDoubleAreaValue(-8.6);
        });
    }

    @Test
    @DisplayName("Check double negative edge value -8.6 for volume")
    public void checkIllegalArgumentExceptionIsThrownForNegativeDoubleEdgeInVolume() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Icosahedron.calculateDoubleVolume(-8.6);
        });
    }

    @Test
    @DisplayName("Check zero value for volume")
    public void checkVolumeWithZeroValueAsIcosahedronEdge() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Icosahedron.calculateDoubleVolume(0);
        });
    }

    @Test
    @DisplayName("Check zero value for surface area")
    public void checkSurfaceAreaWithZeroValueAsIcosahedronEdge() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Icosahedron.calculateDoubleVolume(0);
        });
    }

}