import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int custoFabrica = sc.nextInt();
        int porcentagemDistribuidor = sc.nextInt();
        int percentualImpostos = sc.nextInt();

        int distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int valorImpostos = (custoFabrica * percentualImpostos) / 100;
        int custoConsumidor = distribuidor + valorImpostos + custoFabrica;

        System.out.println(custoConsumidor);

        sc.close();
    }
}