import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int doce = sc.nextInt();
        int total = doce * 2;
        
        System.out.println("O cliente obteve " + total + " doces");

        sc.close();
    }
}