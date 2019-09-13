import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int first = scanner.nextInt();

        System.out.print("Input second integer: ");
        int second = scanner.nextInt();

        System.out.print("Input third integer: ");
        int third = scanner.nextInt();

        System.out.print("The middle number is ");
        if ((first >= second) && (first <= third)
                || (first <= second) && (first >= third)) {
            System.out.println(first);
        } else if ((second >= first) && (second <= third) || (second <= first) && (second >= third)) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}
