import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int velocidadeAtual = sc.nextInt();
        String resultado = (velocidadeAtual <= 60) ? "Nao foi multado" : "Foi multado";

        System.out.println(resultado);

        sc.close();
    }
}