
package eva_1_16_ejercicio_arreglo.pkg5;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA
 */
public class EVA_1_16_EJERCICIO_ARREGLO5 {

 
    public static void main(String[] args) {
        int[] arreglo5 = new int[50];
        
        for (int i = 0; i < arreglo5.length; ) 
{
      arreglo5 [i] = ((int) (Math.random()*100) + 1) ;     
        }
        for (int i = 0; i < arreglo5.length; i++) {
            if (arreglo5 [i]%2 ==0)
                System.out.println("(" + arreglo5[i] +")" + i);
            
            
            
                }
        
           
        }
    }
     

