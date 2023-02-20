import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String arquivoDoPc = sc.nextLine();
        if (arquivoDoPc.contains(".mp3")) {
            System.out.println("Salvar");
        }
        else {
            System.out.println("Deletar");
        }

        sc.close();
    }
}