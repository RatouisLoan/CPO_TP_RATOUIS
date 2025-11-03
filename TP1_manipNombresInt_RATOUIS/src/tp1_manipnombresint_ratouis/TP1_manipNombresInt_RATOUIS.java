import java.util.Scanner;

public class TP1_manipNombresInt_RATOUIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le second entier : ");
        int b = sc.nextInt();

        System.out.println("Somme        : " + (a + b));
        System.out.println("Difference   : " + (a - b));
        System.out.println("Produit      : " + (a * b));

        // Division entière et reste (euclidienne)
        System.out.println("Quotient int : " + (a / b));
        System.out.println("Reste        : " + (a % b));

        // Division exacte en double (point cours)
        System.out.println("Division réelle : " + (a / (b * 1.0)));
    }
}