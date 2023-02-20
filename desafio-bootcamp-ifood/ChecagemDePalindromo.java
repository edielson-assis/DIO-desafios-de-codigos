import java.util.Scanner;

public class ChecagemDePalindromo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine(); 
        if(isPalindromo(palavra)) {
            System.out.println("TRUE");
        } 
        else {
            System.out.println("FALSE");
        }

        sc.close();
    }

    static boolean isPalindromo(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return palavra.equals(invertida);
    }
}