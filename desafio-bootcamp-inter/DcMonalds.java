import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String ingredientes = sc.next();
        String[] listaIngredientes = ingredientes.split(";");

        String pao1 = listaIngredientes[0];
        String ingrediente1 = listaIngredientes[1];
        String ingrediente2 = listaIngredientes[2];
        String pao2 = listaIngredientes[3];

        System.out.println(pao1 + "\n" + ingrediente1 + "\n" + ingrediente2 + "\n" + pao2);

        sc.close();
    }
}