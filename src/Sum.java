import java.util.Scanner;

public class Sum {
    int sum;

    public static void main (String [] args) {
        new Sum().ttt();
        new Sum().ttt();
    }

    public void ttt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        //int sum = 0;
        while(number != 0){
            sum = sum + number % 10;
            number= number/10;
        }

        System.out.println("The sum of the digits is:" + sum);
        scanner.close();
    }

}
