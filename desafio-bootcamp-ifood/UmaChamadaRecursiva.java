import java.util.Scanner;

public class UmaChamadaRecursiva {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            somatorio(n);
        }
        System.out.println(somatorio(n));
        
        sc.close();
    }

    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } 
        else {
            return numero + somatorio(numero - 1);
        }
    }
}