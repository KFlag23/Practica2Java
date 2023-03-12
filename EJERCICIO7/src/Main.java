import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean covid;
        double sueldobase = 1250;
        double sueldototal;
        double horasextra;
        double pagaextra = 0;
        boolean horasextraver= false;
        boolean encenderprograma = true;
        do {
            System.out.print("Tiene covid?");
            covid = input.nextBoolean();
            System.out.print("Has hecho horas extra?");
            horasextraver = input.nextBoolean();
           if (horasextraver==true){
               if (covid == true) {
                       System.out.print("Cuantas horas extra has hecho");
                       horasextra = input.nextDouble();
                       if (horasextra <= 5) {
                           pagaextra = sueldobase + (5 * 20);
                           sueldobase= pagaextra +((horasextra - 5) * 17);
                       }
                       if (horasextra > 5) {
                           pagaextra = sueldobase + (5 * 20);
                           sueldobase = pagaextra + ((horasextra - 5) * 17);
                       }
                       sueldototal = sueldobase + 250;
                       System.out.print(sueldototal);
                       System.out.print("Quieres seguir calculando?");
                       encenderprograma=input.nextBoolean();
               }else{
                       System.out.print("Cuantas horas extra has hecho");
                       horasextra = input.nextDouble();
                       if (horasextra>5){
                           pagaextra = sueldobase + (horasextra*15);
                       }if (horasextra<5){
                           pagaextra = sueldobase + ((horasextra-5)*12);
                       }
                       sueldototal= pagaextra;
                       System.out.print(sueldototal);
                       System.out.print("Quieres seguir calculando?");
                       encenderprograma=input.nextBoolean();
                   }
               } else {
               if (covid==true){
                   sueldototal= sueldobase + 250;
                   System.out.print(sueldototal);
                   encenderprograma = input.nextBoolean();
               }else {
                   System.out.print(sueldobase);
                   System.out.print("Quieres seguir calculando?");
                   encenderprograma = input.nextBoolean();
               }
           }

        }while(encenderprograma==true);
    }
}