package alexsoftqa.sandbox;


public class MyFirstProgram {

    public static void main (String[] args) {

        Square s = new Square();
        s.l = 5;
        System.out.println("Square area with side " + s.l + " = " + area(s));

        Rectangle r = new Rectangle();
        r.a = 4;
        r.b = 6;
        System.out.println("Rectangle area with sides " + r.a + " and " + r.b + " = " + area(r));
    }

    public static double area(Square s) {
        return s.l * s.l;
    }

    public static double area(Rectangle r) {
        return r.a * r.b;
    }


}

