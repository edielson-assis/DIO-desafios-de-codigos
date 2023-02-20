import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        int x = sc.nextInt();
        System.out.println(buscarElemento(elementos, x));

        sc.close();
    }

    static String buscarElemento(int[] elementos, int elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == elemento) {
                return "Achei " + elemento + " na posicao " + i;
            }
        }
        return "Numero " + elemento + " nao encontrado!";
    }
}