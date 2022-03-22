package g12c.cw1.zd7;

import java.util.Random;
import java.util.Scanner;

public class Zadanie7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz liczbę nieparzystą większą niż 5: ");

        int n = scan.nextInt();
        if (n < 5) {
            while (n < 5 || n % 2 != 0) {
                System.out.print("Wpisz liczbę nieparzystą większą niż 5: ");
                n = scan.nextInt();
            }
        } else if (n % 2 == 0) {
            while (n % 2 == 0) {
                System.out.print("Wpisz liczbę nieparzystą większą niż 5: ");
                n = scan.nextInt();
            }
        }
        scan.close();

        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                if (i == 0 || i == n-1) {
                    System.out.print("*");
                }
                if(i==((n+1))/2){
                    System.out.print("*");
                } else if(y%2!=1 && y<2){
                    System.out.print(" ");
                }else if(y%2!=1 && y>2){
                    System.out.print("*");
                }else if (y==2){
                    System.out.print("*");
                }else System.out.print("*");
            }
            System.out.println();

        }
    }
}
