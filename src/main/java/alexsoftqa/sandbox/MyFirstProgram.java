package alexsoftqa.sandbox;


public class MyFirstProgram {

    public static void main (String[] args) {

        Square s = new Square(5);
        System.out.println("Square area with side " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Rectangle area with sides " + r.a + " and " + r.b + " = " + r.area());
    }

}

