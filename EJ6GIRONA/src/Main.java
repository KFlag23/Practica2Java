import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean llueve;
        boolean comportesabiertoonyar = false;
        double lluvialitros;
        boolean encenderprograma = true;
        do {
            System.out.print("Esta lloviendo?");
            llueve = input.nextBoolean();
            if (llueve == true) {
                do {
                    System.out.print("Cuanta lluvia en litros hay?");
                    lluvialitros = input.nextDouble();
                    if (lluvialitros > 89) {
                        System.out.println("Abriendo compuertas");
                        comportesabiertoonyar = true;
                    } else {
                        do {
                            System.out.print("No hace falta abrir las puertas\n");
                            System.out.print("Sigue lloviendo?");
                            llueve = input.nextBoolean();
                        } while (llueve == false);
                        {
                            System.out.print("Cuanta lluvia en litros hay?");
                            lluvialitros = input.nextDouble();
                            if (lluvialitros > 89) {
                                System.out.println("Abriendo compuertas");
                                comportesabiertoonyar = true;
                            }else {
                                System.out.print("No hace falta abrir las puertas\n");
                            }
                        }
                    }
                }while (lluvialitros > 89);{
                    System.out.println("Abriendo compuertas");
                    comportesabiertoonyar = true;
                    do {
                        System.out.print("Sigue lloviendo?");
                        llueve=input.nextBoolean();
                    }while(llueve==false);{
                        System.out.print("Dejando compuertas abiertas\n");
                    }
                }
                do {
                    System.out.print("Esta lloviendo?");
                    llueve = input.nextBoolean();
                }while(llueve==false);{
                    do {
                        System.out.print("Cuanta lluvia en litros hay?");
                        lluvialitros = input.nextDouble();
                        if (lluvialitros > 89) {
                            System.out.print("No hace falta abrir las puertas\n");
                        }
                    } while (lluvialitros > 89);{
                        System.out.println("Abriendo compuertas");
                        comportesabiertoonyar = true;
                        do {
                            System.out.print("Sigue lloviendo?");
                            llueve=input.nextBoolean();
                            System.out.print("Dejando compuertas abiertas");
                        }while(llueve==true);{

                        }
                    }
                }
            }

        }while(encenderprograma==true);
    }
}