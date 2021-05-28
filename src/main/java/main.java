public class main {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String args[])
    {
        // Значения для теста:
        float radius = 5;
        float slant_height = 13;
        float height = 12;

        // Печать значения объема и площади конуса

        System.out.print(ANSI_GREEN + "Объем конуса: \n" +ANSI_RED);
        System.out.println(cone.volume(radius, height));


        System.out.print(ANSI_GREEN + "Площадь поверхности конуса : \n" +ANSI_RED);
        System.out.println(cone.surface_area(radius, slant_height));
    }

}
