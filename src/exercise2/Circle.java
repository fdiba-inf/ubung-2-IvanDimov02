package exercise2;

import java.util.Scanner;

public class Circle {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Pi;
        double r;
        double C;
        double A;
        Pi = 4.0 * (1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/11.0 - 1.0/13.0 + 1.0/17.0 - 1.0/19.0 + 1.0/23.0);
        r=input.nextDouble();

        C = 2.0* Pi * r;
        A = Pi * r * r;
        System.out.println("Circumference: "+C );
        System.out.println("Area is: "+A);
    }

}    

        
        
        
  