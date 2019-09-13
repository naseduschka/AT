import java.util.Scanner;

public class Reverse {


    public static void main(String[] args) {
        new Reverse().reversenumber();

    }

    public void reversenumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        int reverse = 0;
        while (number != 0) {

            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;

        }
        System.out.println("Reverse number " + reverse);
        scanner.close();
    }
}
