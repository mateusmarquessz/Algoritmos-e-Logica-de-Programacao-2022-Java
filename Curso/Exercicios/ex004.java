import java.util.Locale;

public class ex004{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        //Saida de dados
        System.out.println("Bom Dia!");// Mostrar na tela com quebra de linha
        System.out.println("Boa Noite!");
        
        int x, y;
        x = 20;
        y = 30;
        System.out.println(x); // printando valores da variaveis x e y
        System.out.println(y);

        double z;
        z = 2.3456;
        System.out.println(String.format("%.2f", z)); //Mostrando na tela o valor de double, com duas casas decimais.

        int idade; // Inteiro
        double salario; // nao inteiro
        char genero; // palavas
        String nome; // palavras compostas

        //Definindo Valores na variaveis
        idade = 30; 
        salario = 5800.5;
        genero = 'F';
        nome = "Maria Silva";
        //Mostrando na tela as Variaveis, sysout = System.out.println;
       System.out.println("A funcionaria " + nome + ", sexo " + genero + ", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos ");
    }
}