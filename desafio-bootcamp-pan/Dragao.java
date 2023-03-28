import java.util.Scanner;

public class Dragao {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        for(int i = 0; i < casos; i++){
            int poderDeLuta = sc.nextInt();

            if(poderDeLuta > 8000){
                System.out.println("Mais de 8000!");
            } 
            else {
                System.out.println("Inseto!");
            }
        }

        sc.close();
    }
}