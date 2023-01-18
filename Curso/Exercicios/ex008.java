import java.util.Locale;
import java.util.Scanner;

public class ex008 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int i, n;

            System.out.println("Quantos numeros voce vai digitar");
            n = sc.nextInt();
            double[] vet = new double[n]; //Declarando Vetor
            //Tem que ser antes da pergunta para dar o valor de n no vetor
            for(i=0; i<n;i++){
                System.out.println("Digite um numero:");
                vet[i] = sc.nextDouble();
            }

            for(i=0; i<n;i++){
                System.out.println(vet[i]);
            }
        }
    }
}
