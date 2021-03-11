package ua.donnu.ta;

public class Runner {

    public static void main(String[] args) {

        int height = 10;
        int baseSide = 20;

        int surfaceArea = HexagonalPrism.surfaceArea(height, baseSide);
        int prismVolume = HexagonalPrism.prismVolume(height, baseSide);

        System.out.println("Hexagonal prism surface area = " + surfaceArea);
        System.out.println("Hexagonal prism volume = " + prismVolume);

    }

}

