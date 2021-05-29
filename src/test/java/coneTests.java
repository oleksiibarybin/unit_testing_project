import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coneTests{
    @Test
    public void volume() throws Exception {
        cone c = new cone();

        //При r = 5 и h = 12 Ожидаемый результат "314"

        int actual = (int)Math.round(c.volume(5,12));
        float expected = 315;

        assertEquals(expected, actual,0);
    }

    @Test
    public void surface_area() {
        cone c = new cone();

        //При r = 5 и s = 13 Ожидаемый результат "283"

        float actual = (int)Math.round(c.surface_area(5,13));
        float expected = (float) 283;

        assertEquals(expected, actual,0);
    }
}