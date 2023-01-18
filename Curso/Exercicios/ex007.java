import java.util.Locale;

public class ex007 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int num;

        System.out.println("Imprimir os numeros de 1 ate 50:");
        for(num = 1; num<=50; num++){
            System.out.println(num);
        }
        
    }
}
