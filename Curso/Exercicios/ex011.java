import java.util.Locale;
import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            String nome1, nome2;
            int idade1, idade2;
            double media;
            
            System.out.println("Dados da primeira pessoa:");
            System.out.println("Nome: ");
            nome1 = sc.nextLine();
            System.out.println("Idade");
            idade1 = sc.nextInt();
            System.out.println("Dados da Segunda pessoa:");
            System.out.println("Nome : ");
            sc.nextLine(); 
            nome2 = sc.nextLine();
            System.out.println("Idade: ");
            idade2 = sc.nextInt();
            media = (idade1 + idade2) / 2;
            System.out.println("A idade media de " + nome1 + " e " + nome2 + " eh de " + media + " anos " );
        }
    }
}
