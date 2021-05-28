import static org.junit.Assert.*;

public class coneTest {

    @org.junit.Test
    public void volume() throws Exception {
        cone c = new cone();

        //При r = 5 и h = 12 Ожидаемый результат "314"

        int actual = (int)Math.round(c.volume(5,12));
        float expected = 314;

        assertEquals(actual, expected, 0);
    }

    @org.junit.Test
    public void surface_area() {
        cone c = new cone();

        //При r = 5 и s = 13 Ожидаемый результат "283"

        float actual = (int)Math.round(c.surface_area(5,13));
        float expected = (float) 283;

        assertEquals(actual, expected, 0);
    }
}