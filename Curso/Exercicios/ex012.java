import java.util.Locale;
import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int x,y,z;
                System.out.println("Primeiro valor : ");
                x = sc.nextInt();
                System.out.println("Segundo valor : ");
                y = sc.nextInt();
                System.out.println("Terceiro valor : ");
                z = sc.nextInt();

                if(x<y && x<z){
                    System.out.println(x);
                } else if (y<x && y<z){
                    System.out.println(y);
                } else {
                    System.out.println("Menor = " + z);
                }
        }
    }
}
