package ua.donnu.ta;

import ua.donnu.ta.dodecahedron.Dodecahedron;

public class Runner {

    public static void main(String[] args) {

        float result = (float) 743.3;

        float edge = 6;

        result = Dodecahedron.area(edge);

        System.out.println(result);

    }

}
