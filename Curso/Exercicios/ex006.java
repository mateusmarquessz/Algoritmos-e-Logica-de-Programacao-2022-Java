import java.util.Locale;
import java.util.Scanner; // Biblioteca para importar Dados

public class ex006 {
    // Para ler dados, voce precisa declarar uma variavel
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario1,salario2;
        String nome1, nome2;
        int idade;
        char sexo;

        System.out.println("Nome da Primeira pessoa: ");
        nome1 = sc.nextLine(); // leitura de Dados de String
        System.out.println("Salario da primeira pessoa: ");
        salario1 = sc.nextDouble(); // Leitura de Dados de double

        System.out.println("Nome da Segunda Pessoa: ");
        sc.nextLine(); //Limpeza de Buffer
        nome2=sc.nextLine();
        System.out.println("Salario da segunda pessoa: ");
        salario2 = sc.nextDouble();

        System.out.println("Digite uma idade");
        idade = sc.nextInt();//Leitura de Dados de inteiros

        System.out.println("Digite um sexo (F/M)");
        sexo = sc.next().charAt(0);// Leitura de Dados de Char

        System.out.println("Nome 1: " + nome1);
        System.out.println("Salario 1: "+ salario1);
        System.out.println("Nome 2: "+ nome2);
        System.out.println("Salario 2:" + salario2);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        sc.close(); // Desalocar os recursos de scanner
    }
}
