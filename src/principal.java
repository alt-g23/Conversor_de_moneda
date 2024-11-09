import Conversores.api;

import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {

    private static final int CONVERT_USD_TO_ARS = 1;
    private static final int CONVERT_ARS_TO_USD = 2;
    private static final int CONVERT_COP_TO_ARS = 3;
    private static final int CONVERT_USD_TO_COP = 4;
    private static final int CONVERT_BRL_TO_USD = 5;
    private static final int CONVERT_USD_TO_BRL = 6;
    private static final int EXIT = 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double cantidad;
        api conversor = new api();

        do {
            mostrarMenu();
            try {
                opcion = scanner.nextInt();

                if (opcion != EXIT) {
                    System.out.print("Ingrese la cantidad a convertir: ");
                    cantidad = scanner.nextDouble();
                    conversor.setCantidad(cantidad);

                    switch (opcion) {
                        case CONVERT_USD_TO_ARS:
                            conversor.setBase("USD");
                            conversor.setDestino("ARS");
                            break;
                        case CONVERT_ARS_TO_USD:
                            conversor.setBase("ARS");
                            conversor.setDestino("USD");
                            break;
                        case CONVERT_COP_TO_ARS:
                            conversor.setBase("COP");
                            conversor.setDestino("ARS");
                            break;
                        case CONVERT_USD_TO_COP:
                            conversor.setBase("USD");
                            conversor.setDestino("COP");
                            break;
                        case CONVERT_BRL_TO_USD:
                            conversor.setBase("BRL");
                            conversor.setDestino("USD");
                            break;
                        case CONVERT_USD_TO_BRL:
                            conversor.setBase("USD");
                            conversor.setDestino("BRL");
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }


                    conversor.sendRequest();


                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next();
            }

        } while (opcion != EXIT);

        System.out.println("¡Gracias por usar el conversor de monedas!");
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n=== BIENVENIDO AL CONVERSOR DE MONEDAS ===");
        System.out.println("1. Convertir desde USD (Dólar estadounidense) a ARS (Peso argentino)");
        System.out.println("2. Convertir desde ARS (Peso argentino) a USD (Dólar estadounidense)");
        System.out.println("3. Convertir desde COP (Peso colombiano) a ARS (Peso argentino)");
        System.out.println("4. Convertir desde USD (Dólar estadounidense) a COP (Peso colombiano)");
        System.out.println("5. Convertir desde BRL (Real brasileño) a USD (Dólar estadounidense)");
        System.out.println("6. Convertir desde USD (Dólar estadounidense) a BRL (Real brasileño)");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
