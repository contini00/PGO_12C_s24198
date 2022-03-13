package g12c.cw1.zd2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(),
                b = scanner.nextInt(),
                c = scanner.nextInt();


        if(a>b && a>c) {

            int tmp = c;
            c = a;
            a = tmp;
        }
        if(b>a && b>c){
            int tmp = c;
            c = b;
            b = c;
        }
        if(a>b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a + " " + b + " " +c);
    }
}
