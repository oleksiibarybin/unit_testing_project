package ua.donnu.ta.Cuboid;

public class Cuboid {
    public static String surfaceArea(int a, int b, int c){
        if (a<=0|b<=0|c<=0){
            return "Cuboid parameters can not be 0 or lower";
        }
        return Integer.toString(2*(b*c+b*a+c*a));
    }

    public static String volume(int a, int b, int c){
        if (a<=0|b<=0|c<=0){
            return "Cuboid parameters can not be 0 or lower";
        }
        return Integer.toString(a*b*c);
    }

    public static String surfaceArea(float a, float b, float c){
        if (a<=0|b<=0|c<=0){
            return "Cuboid parameters can not be 0 or lower";
        }
        return Float.toString(2*(b*c+b*a+c*a));
    }

    public static String volume(float a, float b, float c){
        if (a<=0|b<=0|c<=0){
            return "Cuboid parameters can not be 0 or lower";
        }
        return Float.toString(a*b*c);
    }
}
