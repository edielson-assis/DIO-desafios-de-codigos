import java.util.Scanner;

public class ImprimindoValoresPositivosEMedia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        double valoresPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double x = sc.nextDouble();
        	if (x > 0) {
                valoresPositivos += x;
                cont++;
            }	
        }
        
        double media = valoresPositivos / cont;

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

        sc.close();
    }
}