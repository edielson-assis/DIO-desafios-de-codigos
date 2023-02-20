import java.util.Arrays;
import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String[] args) {

        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(menorNumeroQuadrados(n));
    }

    static int menorNumeroQuadrados(int n) {
        int[] menorNumero = new int[n+1];
        Arrays.fill(menorNumero, Integer.MAX_VALUE);
        menorNumero[0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j*j <= i; j++) {
                menorNumero[i] = Math.min(menorNumero[i], menorNumero[i-j*j] + 1);
            }
        }
        
        return menorNumero[n];
    }
}