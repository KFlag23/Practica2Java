import java.net.SocketImpl;
import java.net.SocketTimeoutException;
import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int opcio = 0;
        String []  arry;
        boolean finish=false;
        String MENU_PRINCIPAL= "Introduzca el tamaño del array con un valor entero";
        opcio = llegirInt(MENU_PRINCIPAL, 1);
        arry = creaciondearray(opcio);
        do {
            finish=leerarray(arry);

        }while(!finish);


    }
    //Comprobacion para ver si el valor es entero
    public static int llegirInt(String missatge, int min) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }

    public static String[] creaciondearray(int opcio) {
        Scanner input= new Scanner(System.in);
        String[] array = new String[opcio];
        // Guardar valores en el array
        for (int i = 0; i < array.length; i++) {
                array[i] = String.valueOf(getRandomNumberUsingNextInt(-10,10));
            }

        return array;
    }
    public static boolean leerarray(String[] arry){
        int iguales = 0;
        System.out.print("Introduce un nuevo valor de el -10 al 10 para ver si existe\n");
        int valor=llegirarra(-10,10);
        // Leer valores del array
        for (int i = 0; i< arry.length; i++) {
            String valorr=arry[i];
            if (String.valueOf(valor).matches(valorr)) {
                iguales= iguales+1;
            }
        }
        if (iguales==0){
            System.out.print("Valor no encontrado\n");
        }else{
            System.out.print(iguales);
        }
        return true;
    }
    public static int getRandomNumberUsingNextInt(int min, int max) {// numeros aleatorios
        Random random = new Random();
        return random.nextInt((max + 1) - min) + min;
    }
    //Leer valores para la comprobacion de si son iguales
    public static int llegirarra(int min, int max) {
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do{
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte){
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            }else{ // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }
}