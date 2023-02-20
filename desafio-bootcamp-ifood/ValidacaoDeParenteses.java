import java.util.Scanner;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean caracter = ehValido(sc.nextLine());

        System.out.println(caracter);

        sc.close();
    }

    public static boolean ehValido(String caracter) {
        String parentese = "()";
        String cochetes = "[]";
        String chaves = "{}";
        if (caracter.equals(chaves) || caracter.equals(cochetes) || caracter.equals(parentese)) {
            return true;
        }
        return false;
    }
}