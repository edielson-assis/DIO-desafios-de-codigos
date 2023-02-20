import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        multiplo(n);

        sc.close();
    }

    static void multiplo(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (numero % 3 == 0) {
            System.out.println("Fizz");
        }
        else if (numero % 5 == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(numero);
        }
    }
}