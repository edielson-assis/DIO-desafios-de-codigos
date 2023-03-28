import java.util.Scanner;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int morangos = sc.nextInt();
        int macas = sc.nextInt();

        System.out.println(totalPagar(morangos, macas));

        sc.close();
    }

    static double totalPagar(int morango, int maca) {
        double total, totalMorango, totalMaca;        
        if (morango <= 5) {
            totalMorango = morango * 2.50;
        }
        else  {
            totalMorango = morango * 2.20;
        }

        if (maca <= 5) {
            totalMaca = maca * 1.80;
        }
        else {
            totalMaca = maca * 1.50;
        }

        total = totalMaca + totalMorango;

        if (total > 25 || morango + maca > 8) {
            total -= total * 0.1;
        }

        return total;
    }
}