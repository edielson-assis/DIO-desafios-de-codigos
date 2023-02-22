import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;

        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            n1 = sc.nextDouble();
            n2 = sc.nextDouble();
            n3 = sc.nextDouble();

            media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;

            System.out.println(String.format("%.1f", media));
        }

        sc.close();
    }
}