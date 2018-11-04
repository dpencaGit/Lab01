import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        int a;
        int b;
        int suma;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdu a: ");
        a = input.nextInt();
        System.out.print("Introdu b: ");
        b = input.nextInt();
        System.out.println();

        suma = a+b;
        System.out.print("Suma este: " + suma);

    }
}