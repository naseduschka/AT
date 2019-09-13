package methods;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;

    }

  public Rectangle(int c) {
       this(c,c);
    }


    int getPerimetr() {
        return (a+b)*2;
    }

    int getArea() {
        return a*b;
    }

    String getType() {
//        return (a==b) ? "square" : "rectangle";
        if(a==b) {
            return "square";
        }
        return "rectangle";
//        else {
//            return "rectangle";
//        }
    }


    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle(5, 10);
        final Rectangle square = new Rectangle(5);

        System.out.println(rectangle.getType());
        System.out.println(square.getType());

//        System.out.println("perimetr= " + rectangle.getPerimetr() + ", area = " + rectangle.getArea());

    }


}
