public class cone extends shape {

    static float pi = 3.14159f;


        // Функции для расчета:

    // Объем конуса
    public static float volume(float r, float h)
    {
        return (float)1 / 3 * pi * h * r * r;
    }

    // Площадь конуса

    public static float surface_area(float r, float s)
    {
        return pi * r * s + pi * r * r;
    }

}
