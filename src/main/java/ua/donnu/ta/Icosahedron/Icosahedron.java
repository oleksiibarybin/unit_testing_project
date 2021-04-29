package ua.donnu.ta.Icosahedron;

public class Icosahedron {
    public static float calculateFloatAreaValue(float edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Edge can only be positive");
        } else if (edge == 0) {
            throw new IllegalArgumentException("Edge can not be equal to zero");
        } else
            return (float) ((float) 5*Math.pow(3, 0.5)*Math.pow(edge, 2));

    }

    public static float calculateFloatVolume(float edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Edge can only be positive");
        } else if (edge == 0) {
            throw new IllegalArgumentException("Edge can not be equal to zero");
        } else
            return (float) ((float) 5/12*(Math.pow(5, 0.5)+3)*Math.pow(edge, 3));
    }

    public static double calculateDoubleAreaValue(double edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Edge can only be positive");
        } else if (edge == 0) {
            throw new IllegalArgumentException("Edge can not be equal to zero");
        } else
            return 5*Math.pow(3, 0.5)*Math.pow(edge, 2);
    }

    public static double calculateDoubleVolume(double edge) {
        if (edge < 0) {
            throw new IllegalArgumentException("Edge can only be positive");
        } else if (edge == 0) {
            throw new IllegalArgumentException("Edge can not be equal to zero");
        } else
            return 5/12*(Math.pow(5, 0.5)+3)*Math.pow(edge, 3);
    }

}