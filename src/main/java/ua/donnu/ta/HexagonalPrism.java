package ua.donnu.ta;

public class HexagonalPrism {

    public static float base_area(float base_side) {

        if (base_side < 0) {
            throw new RuntimeException("Figure parameters can only be above zero");
        } else if (base_side == 0) {
            throw new RuntimeException("Figure parameters can only be above zero");
        } else if (base_side == ' ') {
            throw new RuntimeException("To calculate figure`s surface area and volume input values");
        } else
            return (float) (3 * Math.pow(3, 0.5) * Math.pow(base_side, 2)) / 2;

    }

    public static float side_area(float height, float base_side){
        if (height<0 || base_side<0){
            throw  new RuntimeException("Figure parameters can only be above zero");
        }else if (height == 0 || base_side == 0){
            throw  new RuntimeException("Figure parameters can only be above zero");
        }else if (height == ' ' || base_side == ' '){
            throw  new RuntimeException("To calculate figure`s surface area and volume input values");
        }
        return 6*(height*base_side);
    }

    public static float surface_area(float base_area, float side_area){
        return base_area+side_area;
    }

    public static float prism_volume(float height, float base_side){
        if (height<0 || base_side<0){
            throw new RuntimeException("Figure parameters can only be above zero");
        }else if (height == 0 || base_side == 0){
            throw new RuntimeException("Figure parameters can only be above zero");
        }else if (height == ' ' || base_side == ' '){
            throw new RuntimeException("To calculate figure`s surface area and volume input values");
        }
        return (float) ((float) (Math.pow(3, 0.5)/2)*Math.pow(base_side, 2)*height);
    }

    public static int side_area(int height, int base_side){
        return 6*(height*base_side);
    }

    public static int base_area(int base_side){
        return (int) Math.round((3 * Math.pow(3, 0.5) * Math.pow(base_side, 2)) / 2);
    }

    public static int prism_volume(int height, int base_side){
        return (int) Math.round((Math.pow(3, 0.5)/2)*Math.pow(base_side, 2)*height);
    }

    public static int surface_area(int base_area, int side_area){
        return base_area+side_area;
    }

    public static String base_area(String base_side){
        return new String("Wrong Data type(Only Int or Float)");
    }

    public static String side_area(String height, String base_side){
        return new String("Wrong Data type(Only Int or Float)");
    }

    public static String prism_volume(String height, String base_side){
        return new String("Wrong Data Type(Only Int or Float)");
    }

    public static RuntimeException base_area(double base_side){
        return new RuntimeException("Wrong Data type(Only Int or Float)");
    }

    public static RuntimeException side_area(double height, double base_side){
        return new RuntimeException("Wrong Data type(Only Int or Float)");
    }

    public static RuntimeException prism_volume(double height, double base_side){
        return new RuntimeException("Wrong Data Type (Only Int or Float)");
    }



}
