import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        //Pol Campos
        boolean salir=false;
        int eleccion= 0;
        do {
        Scanner input = new Scanner(System.in);
        double farenheit=0;
        double celsius=0;
        double TemperaturaF = 0;
        double TemperaturaC = 0;
        System.out.print("Bienvenido al conversor de temperatura\n");
        System.out.print("1 Para converit de Celsius a fahreinheit\n");
        System.out.print("2 Para converir de fahreinheit a celsius\n");
            eleccion= input.nextInt();
        if (eleccion >= 1 && eleccion <= 3){
                switch (eleccion){
                    case 1:
                        System.out.print("Introduce los Celsius\n");
                        celsius=input.nextDouble();
                        Farenheittoc(celsius);
                        break;
                    case 2:
                        System.out.print("Introduce los Fahreinheit\n");
                        farenheit=input.nextDouble();
                        celsiustof(farenheit);
                        break;
                    case 3:
                        salir=true;
                        break;
                }
            }else{
                System.out.print("Introduce un numero de los indicados anteriormente");
        }
        }while(!salir);
    }

    public static void celsiustof(double farenheit){
            double TemperaturaC = (5.0 /9) * (farenheit - 32);
            System.out.print(TemperaturaC);
    }

    public static void Farenheittoc(double celsius){
        double TemperaturaF;
        TemperaturaF = (9.0 /5)*celsius+32;
        System.out.print(TemperaturaF);
    }
}

