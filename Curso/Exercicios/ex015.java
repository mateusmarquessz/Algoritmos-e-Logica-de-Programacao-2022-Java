import java.util.Locale;
import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int i, n;
            double soma,media;
            System.out.println("Quantos numeros voce vai digitar?");
            n = sc.nextInt();
            double[] vet = new double[n];
            for(i = 0; i < n; i++){
                System.out.println("Digite um numero : ");
                vet[0] = sc.nextDouble();
            }

            soma = 0;
            for (i=0; i<n; i++) {
                soma = soma + vet[i];
            }

            media = soma / n;

            System.out.print("VALORES = ");

            for ( i=0; i<n; i++) {
            	System.out.printf("%.1f  ", vet[i]);
            }

            System.out.printf("\nSOMA = %.2f\n", soma);
            System.out.printf("MEDIA = %.2f\n", media);

            sc.close();
        }
    }
}
