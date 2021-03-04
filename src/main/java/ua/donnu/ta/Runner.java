package ua.donnu.ta;

public class Runner {

    public static void main(String[] args) {

        float height = 12;
        float base_side = 20;

        float side_area = HexagonalPrism.side_area(height, base_side);
        float base_area = HexagonalPrism.base_area(base_side);
        float surface_area = HexagonalPrism.surface_area(base_area, side_area);
        float prism_volume = HexagonalPrism.prism_volume(height, base_side);

        TypeTester testMe = new TypeTester();

        if (testMe.printType(height) == 1 && testMe.printType(base_side) == 1) {
            System.out.println("Hexagonal prism surface area = " + Math.round(surface_area));
            System.out.println("Hexagonal prism volume = " + Math.round(prism_volume));
        }else if (testMe.printType(height) == 2 && testMe.printType(base_side) == 2) {
            System.out.println("Hexagonal prism surface area = " + surface_area);
            System.out.println("Hexagonal prism volume = " + prism_volume);
        }else{
            throw new RuntimeException("Incorrect input data type");
        }






    }

}

