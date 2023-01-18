import java.util.Locale;
import java.util.Scanner;

public class ex013 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int x,y;
            System.out.println("DIGITE DOIS NUMEROS: ");
            x = sc.nextInt();
            y = sc.nextInt();

            while (x != y){
                if(x<y){
                    System.out.println("Crescente!");
                } else {
                    System.out.println("Decrescente!");
                }
                System.out.println("Digite outros dois numeros: ");
                x = sc.nextInt();
                y = sc.nextInt();
            }
        }
    }
}
