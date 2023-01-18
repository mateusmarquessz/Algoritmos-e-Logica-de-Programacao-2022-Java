import java.util.Locale;

public class ex002 { // todo atividade java existe uma class
    public static void main(String[] args){ 
        // tudo oq eu for fazer tem que ser dentro dessa funcao
        Locale.setDefault(Locale.US);
        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria Silva";

        System.out.println("IDADE = " + idade );
        System.out.println("SALARIO = " + salario);
        System.out.println("ALTURA = " + altura);
        System.out.println("GENERO = "+ genero);
        System.out.println("NOME = " + nome);
    }
}