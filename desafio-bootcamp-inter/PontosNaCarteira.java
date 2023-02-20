import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int velocidade = sc.nextInt();
        int multas = sc.nextInt();

        if (velocidade > 80 && multas >= 2) {
            multas++; 
            System.out.println(multas + " multas. Levou pontos na carteira");
        }
        else {
            if (velocidade > 80) {
                multas++;
            }            
            System.out.println(multas + " multas. Nao levou pontos na carteira");
        }

        sc.close();
    }
}