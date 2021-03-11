package ua.donnu.ta.TriangularPrism;

public class TriangularPrism {
    public static double surfaceArea (double firstside, double secondside, double thirdside, double hight){
        if(firstside <= 0  || thirdside <= 0  || secondside <= 0 || hight <= 0 )
            return -2;

        if(firstside + secondside < thirdside || firstside + thirdside < secondside || secondside+ thirdside < firstside)
            return -1;

        double halpPerimetr = (firstside + secondside + thirdside)/2;
        double AreaTriangular = Math.sqrt((halpPerimetr * (halpPerimetr - firstside) * (halpPerimetr - secondside) * (halpPerimetr - thirdside)) );
        double SurfaceTriangularPrism = AreaTriangular * 2 + (firstside + secondside + thirdside) * hight;

        double result = Math.ceil(SurfaceTriangularPrism);

        return result;
    }
    public static double Volume (double firstside, double secondside, double thirdside, double hight){
        if(firstside <= 0  || thirdside <= 0  || secondside <= 0 || hight <= 0 )
            return -2;
        if(firstside + secondside < thirdside || firstside + thirdside < secondside || secondside+ thirdside < firstside)
            return -1;


        double halpPerimetr = (firstside + secondside + thirdside)/2;
        double AreaTriangular = Math.sqrt((halpPerimetr * (halpPerimetr - firstside) * (halpPerimetr - secondside) * (halpPerimetr - thirdside)) );
        double Volume = AreaTriangular * hight;

        double result = Math.ceil(Volume);
        return result;
    }
}

