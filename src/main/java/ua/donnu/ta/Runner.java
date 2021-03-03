package ua.donnu.ta;
import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input prism height: ");
        String height = in.nextLine();
        System.out.println("Input prism base side: ");
        String base_side = in.nextLine();

        try{
            float n_height = Float.parseFloat(height);
            float n_base_side = Float.parseFloat(base_side);

            float side_area = HexagonalPrism.side_area(n_height, n_base_side);
            float base_area = HexagonalPrism.base_area(n_base_side);

            float surface_area = HexagonalPrism.surface_area(base_area, side_area);
            float prism_volume = HexagonalPrism.prism_volume(n_height, n_base_side);

            System.out.println("Hexagonal prism surface area = " + surface_area);
            System.out.println("Hexagonal prism volume = " + prism_volume);

        }catch (Throwable e){
            System.out.println(e.getMessage());
            System.out.println("Incorrect input data");
        }








    }

}
