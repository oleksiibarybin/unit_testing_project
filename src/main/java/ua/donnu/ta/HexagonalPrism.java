package ua.donnu.ta;

public class HexagonalPrism {

    public static float base_area(float base_side){
        return (float) (3*Math.pow(3, 0.5)*Math.pow(base_side, 2))/2;
    }

    public static float side_area(float height, float base_side){
        return 6*(height*base_side);
    }

    public static float surface_area(float base_area, float side_area){
        return base_area+side_area;
    }

    public static float prism_volume(float height, float base_side){
        return (float) ((float) (Math.pow(3, 0.5)/2)*Math.pow(base_side, 2)*height);
    }

    public static int base_area(int base_side){

        return (int) (3*Math.pow(3, 0.5)*Math.pow(base_side, 2))/2;
    }

    public static int side_area(int height, int base_side){
        return 6*(height*base_side);
    }

    public static int surface_area(int base_area, int side_area){
        return base_area+side_area;
    }

    public static int prism_volume(int height, int base_side){
        return (int) ((int) (Math.pow(3, 0.5)/2)*Math.pow(base_side, 2)*height);
    }
}
