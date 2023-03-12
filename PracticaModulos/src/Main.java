import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int monedas= 0;
        Main main = new Main();
        main.init(monedas); // invocacion de menu recursivo
    }
    private static int llegirInt(String missatge, int min, int max) { // Comprobar que sea un numero y no se introduzcan numeros no enteros
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do {
            System.out.println(missatge);
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        return x;
    }
    public int init(int monedas) {// menu recursivo en metodo
        Scanner input = new Scanner(System.in);
        String MENU_PRINCIPAL = Bienvenidatexto();
        boolean salir = false;
        int opcio = 0;
        do {
            opcio = llegirInt(MENU_PRINCIPAL, 1, 4);
            switch (opcio) {
                case 1:
                    monedas=ruleta(monedas);
                    salir = true;
                    break;
                case 2:
                    monedas=blackjack(monedas);
                    salir = true;
                    break;
                case 3:
                    monedas=slots(monedas);
                    salir = true;
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);
        return monedas;
    }
    public int ruleta(int monedas) {
        Scanner leer = new Scanner(System.in);
        int[] rule = new int[37];
        int numero = 0;
        boolean eleccion = false;
        int menu1 = 0;
        int mitades = 0;
        int dinero = 25000;
        int docenas = 0;
        int apuesta = 0;
        int resultado = 0;
        int menu2 = 0;
        int fifty = (int) (Math.random() * 1 + 1);
        boolean normas = false;
        int color = 0;
        int colorRN = (int) (Math.random() * 100);
        boolean apuestamas = false;
        int suerte = (int) (Math.random() * 36);
        System.out.print("Tienes:"+monedas);
        System.out.print("\nQuieres añadir mas Dinero? 1 si 2 no");
        int money=seguir(1,2);
        if (money == 1){
            System.out.print("Introduce la cantidad de Dinero que añadiras\n");
            monedas= leer.nextInt();
            dinero=monedas;
        }else{
            dinero=monedas;
        }
        for (int i = 0; i < rule.length; i++) {
            rule[i] = i;
        }
        System.out.println("\nBienvenido a la rule\n¿Sabes como funciona?\nResponde con TRUE (SI), FALSE (NO)");
        normas = leer.nextBoolean();
        if (normas == false) {
            System.out.println("La ruleta tiene 37 casillas que albergan los números del 0 al 36, cada uno de ellos alternativamente\nrojo o negro, excepto el número 0 que es de color verde. El objetivo de los jugadores es adivinar el \nnúmero en el que va a caer la bola cuando la ruleta pare de girar.");
        }
        do {
            System.out.println("¿En que apostamos guapo?\n1-Número\n2-Grupo\n3-Salir|\nDinero restante " + dinero + "€");
            menu1 = leer.nextInt();
            if (menu1 >= 1 && menu1 <= 2) {
                switch (menu1) {
                    case 1:
                        menu1 = 1;
                        do {
                            System.out.println("Elije número para apostar");
                            System.out.println(Arrays.toString(rule));
                            numero = leer.nextInt();
                            if (numero > 36) {
                                System.out.println("¿Eres tonto?");
                            }
                        } while (numero > 36);
                        do {
                            System.out.println("¿Cuanto le metemos?  Saldo " + dinero);
                            apuesta = leer.nextInt();
                            if (apuesta > dinero) {
                                System.out.println("Que esta pelao, elije otra cantidad");
                            }
                        } while (apuesta > dinero);
                        System.out.println("La bola ha caido en:" + suerte);
                        if (numero == suerte) {
                            resultado = apuesta * 35;
                            System.out.println("Felicidades has ganado" + resultado + "€");
                        } else {
                            resultado = (apuesta * (-1));
                            System.out.println("Que pringado jajaja, lo tuyo no es la rule chaval" + resultado + "€");
                        }
                        dinero = dinero + resultado;
                        break;
                    case 2:
                        menu1 = 2;
                        do {
                            System.out.println("Elije grupo al que apostar\n1-Color\n2-Mitades\n3-docenas\n4-Cardinalidad");
                            menu2 = leer.nextInt();
                            if (menu2 >= 1 && menu1 <= 4) {
                                switch (menu2) {
                                    case 1:
                                        menu2 = 1;
                                        do {
                                            System.out.println("¿Que color?\n1-Rojo\n2-Negro\n3-Verde");
                                            color = leer.nextInt();
                                            if (color >= 1 && color <= 3) {
                                                do {
                                                    System.out.println("¿Cuanto le metemos?  Saldo " + dinero);
                                                    apuesta = leer.nextInt();
                                                    if (apuesta > dinero) {
                                                        System.out.println("Que esta pelao, elije otra cantidad");
                                                    }
                                                } while (apuesta > dinero);
                                                switch (color) {
                                                    case 1:
                                                        color = 1;
                                                        System.out.println("...");
                                                        if (colorRN >= 51) {
                                                            resultado = apuesta * 2;
                                                            System.out.println("Felicidades ha caido en rojo " + (resultado) + "€");
                                                        } else {
                                                            resultado = apuesta * -1;
                                                            System.out.println("Nooooooo ha caido en negro " + (resultado) + "€");
                                                        }
                                                        dinero = dinero + apuesta;
                                                        break;
                                                    case 2:
                                                        color = 2;
                                                        System.out.println("...");
                                                        if (colorRN >= 51) {
                                                            resultado = apuesta * 2;
                                                            System.out.println("Felicidades ha caido en negro " + (resultado) + "€");
                                                        } else {
                                                            resultado = apuesta * -1;
                                                            System.out.println("Nooooooo ha caido en rojo " + (resultado) + "€");
                                                        }
                                                        dinero = dinero + apuesta;
                                                        break;
                                                    case 3:
                                                        color = 3;
                                                        System.out.println("...");
                                                        if (colorRN <= 3) {
                                                            resultado = apuesta * 35;
                                                            System.out.println("Felicidades ha caido en verde " + (resultado) + "€");
                                                        } else {
                                                            resultado = apuesta * -1;
                                                            System.out.println("Nooooooo ha caido en rojo " + (resultado) + "€");
                                                        }
                                                        dinero = dinero + resultado;
                                                        break;
                                                }
                                            } else {
                                                System.out.println("Elije otra cosa");
                                            }
                                        } while (color > 3);
                                        break;
                                    case 2:
                                        menu2 = 2;
                                        do {
                                            System.out.println("¿A que mitad aspostamos?\n1-Primera mitad(1/18)\n2-Segunda mitad(19/36)");
                                            mitades = leer.nextInt();
                                            do {
                                                System.out.println("¿Cuanto le metemos?  Saldo " + dinero);
                                                apuesta = leer.nextInt();
                                                if (apuesta > dinero) {
                                                    System.out.println("Que esta pelao, elije otra cantidad");
                                                }
                                            } while (apuesta > dinero);
                                            if (mitades == 1) {
                                                if (colorRN <= 23) {
                                                    resultado = apuesta * 2;
                                                    System.out.println("Felicidades ha caido en " + suerte + " " + (resultado) + "€");
                                                } else {
                                                    resultado = apuesta * -1;
                                                    System.out.println("Nooooooo ha caido en " + suerte + " " + (resultado) + "€");
                                                }
                                            } else if (mitades == 2) {
                                                if (suerte >= 24) {
                                                    resultado = apuesta * 2;
                                                    System.out.println("Felicidades ha caido en " + suerte + " " + (resultado) + "€");
                                                } else {
                                                    resultado = apuesta * -1;
                                                    System.out.println("Nooooooo ha caido en " + suerte + " " + (resultado) + "€");
                                                }
                                            }
                                            dinero = dinero + resultado;
                                        } while (mitades > 2);
                                        break;
                                    case 3:
                                        menu2 = 3;
                                        do {
                                            System.out.println("¿A que docena aspostamos?\n1-Primera docena(1/12)\n2-Segunda docena(13/24)\n3-Tercera docena(25/37)");
                                            docenas = leer.nextInt();
                                            if (docenas >= 1 && docenas <= 3) {
                                                do {
                                                    System.out.println("¿Cuanto le metemos?  Saldo " + dinero + "€");
                                                    apuesta = leer.nextInt();
                                                    if (apuesta > dinero) {
                                                        System.out.println("Que esta pelao, elije otra cantidad");
                                                    }
                                                } while (apuesta > dinero);
                                                switch (docenas) {
                                                    case 1:
                                                        docenas = 1;
                                                        if (suerte <= 12) {
                                                            resultado = apuesta * 3;
                                                            System.out.println("Felicidades ha caido en " + suerte + "   +" + resultado + "€");
                                                        } else {
                                                            resultado = apuesta * -1;
                                                            System.out.println("Nooooooo ha caido en negro " + suerte + "   +" + resultado + "€");
                                                        }
                                                        dinero = dinero + apuesta;
                                                        break;
                                                    case 2:
                                                        docenas = 2;
                                                        if (suerte >= 13 && suerte <= 24) {
                                                            resultado = apuesta * 3;
                                                            System.out.println("Felicidades ha caido en " + suerte + "   +" + resultado + "€");
                                                        } else {
                                                            resultado = apuesta * -1;
                                                            System.out.println("Nooooooo ha caido en en " + suerte + "   +" + resultado + "€");
                                                        }
                                                        dinero = dinero + apuesta;
                                                        break;
                                                    case 3:
                                                        docenas = 3;
                                                        if (suerte > 24) {
                                                            resultado = apuesta * 3;
                                                            System.out.println("Felicidades ha caido en " + suerte + "   +" + resultado + "€");
                                                        } else {
                                                            resultado = apuesta * -1;
                                                            System.out.println("Nooooooo ha caido en " + suerte + "   +" + resultado + "€");
                                                        }
                                                        dinero = dinero + resultado;
                                                        break;
                                                }
                                            } else {
                                                System.out.println("Elije otra cosa");
                                            }
                                        } while (docenas > 3);
                                        break;
                                    case 4:
                                        menu2 = 4;
                                        do {
                                            System.out.println("¿A que aspostamos?\n1-Par)\n2-Impar");
                                            mitades = leer.nextInt();
                                            do {
                                                System.out.println("¿Cuanto le metemos?  Saldo " + dinero);
                                                apuesta = leer.nextInt();
                                                if (apuesta > dinero) {
                                                    System.out.println("Que esta pelao, elije otra cantidad");
                                                }
                                            } while (apuesta > dinero);
                                            if (mitades == 1) {
                                                if (colorRN <= 49) {
                                                    resultado = apuesta * 2;
                                                    System.out.println("Felicidades ha caido en par " + (resultado) + "€");
                                                } else {
                                                    resultado = apuesta * -1;
                                                    System.out.println("Nooooooo ha caido en impar " + (resultado) + "€");
                                                }
                                            } else if (mitades == 2) {
                                                if (suerte >= 24) {
                                                    resultado = apuesta * 2;
                                                    System.out.println("Felicidades ha caido en par " + (resultado) + "€");
                                                } else {
                                                    resultado = apuesta * -1;
                                                    System.out.println("Nooooooo ha caido en impar " + (resultado) + "€");
                                                }
                                            }
                                            dinero = dinero + resultado;
                                        } while (mitades > 2);
                                        break;
                                }
                            } else {
                                System.out.println("Elije otra cosa");
                            }
                        } while (menu2 > 5);
                }
            }
        } while (menu1 != 3);
        System.out.println("Hasta la proxima");
        return dinero;
    }
    public static String Bienvenidatexto() {
        System.out.print("Bienvenido al Casino MaCam\n");
        System.out.print("Tenemos los siguientes juegos:\n");
        System.out.print("1.Ruleta\n");
        System.out.print("2.BlackJack\n");
        System.out.print("3.Slots\n");
        System.out.print("4.Salir\n");
        String Blanck = "";
        return Blanck;
    }
//Aqui empieza el cóodigo del juego de Blackjack
    public static int blackjack(int monedas) {
//Declaramos las dos cartas iniciales con un Math Radom
        int carta = (int) (Math.random() * 12 + 1);
        int carta2 = (int) (Math.random() * 12 + 1);

        Scanner leer = new Scanner(System.in);
        System.out.print("Tienes:"+monedas);
        System.out.print("\nQuieres añadir mas dinero? 1 si 2 no");
        int opciones=seguir(1,2);
        if (opciones == 1){
            System.out.print("Introduce la cantidad de dinero que añadiras");
            monedas= leer.nextInt();
        }
        System.out.println("Bienvenido al juego de Blackjack\nRoba dos carta (press enter)");
        leer.nextLine();
        leer.nextLine();
        int suma = carta + carta2;
        System.out.println("Has robado la carta " + carta +quecartaes()+" y la de " + carta2 +quecartaes()+ "\nAmbas suman " + suma);
        bjcomprobarnum(suma, carta, carta2,monedas);
        return monedas;
    }
    public static int bjcomprobarnum(int suma, int carta, int carta2,int monedas) {
        if (suma > 21) {
            System.out.println("has perdido, lo siento");
            monedas=0;
            Main main = new Main();
            main.init(monedas);
        } else if (suma == 21) {
            System.out.println("HAS GANADO");
            monedas=monedas*2;
            Main main = new Main();
            main.init(monedas);
        } else {
            bjrobarcarta(suma, carta, carta2,monedas);
        }
        return monedas;
    }
    public static void bjrobarcarta(int suma, int carta, int carta2,int monedas) {
        Scanner leer = new Scanner(System.in);
        int menu = 0;
        boolean exit = false;
        do {
            int cartanueva = (int) (Math.random() * 12 + 1);
            int sumares=0;
            System.out.println("Quieres robar otra carta? 1-Si 2-No");
            menu = leer.nextInt();
            if (menu == 1) {
                suma = suma + cartanueva;
                System.out.println("Has robado el " + cartanueva + " suman " + suma);
                bjcomprobarnum(suma, carta, carta2,monedas);
            } else if (menu==2) {
                exit = true;
            }
        } while (!exit);
        bjdealer(suma,monedas);
    }
    public static int bjdealer(int suma,int monedas) {
        int dealer = (int) Math.random() * 7 + 15;
        if (suma > dealer) {
            System.out.println("Has ganado contra el dealer, felicidades, el tenia " + dealer + " puntos y tu " + suma + " puntos");
            monedas = monedas *2;
            Main main = new Main();
            main.init(monedas);
        } else if (suma < dealer) {
            System.out.println("Lo siento el dealer tenia mejor mano que tu, sus cartas sumaban " + dealer);
            monedas = 0;
            Main main = new Main();
            main.init(monedas);
        } else if (suma == dealer) {
            System.out.println("Lo siento, en caso de empate con el dealer, el dealer gana, vuestra puntuación era " + dealer);
            monedas =  0;
            Main main = new Main();
            main.init(monedas);
        }
        return monedas;
    }
    public static String quecartaes() {
        int rand = (int) (Math.random() * 4);
        String cartaN="";
        if (rand == 0) {
            cartaN = " de Picas";
        } else if (rand == 1) {
            cartaN = " de Treboles";
        } else if (rand == 2) {
            cartaN = " de Diamantes";
        } else if (rand == 3) {
            cartaN = " de Corazones";
        }
        return cartaN;
    }
    public static int slots(int monedas) {
        Scanner input=new Scanner(System.in);
        boolean jugar= true;
        System.out.print("Tienes:"+monedas);
        System.out.print("\nCada tirada cuesta 4 euros");
        System.out.print("\nQuieres añadir mas dinero? 1 si 2 no");
       int opciones=seguir(1,2);
        if (opciones == 1){
            System.out.print("Introduce la cantidad de dinero que añadiras");
            monedas= input.nextInt();
        }
        do {
            System.out.print("Tienes:"+monedas);
            if (monedas != 0){
                monedas= monedas - 4;
            }
            int numero;
            // Presentamos el programa
            System.out.print("\nBienvenid@ a la máquina tragaperras, si consigue 2 figuras iguales le devolveremos");
            System.out.println(" su dinero, si consigue las 3, habrá ganado el premio. ¡Buena suerte!.");
            System.out.println("-----------------------------------------------------------------------------");
            String figura1 = "";
            String figura2 = "";
            String figura3 = "";
            ArrayList<String> Figurass = new ArrayList<>(5);
            Figurass.add("Corazon");
            Figurass.add("Diamante");
            Figurass.add("Herradura");
            Figurass.add("Campana");
            Figurass.add("Limon");
            System.out.println();
            // Genera 3 figuras al azar
            for (int i = 1; i <= 3; i++) {
                numero = (int) (Math.random() * 5 + 0);
                if (i == 1) {
                    figura1 = Figurass.get(numero);
                } else if (i == 2) {
                    figura2 = Figurass.get(numero);
                } else if (i == 3) {
                    figura3 = Figurass.get(numero);
                }
            }
            System.out.print(figura1 + "---");
            System.out.print(figura2 + "---");
            System.out.print(figura3);
            System.out.println("\n---------------------------------------------------------------------------");
            // Muestra los resultados por pantalla según las condiciones
            if ((Objects.equals(figura1, figura2)) && (Objects.equals(figura2, figura3))) {
                System.out.print("\n¡Enhorabuena, ha ganado el premio!, aquí tiene sus 10 euros.");
                monedas= monedas+10;
                System.out.print("Quiere Seguir jugando?\n");
                System.out.print("Pulse 1 o 2 (1 si 2 no) para seguir jugando");
                int opcion= input.nextInt();
                if (opcion== 2){
                    Main main = new Main();
                    main.init(monedas);
                }else{
                    System.out.print("Tienes:"+monedas);
                    System.out.print("\nCada tirada cuesta 4 dinero");
                    System.out.print("\nQuieres añadir mas dinero? 1 si 2 no");
                    int money=seguir(1,2);
                    if (money == 1){
                        System.out.print("Introduce la cantidad de dinero que añadiras\n");
                        monedas= input.nextInt();
                    }
                    jugar = false;
                }
            } else if ((Objects.equals(figura1, figura2)) || (Objects.equals(figura1, figura3)) || (Objects.equals(figura2, figura3))) {
                System.out.println("\n¡Uy!, ha estado a punto, aquí tiene sus euros de nuevo. En la siguiente tirada tendrá más suerte.");
                monedas= monedas + 4;
                System.out.print("Quiere Seguir jugando?\n");
                System.out.print("Pulse 1 o 2 (1 si 2 no) para seguir jugando\n");
                int opcion=input.nextInt();
                if (opcion== 2){
                    Main main = new Main();
                    main.init(monedas);
                }else{
                    System.out.print("Tienes:"+monedas);
                    System.out.print("\nCada tirada cuesta 4 euros");
                    System.out.print("\nQuieres añadir mas dinero? 1 si 2 no");
                    int money=seguir(1,2);
                    if (money == 1){
                        System.out.print("Introduce la cantidad de euros que añadiras\n");
                        monedas= input.nextInt();
                    }
                    jugar = false;
                }
            } else {
                System.out.print("\nVaya... ha perdido, no se desanime, a la siguiente tendrá más suerte...");
                System.out.print("Quiere Seguir jugando?\n");
                System.out.print("Pulse 1 o 2 (1 si 2 no) para seguir jugando");
                int opcion=input.nextInt();
                if (opcion== 2){
                    Main main = new Main();
                    main.init(monedas);
                }else{
                    System.out.print("Tienes:"+monedas);
                    System.out.print("\nCada tirada cuesta 4 euros");
                    System.out.print("\nQuieres añadir mas dinero? 1 si 2 no");
                    int money=seguir(1,2);
                    if (money == 1){
                        System.out.print("Introduce la cantidad de euros que añadiras\n");
                        monedas= input.nextInt();
                    }
                    jugar = false;
                }
            }
        }while(!jugar);
        return monedas;
    }
    private static int seguir( int min, int max) { // Comprobar que sea un numero y no se introduzcan numeros no enteros
        Scanner llegir = new Scanner(System.in);
        int x = 0;
        boolean valorCorrecte = false;
        do {
            valorCorrecte = llegir.hasNextInt();
            if (!valorCorrecte) {
                System.out.println("ERROR: Valor no enter.");
                llegir.nextLine();
            } else { // Tinc un enter
                x = llegir.nextInt();
                llegir.nextLine();
                if (x < min || x > max) {
                    System.out.println("Opció no vàlida");
                    valorCorrecte = false;
                }
            }
        } while (!valorCorrecte);
        return x;
    }
}