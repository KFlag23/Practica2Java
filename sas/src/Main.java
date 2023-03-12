import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Ingrese una cadena (ingrese 'stop' para detener): ");
        String input = sc.nextLine();

        while (!input.equals("stop")) {
            list.add(input);
            System.out.print("Ingrese una cadena (ingrese 'stop' para detener): ");
            input = sc.nextLine();
        }

        System.out.println("La lista de cadenas es: ");
        for (String str : list) {
            System.out.println(str);
        }
    }
}