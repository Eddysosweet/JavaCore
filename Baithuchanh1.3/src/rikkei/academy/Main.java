package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float height;
        float width ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width :");
        width = sc.nextFloat();
        System.out.println("Enter height :");
        height = sc.nextFloat();
        float area = width * height;
        System.out.println("Area = "+area);
    }
}