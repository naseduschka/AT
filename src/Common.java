import java.util.Scanner;

class Common {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        System.out.println(common_number(number1, number2));
        scanner.close();
    }
        public static boolean common_number(int a, int b) {
            if (b < 25 || a > 75)
                return false;
            int x = a %10;
            int y = b % 10;
            a = a/10;
            b = b/10;
            return (a==b ||a ==y || x==y || x==b );

        }

    }
