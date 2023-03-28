import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c, soma;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            soma = a + b + c;
            System.out.println("Perimetro = " + soma);
        }
        else {
            soma = (a + b) * c / 2;
            System.out.println("Area = " + soma);
        }

        sc.close();
    }
}