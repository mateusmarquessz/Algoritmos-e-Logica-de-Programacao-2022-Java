import java.util.Locale;
import java.util.Scanner;

public class ex009 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, j, m, n;

        System.out.println("Quantas linhas vai ter a matriz?");
        m = sc.nextInt();
        System.out.println("Quantas colunas vai ter a matriz? ");
        n = sc.nextInt();

        int[][] mat = new int [m][n]; //Declarando Matrizes

        for(i = 0; i<m ; i++){
            for(j = 0; j<n ; j++){
                System.out.println("Elemento[" + i + "," + j +"]: ");
                mat [i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("MATRIZ DIGITADA: ");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.println(mat[i][j] + " ");
            }
        System.out.println();
    }
    sc.close();
    }
}
