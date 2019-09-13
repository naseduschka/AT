
class Odd {
    public static void main(String[] args) {
        System.out.print("Divided by 3:");
        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                System.out.print(x + ",");

            }
        }

        System.out.println();
        System.out.print("Divided by 5:");
        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 0) {
                System.out.print(x + ",");

            }

        }

        System.out.println();
        System.out.print("Divided by 3 & 5:");
        for (int x = 1; x <= 100; x++) {
            if (x % 5 == 0 && x%3 ==0) {
                System.out.print(x + ",");

            }

        }

    }
}
