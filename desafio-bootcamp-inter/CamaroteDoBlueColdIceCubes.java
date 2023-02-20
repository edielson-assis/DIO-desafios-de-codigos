import java.util.Scanner;

public class CamaroteDoBlueColdIceCubes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tamanhoDaFila = sc.nextInt();

        int pessoasNoCamarote = 0;
        for (int i = 0; i <= tamanhoDaFila; i++) {
            if (i % 2 == 1) {
                pessoasNoCamarote++;
            }
        }

        System.out.println(pessoasNoCamarote + " pessoas no camarote");
        
        sc.close();
    }
}