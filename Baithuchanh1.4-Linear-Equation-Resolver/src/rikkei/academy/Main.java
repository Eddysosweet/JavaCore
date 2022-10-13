package rikkei.academy;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            double a,b,c;
            Scanner sc= new Scanner(System.in);
            System.out.println(" a + b = c ");
            System.out.println("Enter a :");
            a = sc.nextDouble();
            System.out.println("Enter b :");
            b = sc.nextDouble();
            System.out.println("Enter c :");
            c = sc.nextDouble();
            if(a != 0){
                double x = (c-b)/a;
                System.out.println("Equatin pass with x = "+x);
            }else {
                if(b == c){
                    System.out.println("The solution is All x");
                }else {
                    System.out.println("No solution");
                }
            }
        }
}