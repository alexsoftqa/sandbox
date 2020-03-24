package alexsoftqa.sandbox;

public class Rectangle {
    public double a;
    public double b;

    //Constructor
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }
}
