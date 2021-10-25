package exercise2;

import java.util.Scanner;

public class Circle {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double r;
        double C;
        double A;
        
        r=input.nextDouble();

        C = 2.0*Math.PI*r;
        A = Math.PI*r*r;

        System.out.println("Circumference: " + C);
        System.out.println("Area: " + A);
    }
}    

        
        
        
  