import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();

        for (int i = 0; i < tamanho; i++) {
            char barra = '/';
            System.out.print(barra);
        }

        sc.close();
    }
}