package ua.donnu.ta;

public class HexagonalPrism {

    public static float baseArea(float base_side) {

        if (base_side < 0) {
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        } else if (base_side == 0) {
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        } else
            return (float) (3 * Math.pow(3, 0.5) * Math.pow(base_side, 2)) / 2;

    }

    public static float sideArea(float height, float baseSide){
        if (height<0 || baseSide<0){
            throw  new IllegalArgumentException("Figure parameters can only be above zero");
        }else if (height == 0 || baseSide == 0){
            throw  new IllegalArgumentException("Figure parameters can only be above zero");
        }
        return 6*(height*baseSide);
    }

    public static float surfaceArea(float height, float baseSide){
        return baseArea(baseSide)+sideArea(height, baseSide);
    }

    public static float prismVolume(float height, float base_side){
        if (height<0 || base_side<0){
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        }else if (height == 0 || base_side == 0){
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        }
        return (float) ((float) (Math.pow(3, 0.5)/2)*Math.pow(base_side, 2)*height);
    }

    public static int sideArea(int height, int baseSide){
        if (height<0 || baseSide<0){
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        }else if (height == 0 || baseSide == 0){
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        }
        return 6*(height*baseSide);
    }

    public static int baseArea(int baseSide){
        if (baseSide < 0) {
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        } else if (baseSide == 0) {
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        } else
        return (int) Math.round((3 * Math.pow(3, 0.5) * Math.pow(baseSide, 2)) / 2);
    }

    public static int prismVolume(int height, int baseSide){
        if (height<0 || baseSide<0){
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        }else if (height == 0 || baseSide == 0){
            throw new IllegalArgumentException("Figure parameters can only be above zero");
        }
        return (int) Math.round((Math.pow(3, 0.5)/2)*Math.pow(baseSide, 2)*height);
    }

    public static int surfaceArea(int height, int baseSide){
        return baseArea(baseSide)+sideArea(height, baseSide);
    }

}
