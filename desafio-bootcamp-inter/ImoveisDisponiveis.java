import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase = sc.next();
        String[] array = frase.split("/");

        String imovel = array[0];
        int preco = Integer.parseInt(array[1]);
        String disponibilidade = array[2];

        System.out.println("Imovel: " + imovel + " R$" + preco + " " + disponibilidade);

        sc.close();
    }
}