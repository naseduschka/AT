package classes;

public class Triangle {
    int a=3;
    int b=4;
    int c=5;


    public double getPerimeter() {
        double perimter = this.a+this.b+ this.c;
        return perimter;


    }
    public double getArea() {
        double pp = this.getPerimeter()/2;
        double area = Math.sqrt(pp*(pp-a)*(pp -b) * (pp-c));
        return area;
    }


}
