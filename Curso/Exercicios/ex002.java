import java.util.Locale;

public class ex002 { // todo atividade java existe uma class
    public static void main(String[] args){ 
        // tudo oq eu for fazer tem que ser dentro dessa funcao

        //Variaveis em Java
        Locale.setDefault(Locale.US);
        int idade; // Inteiro
        double salario, altura; // nao inteiro
        char genero; // palavas
        String nome; // palavras compostas

        //Definindo Valores na variaveis
        idade = 30; 
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria Silva";
        //Mostrando na tela as Variaveis, sysout = System.out.println;
        System.out.println("IDADE = " + idade );
        System.out.println("SALARIO = " +  salario);
        System.out.println("ALTURA = " +  altura);
        System.out.println("GENERO = "+ genero);
        System.out.println("NOME = " + nome);
    }
}