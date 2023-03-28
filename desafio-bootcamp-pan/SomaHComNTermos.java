import java.util.Scanner;

public class SomaHComNTermos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        
        double h = 0;
        for (int i = 1; i <= n; i++) {
            h += 1 / (double) i;
        }

        System.out.println(String.format("%.0f", h));

        sc.close();
    }
}