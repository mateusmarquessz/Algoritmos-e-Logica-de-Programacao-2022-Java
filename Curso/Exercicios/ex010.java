import java.util.Locale;
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double b, h, area, peri, diag;

        System.out.println("Base dp retangulo: ");
        b = sc.nextDouble();
        System.out.println("Altura do retangulo: ");
        h = sc.nextDouble();

        area = 0;
        area = b * h;
        peri = 2*(b + h);
        diag = Math.sqrt(Math.pow(b, 2.0) + Math.pow(h, 2.0));

        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + peri);
        System.out.println("Diagonal = " + diag);

    }
}
