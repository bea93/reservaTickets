package taquilla;

import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.LogManager;

/**
 *
 * @author Bea
 */
public class Taquilla {

    public static void main(String[] args) {
    	
    	Logger logger = LogManager.getLogger(Taquilla.class);
        Scanner teclado = new Scanner(System.in);

        int opcionMenu, fila, columna;
        Tren renfe = new Tren();

        renfe.crearTren();
        
        logger.info("INICIO DE LA APLICACI�N");
        
        do {
            System.out.println("1. Mostrar asientos");
            System.out.println("2. Comprar billete disponible");
            System.out.println("3. Comprar billete al gusto");
            System.out.println("0. SALIR");
            System.out.print("Introduzca opci�n: ");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();

            switch (opcionMenu) {
                case 1: 
                    renfe.mostrarTren();
                    logger.info("OPCI�N " + opcionMenu);
                    break;
                case 2:
                    System.out.println("Su n�mero de asiento es: " + renfe.asientoLibre());
                    renfe.mostrarTren();
                    logger.info("OPCI�N 2" + opcionMenu);
                    break;
                case 3:
                    System.out.println("Introduzca n�mero de fila: ");
                    fila = teclado.nextInt();
                    System.out.println("Introduzca n�mero de columna: ");
                    columna = teclado.nextInt();
                    
                    if (renfe.asientoADemanda(fila, columna)) {
                        System.out.println("Asiento libre.");
                    } else {
                        System.out.println("Asiento ocupado");
                    }
                    teclado.nextLine();
                    renfe.mostrarTren();
                    logger.info("OPCI�N 3" + opcionMenu);
                    break;

                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("OPCI�N INCORRECTA");
            }
        } while (opcionMenu != 0);
    }
    
}
