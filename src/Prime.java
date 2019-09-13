public class Prime{
    public static void main(String[] args) {
        int a =1;
        int counter = 0;
        int sum = 0;
        while (counter<100) {
            if (isPrime(a)==true) {
                counter++;
                sum = sum + a;

            }
            a++;
        }

        System.out.println(sum);
    }
    private static boolean isPrime(int value) {
        for(int i =2; i<value; i++ ) {
            if (value%i ==0) {
               return false;
            }
        }
        return true;


    }
}
