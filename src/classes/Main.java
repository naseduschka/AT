package classes;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Input the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        Area area = new Area();

        area.setDim(length,breadth);
        System.out.println(area.getArea());



//        Rectangle rectangle1 = new Rectangle(4,5);
//        Rectangle rectangle2 = new Rectangle(5,8);
//
//        System.out.println(rectangle1.getArea() + " " + rectangle2.getArea() );



//        Triangle triangle = new Triangle();
//        System.out.println(triangle.getPerimeter() + " " + triangle.getArea());

//        final Student masha = new Student(1,"Masha");
//        final Student ivan = new Student(2,"Ivan");
//        System.out.println(Student.STUDENT_INT + " " + ivan.STUDENT_INT + "");
//
//        ivan.setAddress(new Address(null, null, null));
//
//        masha.STUDENT_INT = 100;

//        masha.setAddress(new Address("New York", "abc", 5));
//        System.out.println(masha.getId() + "" + masha.getName() + " " + masha.getAddress().fullAddress());


//        ivan.setAddress(new Address("Voronezh", "abc", 5));
//        System.out.println(ivan.getId() + "" + ivan.getName() + " " + ivan.getAddress().fullAddress());
//
//
//
//        System.out.println(ivan.getId() + "" + ivan.getName());
//        System.out.println(masha.getId() + "" + masha.getName());
//
//        System.out.println("")
//        final String addressStr = Address.getstaticFullAddress(ivan.getAddress());
//        System.out.println();

//        ivan.setId(5);
//        ivan = new Student(4, ""); //нельзя в случае с final


    }
}
