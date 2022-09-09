
package eva1_17_ejercicio3;

/**
 *
 * @author moviles
 */
public class EVA1_17_EJERCICIO3 {


    public static void main(String[] args) {
        int[][]  matrizDatos =  new int [5] [5];
        for (int i = 0; i < matrizDatos.length; i++) {
            for (int j = 0; j < matrizDatos [i].length; j++) {
                matrizDatos [i][j] = ((int)(Math.random()*100))+1;
                
            }
            imprimirMatriz(matrizDatos);
        }
                
            
            
        
    }
    public static void imprimirMatriz (int [][]matriz ) {
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz[i].length; j++) {
                 System.out.println("(" + matriz [i][j]+ ")");
             }
             System.out.println("");
        }
    }
}
