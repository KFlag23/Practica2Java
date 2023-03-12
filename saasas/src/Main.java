import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static String[] clientDNIs = new String[100];
    private static String[] clientNames = new String[100];
    private static String[] vehiclePlates = new String[100];
    private static String[] vehicleModels = new String[100];
    private static String[] vehicleOwners = new String[100];
    private static String[] mechanicIDs = new String[100];
    private static String[] mechanicNames = new String[100];
    private static String[] mechanicStatus = new String[100];

    public static void main(String[] args) {
        int clientsCount = 0;
        int vehiclesCount = 0;
        int mechanicsCount = 0;

        while (true) {
            System.out.println("1. Alta client");
            System.out.println("2. Alta vehicle");
            System.out.println("3. Alta mecanic");
            System.out.println("4. Sortir");
            System.out.print("Tria una opció: ");
            int option = scan.nextInt();

            if (option == 1) {
                String dni, name;
                do {
                    System.out.print("Introdueix el DNI: ");
                    dni = scan.next();
                } while (!validateDNI(dni) || existsClientDNI(dni, clientsCount));
                do {
                    System.out.print("Introdueix el nom: ");
                    name = scan.next();
                } while (!validateName(name));

                clientDNIs[clientsCount] = dni;
                clientNames[clientsCount] = name;
                clientsCount++;
            } else if (option == 2) {
                if (clientsCount == 0) {
                    System.out.println("No hi ha clients registrats. Vols registrar un client? (S/N)");
                    char c = scan.next().charAt(0);
                    if (c == 'S' || c == 's') {
                        addClient();
                    }
                } else {
                    String plate, model, owner;
                    do {
                        System.out.print("Introdueix la matricula: ");
                        plate = scan.next();
                    } while (!validatePlate(plate) || existsVehiclePlate(plate, vehiclesCount));
                    do {
                        System.out.print("Introdueix
