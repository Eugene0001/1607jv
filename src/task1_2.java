/**
 * Created by Eugene on 23.06.2016.
 */
import java.util.Scanner;
public class task1_2 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, g, h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус окружности");
        a = sc.nextDouble(); // Радиус
            double Ccirc = 2*3.1415926*a;
            double Scirc = 3.1415926*Math.pow(a, 2);
        System.out.println("Длина окружности = " +Ccirc);
        System.out.println("площадь окружности = " +Scirc);
        System.out.println("Введите R окружности");
        b = sc.nextDouble(); // R
        System.out.println("Введите r окружности");
        c = sc.nextDouble(); // r
            double So = 3.1415926*(Math.pow(b, 2)-Math.pow(c, 2));
        System.out.println("площадь кольца =" +So);
        System.out.println("Введите сторону треугольника А");
        d = sc.nextDouble();
        System.out.println(d);
        System.out.println("Введите сторону треугольника B");
        e = sc.nextDouble();
        System.out.println(d);
        System.out.println("Введите сторону треугольника C");
        f = sc.nextDouble();
        System.out.println(d);
            double Ptri = (d+e+f);
            double Stri = Math.sqrt((Ptri-d)*(Ptri-e)*(Ptri-f));
        System.out.println("Периметр треугольника =" +Ptri);
        System.out.println("Площадь треугольника =" +Stri);
        System.out.println("Введите сторону прямоугольника А");
        g = sc.nextDouble();
        System.out.println("Введите сторону прямоугольника B");
        h = sc.nextDouble();
            double Ppr = 2*(g+h);
            double Spr = g*h;
        System.out.println("Периметр прямоугольника =" +Ppr);
        System.out.println("Площадь прямоугольника =" +Spr);

    }
}
