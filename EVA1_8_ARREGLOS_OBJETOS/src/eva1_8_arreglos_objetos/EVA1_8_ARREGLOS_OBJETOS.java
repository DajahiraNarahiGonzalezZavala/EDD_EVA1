/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_arreglos_objetos;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba[] arregloPrueba = new Prueba [20];
        
        //Crear los objetos 
        //Leer x
        for (int i = 0; i < arregloPrueba.length; i++) {
            arregloPrueba[i] = new Prueba ();
            System.out.println("Valor de x es:" + arregloPrueba[i].x);
            
        }
    }
    
}
class Prueba {
    int x = 100;
}