/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_arreglos_multidim;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ AVALA 21550340
 */
public class EVA1_9_ARREGLOS_MULTIDIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matrizDatos = new int [3][5];
        System.out.println( "Filas: " + matrizDatos.length);
        for (int i = 0; i < matrizDatos.length; i++) { //Primer dimension (3 filas)
            System.out.println("Columnas: "+ matrizDatos[i].length);
       for (int j = 0; j < matrizDatos[1].length; j++) { //SEGUNDA DIMENSION (5 COLUMNAS)
           matrizDatos [i][j] = 100;
           
               }
                
            }
                for (int i = 0; i < matrizDatos.length; i++) { 
                 for (int j = 0; j < matrizDatos[1].length; j++) {
                   System.out.print("(" + matrizDatos[i][j] + ")");
                } 
                 System.out.println();
                }
    }
    
}
