import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        double height = 0;
        double width = 0;
        double length = 0;
        Scanner input = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.println(" Please enter the height in meters ");
            if (input.hasNextDouble())
                height = input.nextDouble();
            System.out.println(" Please enter the width in meters ");
            if (input.hasNextDouble())
                width = input.nextDouble();
            System.out.println(" Enter the length of side 1 in meters ");
            if (input.hasNextDouble())
                length = input.nextDouble();

            done = true;
        } while (!done);

        double area = length * width;
        double perimeter = 2 * (length * width);
        System.out.println(" The area is " + area);
        System.out.println(" The perimeter is " + perimeter);
        double diagonal = Math.sqrt((length * length) + (width * width));
        System.out.println(" The diagonal is " + diagonal);
    }
}

