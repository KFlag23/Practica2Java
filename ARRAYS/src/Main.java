import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int numalumnos;
        boolean dowhile=true;
        int Edades;
        System.out.print("Bienvenido al programa");
        System.out.print("Cuantos alumnos hay en la classe?");
        numalumnos=input.nextInt();
        int [] alumnoss= new int[numalumnos];
        for (int i=0; i<alumnoss.length;i++) {
            System.out.print("Introduce las edades de los alumnos por orden");
            Edades= input.nextInt();
            alumnoss[i]=Edades;

        }

        for (int i=0; i<alumnoss.length;i++){

        }



    }
}