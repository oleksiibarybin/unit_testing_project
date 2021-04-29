package ua.donnu.ta;

import ua.donnu.ta.Icosahedron.Icosahedron;

public class Runner {

    public static void main(String[] args) {
        double result;

        double edge = 8.6;

        result = Icosahedron.calculateDoubleAreaValue(edge);

        System.out.println(result);

    }

}