/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taquilla;

import java.util.Scanner;

/**
 *
 * @author Bea
 */
public class Taquilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcionMenu, fila, columna;
        Tren renfe = new Tren();

        renfe.crearTren();
        
        do {
            System.out.println("1. Mostrar asientos");
            System.out.println("2. Comprar billete disponible");
            System.out.println("3. Comprar billete al gusto");
            System.out.println("0. SALIR");
            System.out.print("Introduzca opción: ");
            opcionMenu = teclado.nextInt();
            teclado.nextLine();

            switch (opcionMenu) {
                case 1: 
                    renfe.mostrarTren();
                    break;
                case 2:
                    System.out.println("Su número de asiento es: " + renfe.asientoLibre());
                    renfe.mostrarTren();
                    break;
                case 3:
                    System.out.println("Introduzca número de fila: ");
                    fila = teclado.nextInt();
                    System.out.println("Introduzca número de columna: ");
                    columna = teclado.nextInt();
                    
                    if (renfe.asientoADemanda(fila, columna)) {
                        System.out.println("Asiento libre.");
                    } else {
                        System.out.println("Asiento ocupado");
                    }
                    teclado.nextLine();
                    renfe.mostrarTren();
                    break;

                case 0:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
            }
        } while (opcionMenu != 0);
    }
    
}
