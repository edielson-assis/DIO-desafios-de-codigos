import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int mesada = 50;

        int total = entrada * mesada;

        System.out.println(total);

        sc.close();
    }
}