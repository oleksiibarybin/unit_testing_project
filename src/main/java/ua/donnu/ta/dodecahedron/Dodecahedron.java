package ua.donnu.ta.dodecahedron;

public class Dodecahedron {

    public static float float_area_value(float edge) {
        return (float) (3 * Math.pow(edge, 2) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))));
    }

    public static double double_area_value(double edge) {
        return (double) (3 * Math.pow(edge, 2) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))));
    }
}
