package ua.donnu.ta;

public class Runner {

    public static void main(String[] args) {

        int height = 10;
        int base_side = 20;

        int side_area = HexagonalPrism.side_area(height, base_side);
        int base_area = HexagonalPrism.base_area(base_side);
        int surface_area = HexagonalPrism.surface_area(base_area, side_area);
        int prism_volume = HexagonalPrism.prism_volume(height, base_side);

        System.out.println("Hexagonal prism surface area = " + surface_area);
        System.out.println("Hexagonal prism volume = " + prism_volume);

    }

}

