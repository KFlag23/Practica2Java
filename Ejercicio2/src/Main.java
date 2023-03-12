import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcio = 0;
        String MENU_PRINCIPAL="Introduce una opcion";
        do {
            opcio = llegirInt(MENU_PRINCIPAL, 1, 5);
            menu(opcio);
        }while(true);
    }
    //modulo que comprueba si es entero
    private static int llegirInt(String missatge, int min, int max) {
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
                if (x < min || x > max){
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        }while(!valorCorrecte);

        return x;
    }
    public static void menu (int opcio){
        do {
                switch (opcio){
                    case 1:
                        break;

                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Opció no vàlida");
                }

        }while(true);

    }
}