package ua.donnu.ta.Cylinder;

public class Cylinder {

    public static int surfaceArea (int height, int radius){
        if (height<= 0 | radius <= 0 ){
            return 0;
        }
        return (int) ((2*3.14*radius*height) + (2*3.14*radius*radius));
    }

    public static int cylinderVolume(int height, int radius){
        if (height<= 0 | radius <= 0 ) {
            return 0;
        }
        return ((int) 3.14*radius*radius*height);
    }

    public static float surfaceArea (float height, float radius){
        if (height<= 0 | radius <= 0 ){
            return 0;
        }
        return (float) ((2*3.14*radius*height) + (2*3.14*radius*radius));
    }

    public static float cylinderVolume(float height, float radius){
        if (height<= 0 | radius <= 0 ) {
            return 0;
        }
        return ((float) 3.14*radius*radius*height);
    }

}
