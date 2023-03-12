import java.util.Scanner;
public class CamposPol_Exercici1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double TempF = 0;
        double TempC = 0;
        double Kilom = 0;
        double Milles= 0;
        int opcion = 0;
        boolean aplicacionenc = false;
        do{
            System.out.print("Selecciona una opcion:\n");
            System.out.print("1.Convertir temperatura Fahrenheit a Celsius\n");
            System.out.print("2.Convertir de milles a kilometres\n");
            System.out.print("3.Salir de la aplicacion\n");
            opcion=input.nextInt();
            switch(opcion){
                case 1:
                    System.out.print("Introduce la temperatura en Fahrenheit\n");
                    TempF=input.nextDouble();
                    TempC=(9/5*TempF)+32;
                    System.out.println("La Temperatura es:"+TempC);
                    break;

                case 2:
                    System.out.print("Introduce la distancia en milles\n");
                    Milles= input.nextDouble();
                    Kilom=Milles*1.6;
                    System.out.println("Estos son los kilometros:"+Kilom);
                    break;
                case 3:
                    aplicacionenc=true;
                    break;
            }
        }while(aplicacionenc==false);

    }
}