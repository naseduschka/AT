package methods;

public class OverloadingExample {

        private int a;
        private String s;

         public OverloadingExample() {
            this(15, "default str");
//             s = "default str";
//             a = 15;
            // new OverloadingExample("default str", 15) = this()

        }

        public OverloadingExample(String s) {
            this (5,s);
//             this.s = s;
//             a =10;
        }

        public OverloadingExample(int a, String s) {
             this.a=a;
             this.s = s;
        }

    public static void main(String[] args) {
        print(new OverloadingExample(5, "str"));
        print(new OverloadingExample(5, "str"));
    }

    private  static void print(OverloadingExample o) {
        System.out.println(o.a + "");







//
//
//        final String str = "string";
//        print("string");
//        print(5);
//        print(new Character("a"));
//        print(new OverloadingExample());
//
//
//        boolean isIntegerObject = integer instanceof Number;
//        System.out.println(isIntegerObject);
//
//    }
//
//    private static void print(String str) {
//        System.out.println("Print string: " + str);
//
//    }
//
////    private static void print(Integer integer) {
////        System.out.println("Print integer: " + integer);
////
////    }
//
//    private static void print(Object integer) {
//        System.out.println("Print integer: " + integer);

    }


}
