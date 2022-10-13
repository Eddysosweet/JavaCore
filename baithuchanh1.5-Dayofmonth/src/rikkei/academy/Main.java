package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap thang muon kiem tra :");
        int m = sc.nextInt();
        switch (m) {
            case 2:
                System.out.printf("Thang %d co 28 hoac 29 ngay", m);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Thang %d co 31 ngay", m);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Thang %d co 30 ngay", m);
                break;
            default :
                System.out.println("Thang ban nhap khong dung");
        }

    }
}