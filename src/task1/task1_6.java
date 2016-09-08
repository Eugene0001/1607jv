package task1;

import java.util.Scanner;

/**
 * Created by Eugene on 01.07.2016.
 */
public class task1_6{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double p = 3.14;
            System.out.println("Объем целиндра");
            System.out.println("Введите H");
            int a = sc.nextInt();
            System.out.println("Введите r");
            int b = sc.nextInt();
            System.out.println("Объем целиндра =" + (2 * p * a * b) + (2 * p * Math.pow(b, 2)));
            System.out.println("Sбок =" + 2*p*b*a);
            System.out.println ("Введите R полого целиндра");
            int c = sc.nextInt ();
            System.out.println("Объем полого целиндра =" + p*a*( Math.pow(b, 2) - Math.pow (c, 2) ));

        }
}

