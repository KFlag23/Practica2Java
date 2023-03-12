import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

public class CamposPol_Exercici2 {

    public static void main(String[] args) {
        final float PRECIO_CUPON = 10f;
        Scanner input = new Scanner(System.in);
        int numboletos;
        System.out.print("Introduce cuantos boletos quieres maximo son 3");
        numboletos=input.nextInt();
        int MI_NUMERO;
        float saldo = 10*numboletos;
        int numeroSorteo;
        int contadorApuestas = 0;

        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        DecimalFormat formatoLoteria = new DecimalFormat("00000");

        Random random = new Random();

        for (int i=0;i<=numboletos-1;i++){
            numeroSorteo= (int)(Math.random()*(99999));
            System.out.println("Número del sorteo = " + formatoLoteria.format(numeroSorteo));
            MI_NUMERO = (int)(Math.random()*(99999));
            saldo -= PRECIO_CUPON;

            if(MI_NUMERO == numeroSorteo) {
                System.out.println("Acierto de 200.000€ ");
                saldo += 200000;
            } else {

                if(MI_NUMERO == numeroSorteo - 1 || (MI_NUMERO == 99999 && numeroSorteo == 0)) {
                    System.out.println("Acierto de 200.000€ ");
                    saldo += 200.000;
                } else {
                    if(MI_NUMERO == numeroSorteo + 1 || (MI_NUMERO == 0 && numeroSorteo == 99999)) {
                        System.out.println("Acierto de 200.000€ ");
                        saldo += 200000;
                    } else {
                        if(MI_NUMERO % 10000 == numeroSorteo % 10000) {
                            System.out.print("Acierto de 200.000€ ");
                            saldo += 200000;
                        } else {
                            if(MI_NUMERO % 1000 == numeroSorteo % 1000) {
                                System.out.print("Acierto de 200.000€ ");
                                saldo += 200000;
                            } else {
                                if(MI_NUMERO % 100 == numeroSorteo % 100) {
                                    System.out.print("Acierto de 200.000€ ");
                                    saldo += 200000;
                                } else {
                                    if(MI_NUMERO % 10 == numeroSorteo % 10) {
                                        System.out.print("Acierto de 200.000€ ");
                                        saldo += 200000;
                                    } else {
                                        if(MI_NUMERO / 10000 == numeroSorteo / 10000) {
                                            System.out.print("Acierto de 200.000€ ");
                                            saldo += 200000;
                                        } else {
                                            System.out.print("NO ha sido premiado: ");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Saldo = " + formatoMoneda.format(saldo));
            System.out.println();

            contadorApuestas++;
        }
        System.out.println("Num. apuestas = " + contadorApuestas);
    }

}