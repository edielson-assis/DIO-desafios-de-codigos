import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String an1, an2, an3;

        an1 = sc.nextLine();
        an2 = sc.nextLine();
        an3 = sc.nextLine();

        if (an1.equalsIgnoreCase("vertebrado")) {
            if (an2.equalsIgnoreCase("ave")) {
                if (an3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                }
                else {
                    System.out.println("pomba");
                }
            }
            else {
                if (an3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                }
                else {
                    System.out.println("vaca");
                }
            }
        }
        else {
            if (an2.equalsIgnoreCase("inseto")) {
                if (an3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                }
                else {
                    System.out.println("lagarta");
                }
            }
            else {
                if (an3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
                else {
                    System.out.println("sanguessuga");
                }
            }
        }

        sc.close();
    }
}