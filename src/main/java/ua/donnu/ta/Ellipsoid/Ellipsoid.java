package ua.donnu.ta.Ellipsoid;

import java.util.Arrays;

public class Ellipsoid {

    public static String main(double n_1, double n_2, double n_3) {
        if (n_1<=0|n_2<=0|n_3<=0){
            return "Error occurred";
        }
        double s_a = 4*Math.PI*Math.pow((Math.pow((n_1*n_2), 1.6)+Math.pow((n_1*n_3), 1.6)+Math.pow((n_2*n_3), 1.6))/3, (1/1.6));
        double v = (4/3)*Math.PI*n_1*n_2*n_3;
        double[] result = new double[]{s_a,v};
        String result1 = Arrays.toString(result);
        return result1;
    }

}

