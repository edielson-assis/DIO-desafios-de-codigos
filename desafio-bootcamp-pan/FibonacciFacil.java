import java.util.Scanner;

public class FibonacciFacil {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int proximo, anterior = 0, atual = 1;
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println(anterior);
            } else {
                System.out.print(anterior + " ");
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
        }

        sc.close();
    }
}