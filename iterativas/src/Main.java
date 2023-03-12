import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int valorUsuario = 0;
        do {
            System.out.println("Introduce un valor entero entre 1 y 10: ");
            valorUsuario = input.nextInt();
            input.nextLine();
        } while ((valorUsuario < 1)||(valorUsuario > 10));
        System.out.println("Correcto, has introducido" + valorUsuario);
    }
}