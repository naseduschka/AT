package classes;

public class Area {
    private int length;
    private int breadth;


    public void setDim(int l, int b) {
     this.length = l;
     this.breadth = b;
    }

    public double getArea() {
        double area = length*breadth;
        return area;
    }
}
