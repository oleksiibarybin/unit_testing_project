package ua.donnu.ta;

import ua.donnu.ta.square.Square;

public class Runner {

    public static void main(String[] args) {

        int result = 0;

        int sideFirst = 2;
        int sideSecond = 4;

        result = Square.area(sideFirst, sideSecond);

        System.out.println(result);
    }

}
