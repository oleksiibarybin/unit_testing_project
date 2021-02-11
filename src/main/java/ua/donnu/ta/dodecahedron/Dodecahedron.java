package ua.donnu.ta.dodecahedron;

public class Dodecahedron {

    public static float area(float edge) {
        return (float) (3 * Math.pow(edge, 2) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))));
    }

}
