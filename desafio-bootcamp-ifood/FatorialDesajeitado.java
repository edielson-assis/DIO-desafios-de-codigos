import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int temp = 0;
        int resultado = 0;

        List<Integer> listaNumeros = new ArrayList<>();

        while (numero >= 3) {
            temp = numero * (numero - 1) / (numero - 2);
            numero -= 3;

            if (listaNumeros.isEmpty()) {
                listaNumeros.add(temp);
            }
            else {
                listaNumeros.add(temp * (-1)); 
            }                                

            listaNumeros.add(numero);
            numero--;
        }

        if (numero == 2) {
            temp = numero * (numero - 1);
            listaNumeros.add(temp * (-1));
        }
        else if (numero == 1) {
            listaNumeros.add(numero*(-1)); 
        }                               

        for (int n : listaNumeros) {
            resultado += n;
        }

        System.out.println(resultado);

        sc.close();
    }
}