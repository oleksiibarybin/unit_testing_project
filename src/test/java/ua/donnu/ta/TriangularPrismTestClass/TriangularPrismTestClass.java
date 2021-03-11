package ua.donnu.ta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ua.donnu.ta.TriangularPrism.TriangularPrism;

public class TriangularPrismTestClass {

    public static double[][] IntegerSidesV(){
        return new double[][]{{3185,22,19,20,18}, {9,2,2,2,5},{43,3,4,6,8}, {238,5,4,8,29}, {62343,101,100,59,22}};
    }
    @ParameterizedTest
    @DisplayName("1Check rusult of calculation for integer numbers set")
    @MethodSource("IntegerSidesV")
    public void checkTriangularPrismAreaCalculationForPairNumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] TriangleCantExistV(){
        return new double[][]{{-1,3,4,12,2}, {-1,22,19,50,2}, {-1,8,19,43,2}, {-1,22,17,52,2}, {-1,63,22,100,2}};
    }

    @ParameterizedTest
    @DisplayName("2Check rusult of calculation for TriangleCantExist numbers set")
    @MethodSource("TriangleCantExistV")
    public void checkTriangularPrismCantCalculateForTriangleCantExistV(double[] data1){
        double expectedResult = data1[0];
        double firstSide = data1[1];
        double secondSide = data1[2];
        double thirdSide = data1[3];
        double hight = data1[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] PairNumbersV(){
        return new double[][]{{64,4,4,6,8}, {179,6,6,8,10}, {1136,22,24,18,6}, {29334,100,50,102,12}, {96,10,6,8,4}};
    }

    @ParameterizedTest
    @DisplayName("3Check rusult of calculation for pair numbers set")
    @MethodSource("PairNumbersV")
    public void checkTriangularPrismCantCalculateForPairNumbersV(double[] data1){
        double expectedResult = data1[0];
        double firstSide = data1[1];
        double secondSide = data1[2];
        double thirdSide = data1[3];
        double hight = data1[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] ZeroNumbersV(){
        return new double[][]{{-2,0,4,6,8}, {-2,6,0,8,10}, {-2,22,24,0,6}, {-2,100,50,102,0}, {-2,0,0,0,0}};
    }

    @ParameterizedTest
    @DisplayName("4Check rusult of calculation for zero numbers set")
    @MethodSource("ZeroNumbersV")
    public void checkTriangularPrismCantCalculateForZeroNumbersV(double[] data1){
        double expectedResult = data1[0];
        double firstSide = data1[1];
        double secondSide = data1[2];
        double thirdSide = data1[3];
        double hight = data1[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] FloatSidesV(){
        return new double[][]{{863,13.3,14.8,16.6,9.2}, {13,2.4,2.2,2.4,5.3}, {324,5.5,4.5,8.6,29.7}, {66300,101.8,100.9,59.8,22.9}, {3416,22.3,19.8,20.6,18.2}};
    }

    @ParameterizedTest
    @DisplayName("5Check rusult of calculation for Float(round1) numbers set")
    @MethodSource("FloatSidesV")
    public void checkTriangularPrismAreaCalculationForFloatNumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] NegativeSidesV(){
        return new double[][]{{-2,-1,14.8,16.6,9.2}, {-2,2.4,2.21,-1,5.3}, {-2,5.5,-1,8.6,29.7}, {-2,101.8,100.9,-1,22.9}, {-2,22.3,19.8,20.6,-1}};
    }

    @ParameterizedTest
    @DisplayName("6Check rusult of calculation for Negative numbers set")
    @MethodSource("NegativeSidesV")
    public void checkTriangularPrismAreaCalculationForNegativeNumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] NonPairSidesV(){
        return new double[][]{{59,3,5,7,9}, {1579,21,23,25,7}, {809,7,11,13,21}, {2515,25,27,19,11}, {569,17,15,11,7}};
    }

    @ParameterizedTest
    @DisplayName("7Check rusult of calculation for NonPair numbers set")
    @MethodSource("NonPairSidesV")
    public void checkTriangularPrismAreaCalculationForNonPairNumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }
    public static double[][] SQRTSidesV(){
        return new double[][]{{132,Math.sqrt(36),5,7,9}, {642,Math.sqrt(64),23,25,7}, {629,7,Math.sqrt(81),13,21}, {512,Math.sqrt(81),27,19,11}, {569,17,15,11,Math.sqrt(49)}};
    }

    @ParameterizedTest
    @DisplayName("8Check rusult of calculation for SQRT numbers set")
    @MethodSource("SQRTSidesV")
    public void checkTriangularPrismAreaCalculationForSQRTNumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }


    public static double[][] IntFloatSidesV(){
        return new double[][]{{849,13,14.8,16.6,9.22}, {11,2.4,2.21,2,5.3}, {354,5.5,4.5,8,29.7}, {66409,101.8,100.9,59.88,22.91}, {3308,22.3,19.8,20,18}};
    }

    @ParameterizedTest
    @DisplayName("9Check rusult of calculation for Integer and float set")
    @MethodSource("IntFloatSidesV")
    public void checkTriangularPrismAreaCalculationForIntFloatNumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] IntFloatRound2SidesV(){
        return new double[][]{{852,13,14.88,16.6,9.22}, {12,2.44,2.21,2,5.3}, {354,5.5,4.5,8,29.7}, {66409,101.8,100.9,59.88,22.91}, {3308,22.3,19.8,20,18}};
    }

    @ParameterizedTest
    @DisplayName("10Check rusult of calculation for Float(round2) numbers set")
    @MethodSource("IntFloatRound2SidesV")
    public void checkTriangularPrismAreaCalculationForFloatRound2NumbersV(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.Volume(firstSide,secondSide,thirdSide,hight));
    }


    public static double[][] IntegerSidesS(){
        return new double[][]{{1452,22,19,20,18}, {34,2,2,2,5},{115,3,4,6,8}, {510,5,4,8,29}, {11388,101,100,59,22}};
    }

    @ParameterizedTest
    @DisplayName("11Check rusult of calculation for integer numbers set")
    @MethodSource("IntegerSidesS")
    public void checkTriangularPrismAreaCalculationForPairNumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));

    }


    public static double[][] TriangleCantExistS(){
        return new double[][]{{-1,3,4,12,2}, {-1,22,19,50,2}, {-1,8,19,43,2}, {-1,22,17,52,2}, {-1,63,22,100,2}};
    }

    @ParameterizedTest
    @DisplayName("12Check rusult of calculation for TriangleCantExist numbers set")
    @MethodSource("TriangleCantExistS")
    public void checkTriangularPrismCantCalculateForTriangleCantExistS(double[] data1){
        double expectedResult = data1[0];
        double firstSide = data1[1];
        double secondSide = data1[2];
        double thirdSide = data1[3];
        double hight = data1[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] PairNumbersS(){
        return new double[][]{{128,4,4,6,8}, {236,6,6,8,10}, {763,22,24,18,6}, {7913,100,50,102,12}, {144,10,6,8,4}};
    }

    @ParameterizedTest
    @DisplayName("13Check rusult of calculation for pair numbers set")
    @MethodSource("PairNumbersS")
    public void checkTriangularPrismCantCalculateForPairNumbersS(double[] data1){
        double expectedResult = data1[0];
        double firstSide = data1[1];
        double secondSide = data1[2];
        double thirdSide = data1[3];
        double hight = data1[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] ZeroNumbersS(){
        return new double[][]{{-2,0,4,6,8}, {-2,6,0,8,10}, {-2,22,24,0,6}, {-2,100,50,102,0}, {-2,0,0,0,0}};
    }

    @ParameterizedTest
    @DisplayName("14Check rusult of calculation for zero numbers set")
    @MethodSource("ZeroNumbersS")
    public void checkTriangularPrismCantCalculateForZeroNumbersS(double[] data1){
        double expectedResult = data1[0];
        double firstSide = data1[1];
        double secondSide = data1[2];
        double thirdSide = data1[3];
        double hight = data1[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] FloatSidesS(){
        return new double[][]{{599,13.3,14.8,16.6,9.2}, {42,2.4,2.2,2.4,5.3}, {574,5.5,4.5,8.6,29.7}, {11802,101.8,100.9,59.8,22.9}, {1517,22.3,19.8,20.6,18.2}};
    }

    @ParameterizedTest
    @DisplayName("15Check rusult of calculation for Float(round1) numbers set")
    @MethodSource("FloatSidesS")
    public void checkTriangularPrismAreaCalculationForFloatNumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] NegativeSidesS(){
        return new double[][]{{-2,-1,14.8,16.6,9.2}, {-2,2.4,2.21,-1,5.3}, {-2,5.5,-1,8.6,29.7}, {-2,101.8,100.9,-1,22.9}, {-2,22.3,19.8,20.6,-1}};
    }

    @ParameterizedTest
    @DisplayName("16Check rusult of calculation for Negative numbers set")
    @MethodSource("NegativeSidesS")
    public void checkTriangularPrismAreaCalculationForNegativeNumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }


    public static double[][] NonPairSidesS(){
        return new double[][]{{148,3,5,7,9}, {934,21,23,25,7}, {728,7,11,13,21}, {1238,25,27,19,11}, {464,17,15,11,7}};
    }

    @ParameterizedTest
    @DisplayName("17Check rusult of calculation for NonPair numbers set")
    @MethodSource("NonPairSidesS")
    public void checkTriangularPrismAreaCalculationForNonPairNumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] SQRTSidesS(){
        return new double[][]{{191,Math.sqrt(36),5,7,9}, {575,Math.sqrt(64),23,25,7}, {629,7,Math.sqrt(81),13,21}, {698,Math.sqrt(81),27,19,11}, {464,17,15,11,Math.sqrt(49)}};
    }

    @ParameterizedTest
    @DisplayName("18Check rusult of calculation for SQRT numbers set")
    @MethodSource("SQRTSidesS")
    public void checkTriangularPrismAreaCalculationForSQRTNumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }


    public static double[][] IntFloatSidesS(){
        return new double[][]{{593,13,14.8,16.6,9.22}, {39,2.4,2.21,2,5.3}, {558,5.5,4.5,8,29.7}, {11574,101.8,100.9,59.88,22}, {1485,22.3,19.8,20,18}};
    }

    @ParameterizedTest
    @DisplayName("19Check rusult of calculation for Integer and float set")
    @MethodSource("IntFloatSidesS")
    public void checkTriangularPrismAreaCalculationForIntFloatNumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }

    public static double[][] IntFloatRound2SidesS(){
        return new double[][]{{602,13.32,14.88,16.66,9.22}, {43,2.44,2.21,2.22,5.63}, {576,5.55,4.65,8.33,29.77}, {11821,101.86,100.99,59.88,22.91}, {1514,22.63,19.86,20.22,18.18}};
    }

    @ParameterizedTest
    @DisplayName("20Check rusult of calculation for Float(round2) numbers set")
    @MethodSource("IntFloatRound2SidesS")
    public void checkTriangularPrismAreaCalculationForFloatRound2NumbersS(double[] data){
        double expectedResult = data[0];
        double firstSide = data[1];
        double secondSide = data[2];
        double thirdSide = data[3];
        double hight = data[4];
        Assertions.assertEquals(expectedResult,TriangularPrism.surfaceArea(firstSide,secondSide,thirdSide,hight));
    }
}
