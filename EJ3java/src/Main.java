import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Introduce el precio de el producto");
        double precio = myObj.nextDouble();
        myObj.nextLine();
        System.out.print("¿Esta en buen estado?");
        int value = 1;
        String estat = myObj.nextLine();
        if (estat.equalsIgnoreCase("si")){
            precio*= 1.25;
            System.out.println(precio);

        } else {
            precio*= 1.15;
            System.out.println(precio);
        }
        System.out.print("Gracias por utilizar el codigo");

        switch (value) {
            case 1 -> System.out.print("caso 1");
            case 2 -> System.out.print("caso 2");
        }
    }

}


