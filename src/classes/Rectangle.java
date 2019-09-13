package classes;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int l, int b) {
    this.length = l;
      this.breadth = b;
    }

    public double getArea(){
        double area = length*breadth;
        return area;
    }


}
