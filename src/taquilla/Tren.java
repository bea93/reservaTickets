/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taquilla;
/**
 *
 * @author Bea
 */
public class Tren {
    String [][] tren = new String[10][4];
    
    public void crearTren() {
        for (int i = 0; i < tren.length ; i++) {
            for (int j = 0; j < tren[i].length; j++) {
                tren[i][j] = "L";
            }
        }
    }
    
    public String[][] mostrarTren(){
        for (int i = 0; i < tren.length ; i++) {
            for (int j = 0; j < tren[i].length; j++) {
                System.out.print(tren[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        return tren;
    }
    
    public int asientoLibre(){
        int i;
        
        for (i = 0; i < tren.length ; i++) {
            for (int j = 0; j < tren[i].length; j++) {
                if (tren[i][j].equals("L")) {
                    tren[i][j] = "O";
                    return i;
                }
            }
        }
        
        return i;
    }
    
    public boolean asientoADemanda(int fila, int columna){
        boolean libre = false;
    
        if(tren[fila][columna].equals("L") ){
            libre = true;
            tren[fila][columna] = "O";
        }    
        
        
        return libre;
    }
}
