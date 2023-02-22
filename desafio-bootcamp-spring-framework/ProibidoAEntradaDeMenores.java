import java.util.Scanner;

public class ProibidoAEntradaDeMenores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            idade[i] = sc.nextInt();
        }

        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < n; i++) {
            if (idade[i] < 18) {
                System.out.println(idade[i]);
            }
        }

        sc.close();
    }
}