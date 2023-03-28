import java.util.Scanner;

public class TaxaDeImpostoDeRenda {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double renda, imposto = 0;
        boolean isento = false;

        renda = sc.nextDouble();

        if (renda <= 2000) {
            isento = true;
        }
        else if (renda <= 3000) {
            imposto = (renda - 2000) * 0.08;
        }
        else if (renda <= 4500) {
            imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
        }
        else {
            imposto = (renda - 4500) * 0.28 + 2000 * 0.18 - 10;
        }

        if (isento) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }

        sc.close();
    }
}