package alexsoftqa.sandbox;

import org.w3c.dom.ls.LSOutput;

public class MyFirstProgram {

    public static void main (String[] args) {
        hello("World");
        hello("User");
        hello("Alex");

       double l = 5;
        System.out.println("Square area with side " + l + " = " + area(l));
    }
    public static void hello(String somebody) {
        System.out.println("Hello, Crazy " + somebody + "!!!");
    }
    public static double area (double l) {
        return  l * l;


    }


}

