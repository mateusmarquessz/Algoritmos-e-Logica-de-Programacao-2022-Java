public class ex005 {
    
    public static void main(String[] args){
        //Processamento de Dados / Casting em Java
        //Operacao basica em Java
         int x, y;
         x = 5;
         y = 2 * x;
         System.out.println(x);
        System.out.println(y);
        //operacao com double
        int a;
        double b;
        a = 5;
        b = 2 * a;
        System.out.println(a);
        System.out.println(String.format("%.1f", b));
        //Calculando a Area
        double b1, b2, h, area;
        b1 = 6.0;
        b2 = 8.0;
        h = 5.0;
        area = (b1 + b2) / 2.0 * h;
        System.out.println(area);

        int c, d, resultado;
        c = 5;
        d = 2;
        resultado = c / d;
        System.out.println(resultado);

        double z;
        int v;
        z = 5.0;
        v = (int) z; // Transformando de um double para inteiro
        System.out.println(v);
    }
}
