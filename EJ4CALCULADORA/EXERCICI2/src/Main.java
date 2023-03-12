import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleccion=0;
        boolean salir=false;
        double zona2=1.3125;
        double zona3=1.8;
        int zonas;
        do {
            double precio=0;
            System.out.print("Bienvenido selecciona para comprar el tipo de billete\n");
            System.out.print("Selecciona el billete que quieres comprar\n");
            System.out.print("1 - Billete sencillo...2,40€\n2 - TCasual...11.35€\n3 - TUsual...40€\n4 -TFamiliar...10€\n5 - Tjove...80€\n6 - Salir\n");
            System.out.print("Introduce tu eleccion\n");
            eleccion=input.nextInt();
            System.out.print("Cuantas zonas?\n");
            zonas=input.nextInt();
            if (eleccion >= 1 && eleccion <= 6){
                switch (eleccion){
                    case 1:
                        precio=2.40;
                        Calculadora(zonas,precio);
                        break;
                    case 2:
                        precio=11.35;
                        Calculadora(zonas,precio);
                        break;
                    case 3:
                        precio=40.00;
                        Calculadora(zonas,precio);
                        break;
                    case 4:
                        precio=10.00;
                        Calculadora(zonas,precio);
                        break;
                    case 5:
                        precio=80.00;
                        Calculadora(zonas,precio);
                        break;
                    case 6:
                        salir=true;
                        break;
                }
            }else{
                System.out.print("Introduzca un numero de los especificados anteriormente\n");
                break;    }

        }while(!salir);
    }

    public static void Calculadora(int zonas,double precio){
        Scanner inputCalc = new Scanner(System.in);
        double zona2= 1.3;
        double zona3=1.8;
        double pago;
        double preciofinal;
        boolean pagos= false;
            if (zonas >= 1 && zonas <= 3) {
                switch (zonas) {
                    case 1:
                        System.out.print("Debe pagar:" + precio+"\n");
                        System.out.print("Introduzca la cantidad especificada\n");
                        pago = inputCalc.nextDouble();
                        do {
                            System.out.print("Usted a introducido" + pago+"\n");
                            if (pago >= precio) {
                                pagos = true;
                                preciofinal = precio - pago;
                                System.out.print("El cambio es:" + preciofinal+"\n");
                                System.out.print("Imprimiendo billete.......\n");
                            } else {
                                System.out.print("Introduce el dinero especificado\n");
                            }
                        } while (!pagos);
                        break;
                    case 2:
                        System.out.print("Debe pagar:" + (precio*zona2)+"\n");
                        System.out.print("Introduzca la cantidad especificada\n");
                        pago = inputCalc.nextDouble();
                        do {
                            System.out.print("Usted a introducido" + pago+"\n");
                            if (pago >= precio) {
                                pagos = true;
                                preciofinal = precio - pago;
                                System.out.print("El cambio es:" + preciofinal+"\n");
                                System.out.print("Imprimiendo billete.......\n");
                            } else {
                                System.out.print("Introduce el dinero especificado\n");
                            }
                        } while (!pagos);
                        break;
                    case 3:
                        System.out.print("Debe pagar:" + (precio*zona3)+"\n");
                        System.out.print("Introduzca la cantidad especificada\n");
                        pago = inputCalc.nextDouble();
                        do {
                            System.out.print("Usted a introducido" + pago+"\n");
                            if (pago >= precio) {
                                pagos = true;
                                preciofinal = precio - pago;
                                System.out.print("El cambio es:" + preciofinal+"\n");
                                System.out.print("Imprimiendo billete.......\n");
                            } else {
                                System.out.print("Introduce el dinero especificado\n");
                            }
                        } while (!pagos);
                        break;
                }
            }else{
                System.out.print("Introduzca una de las zonas especificadas\n");}
    }



}

