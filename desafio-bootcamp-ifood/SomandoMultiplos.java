import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = 0;
        for (int i = a;i <= b; i++) {
            if (i % a == 0 || i % b == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
        
        sc.close();
    }
}