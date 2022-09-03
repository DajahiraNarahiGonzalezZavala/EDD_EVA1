
package eva1_13_paso_valor_ref;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_13_PASO_VALOR_REF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int valorPrueba = 100;
      System.out.println("Valor =" + valorPrueba);
      incVal (valorPrueba);
        System.out.println("Valor incrementado =" + valorPrueba);
        
        Pruebavalor prueba = new Pruebavalor ();
        prueba.x = 100;
        System.out.println("valor" + prueba.x);
        incVal (prueba);
        System.out.println("Valor incrementado objeto " + prueba.x);
        
        
    }
public static void incVal ( int valor ) {
    valor ++;
    
}   
public static void incVal (Pruebavalor pruebaVal){
    pruebaVal.x ++;
    
}
}
class Pruebavalor {
    int x;
}
