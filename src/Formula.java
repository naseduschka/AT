import java.util.Scanner;

import static java.lang.StrictMath.sqrt;


public class Formula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of hexagon side: ");
        double r = scanner.nextDouble();
        double area = 3*sqrt(3)/2*Math.pow(r,2);
        System.out.println("The area is " + area);

    }
}
