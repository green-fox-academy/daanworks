public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double cuboidDimension1 = 2;
        double cuboidDimension2 = 3;
        double cuboidDimension3 = 4;

        double surfaceArea = 2 * ((cuboidDimension1 * cuboidDimension2) + (cuboidDimension1 * cuboidDimension3) + (cuboidDimension2 * cuboidDimension3));
        double volume = cuboidDimension1 * cuboidDimension2 * cuboidDimension3;

        System.out.println("Surface Area: " + (int)surfaceArea);
        System.out.println("Volume: " + (int)volume);
    }
}
