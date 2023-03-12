import java.io.*;
import java.util.Scanner;
import java.time.temporal.ValueRange;
public class Main {
    public static void main(String[] args) {
        boolean salir=false;
        int eleccion=0;
        boolean isiono=false;
        String appName;
        String [] comando = {"sfc","/scannow"}; //Comando de comprobacion archivos windows
        Runtime cmd= Runtime.getRuntime();
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Bienvenido a el optimizador de el sistema\n");
            System.out.print("Antes de empezar con el programa\n");
            System.out.print("Assegurese de leer las instrucciones en el README.TXT\n");
            System.out.print("Para un correcto funcionamiento de el programa\n");
            System.out.print("A continuacion elija la opcion deseada\n");
            System.out.print("1.Limpieza de Archivos temporales\n");
            System.out.print("2.Comprobacion de windows\n");
            System.out.print("3.Quitar el envio de ubicacion a traves de registros\n");
            System.out.print("4.Optimizar aplicaciones de inicio\n");
            System.out.print("5.Instalar pack de aplicaciones\n");
            System.out.print("6.Salir\n");
            eleccion=input.nextInt();
            if (eleccion >= 1 && eleccion <= 6){
                switch (eleccion){
                    case 1:
                        System.out.print("Borrando Temporales....\n");
                        String userProfile = System.getProperty("user.home") + File.separator + "AppData" + File.separator + "Local" + File.separator + "Temp";
                        File f= new File(userProfile);
                        String[] s=f.list();
                        for (String s1:s ){
                            File f1= new File(f,s1);
                            f1.delete();
                            System.out.print(s1);
                        }
                        break;
                    case 2:
                        try {
                            Runtime.getRuntime().exec("cmd /c start cmd.exe /K \" sfc /scannow");
                        } catch (IOException ioe) {
                            System.out.println (ioe);
                            System.out.print("Si sale error deberias ejecutar el programa en modo administrador\n");
                        }
                        break;
                    case 3:
                        System.out.print("Estas seguro que quieres desactivar la deteccion de ubicacion en el sistema?");
                        System.out.print("IMPORTANTE:TENDRAS QUE VOLVER A CAMBIARLO MANUALMENTE");
                        System.out.print("INTRODUCE TRUE OR FALSE PARA CONFIRMAR LA EJECUCION");
                        isiono = input.nextBoolean();
                        if (!isiono){
                            try {
                                Runtime.getRuntime().exec("reg add \"HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\DeviceAccess\\Global\\{E3E3751A-B4B4-4D00-B3A9-4B2D8EABF43F}\" /v Value /t REG_DWORD /d 0 /f"); //Cambia el valor de el registro que envia infromacion de ubicacion a microsoft
                                System.out.println("Recopilación de información de ubicación desactivada");
                            } catch (Exception e) {
                                System.out.println("Error al desactivar la recopilación de información de ubicación");
                                e.printStackTrace();
                            }
                        }
                        break;
                    case 4:
                        try {
                            System.out.print("Introduce el nombre de la aplicacion con el .exe al final");
                            appName = input.nextLine();
                            input.nextLine();// Guarda el nombre de la app
                            // Ruta del archivo de inicio automático de Windows la coje automaticamente el usuario
                            String startupPath = System.getProperty("user.home") + File.separator + "AppData" + File.separator + "Roaming" + File.separator + "Microsoft" + File.separator + "Windows" + File.separator + "Start Menu" + File.separator + "Programs" + File.separator + "Startup";
                            File file = new File(startupPath + appName);
                            if (file.exists()) {
                                if (file.delete()) {
                                    System.out.println("La aplicación " + appName + " ha sido desactivada al iniciar Windows.\n");
                                } else {
                                    System.out.println("No se pudo desactivar la aplicación " + appName + " al iniciar Windows.\n");
                                }
                            } else {
                                System.out.println("La aplicación " + appName + " no se encuentra en la ruta de inicio automático.\n");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        break;

                    case 5:
                        try {
                            System.out.print("Esto instala aplicaciones esenciales al hacer instalaciones limpias");
                            String fileins = System.getProperty("user.home") + File.separator + "Documents"+File.separator+"Debloat"+File.separator+"inite.exe";
                            Runtime runTime = Runtime.getRuntime();
                            Process process = runTime.exec(fileins);
                            //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd %userprofile%/Documents/Debloat/ \" install.bat"); Comandos de prueba no utilizados
                            //Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd %homepath%/Documents/Debloat/\" start inite.exe");
                        } catch (IOException ins){
                            System.out.println (ins);
                        }
                        break;
                    case 6:
                        salir=true;
                        break;
                }

            }else{
                System.out.print("Introduzca un numero de los especificados anteriormente");
                break;
            }

        }while(!salir);



    }
}


