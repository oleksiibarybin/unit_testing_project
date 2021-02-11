package ua.donnu.ta;

public class Runner {

    public static void main(String[] args) {

        float height = 1.5F;
        float base_side = 1;

        float side_area = HexagonalPrism.side_area(height, base_side);
        float base_area = HexagonalPrism.base_area(base_side);

        float surface_area = HexagonalPrism.surface_area(base_area, side_area);
        float prism_volume = HexagonalPrism.prism_volume(height, base_side);

        System.out.println("Hexagonal prism surface area = " + surface_area);
        System.out.println("Hexagonal prism volume = " + prism_volume);


    }

}
