import java.util.Scanner; 
    
public class LeituraDaGertrudes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int paginas = sc.nextInt();
        int paginasLidas = 3;

        int total = paginas / paginasLidas;
        
        System.out.println(total + " dias");

        sc.close();
    }
}