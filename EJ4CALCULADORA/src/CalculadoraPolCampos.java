import java.util.Objects;
import java.util.Scanner;
public class CalculadoraPolCampos {
    public static void main(String[] args) {
        boolean salir = false;
        char operador;
        Scanner myObj = new Scanner(System.in);
        double numbero1, numbero2 , numbero3;
        double resultado;
        double resultado33; //resultado para la operacion con resultado
        String decision;
        do {
            System.out.println("Bienvenido a la calculadora");
            System.out.print("Selecciona una operacion escribiendo el operador(Suma,resta,division,multiplicacion etc..) o S para salir");
            operador = myObj.next().charAt(0);
            switch (operador) {
                case '+':
                    System.out.println("Introduce el primer numero");
                    numbero1 = myObj.nextDouble();
                    System.out.println("Introduce el segundo numero");
                    numbero2 = myObj.nextDouble();
                    resultado = numbero1 + numbero2;
                    System.out.println(numbero1 + " + " + numbero2 + " = " + resultado);
                    System.out.print("Quieres sumar el resultado anterior?");
                    decision=myObj.next();
                    if (Objects.equals(decision, "si")){
                        System.out.print("introduce otro numero nuevo");
                        numbero3 = myObj.nextDouble();
                        resultado33=resultado+numbero3;
                        System.out.print(resultado33);

                    }else {break;}
                    break;

                case '-':
                    System.out.println("Introduce el primer numero");
                    numbero1 = myObj.nextDouble();
                    System.out.println("Introduce el segundo numero");
                    numbero2 = myObj.nextDouble();
                    resultado = numbero1 - numbero2;
                    System.out.println(numbero1 + " - " + numbero2 + " = " + resultado);
                    System.out.print("Quieres restar el resultado anterior?");
                    decision=myObj.next();
                    if (Objects.equals(decision, "si")){
                        System.out.print("introduce otro numero nuevo");
                        numbero3 = myObj.nextDouble();
                        resultado33=resultado-numbero3;
                        System.out.print(resultado33);

                    }else {break;}
                    break;

                case '*':
                    System.out.println("Introduce el primer numero");
                    numbero1 = myObj.nextDouble();
                    System.out.println("Introduce el segundo numero");
                    numbero2 = myObj.nextDouble();
                    resultado = numbero1 * numbero2;
                    System.out.println(numbero1 + " * " + numbero2 + " = " + resultado);
                    System.out.print("Quieres multiplicar el resultado anterior?");
                    decision=myObj.next();
                    if (Objects.equals(decision, "si")){
                        System.out.print("introduce otro numero nuevo");
                        numbero3 = myObj.nextDouble();
                        resultado33=resultado*numbero3;
                        System.out.print(resultado33);

                    }else {break;}
                    break;

                case '/':
                    System.out.println("Introduce el primer numero");
                    numbero1 = myObj.nextDouble();
                    System.out.println("Introduce el segundo numero");
                    numbero2 = myObj.nextDouble();
                    resultado = numbero1 / numbero2;
                    System.out.println(numbero1 + " / " + numbero2 + " = " + resultado);
                    System.out.print("Quieres dividir el resultado anterior?");
                    decision=myObj.next();
                    if (Objects.equals(decision, "si")){
                        System.out.print("introduce otro numero nuevo");
                        numbero3 = myObj.nextDouble();
                        resultado33=resultado/numbero3;
                        System.out.print(resultado33);

                    }else {break;}
                    break;
                case 'S':
                    salir = true;
                    break;
                default:
                    System.out.println("Operador Invalido!");
                    break;
            }
        } while (operador != 'S');
    }

}

