
package eva1_14_paso_ref;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_14_PASO_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arregloDatos = new int[100];

    }
   public static void llenar (int [] arreglo){
       for ( int i = 0; i< arreglo.length; i++){
           arreglo [i] = 100;
           
       }
   } 
  public static void imprimir (int [] arreglo) {
      for (int i = 0; i< arreglo.length; i++) {
          System.out.println("[" + arreglo [i] + "]");
      }
  }  
}
