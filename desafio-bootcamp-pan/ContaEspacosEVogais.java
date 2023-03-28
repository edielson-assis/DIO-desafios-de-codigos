import java.util.Scanner;

public class ContaEspacosEVogais {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strSplit = str.split(" ");
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        for (String palavra : strSplit) {
            for (char letra : palavra.toCharArray()) {
                if (isVogal(letra)) {
                    quantVogais++;
                }
            }   
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);

        sc.close();
    }

    static boolean isVogal(char letra) {
        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
        for (char vogal : vogais) {
            if (Character.toLowerCase(letra) == vogal) {
                return true;
            }
        }
        return false;
    }
}