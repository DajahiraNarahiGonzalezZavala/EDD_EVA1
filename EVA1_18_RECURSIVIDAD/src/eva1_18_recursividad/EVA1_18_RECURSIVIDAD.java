
package eva1_18_recursividad;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_18_RECURSIVIDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        falsoForDes(5);

    }
    public static void falsoForDes (int valor){
     System.out.println(valor +" - ");
        if (valor > 1)
            falsoForDes(  valor -1 );
        }
    public static void falsoForAsc (int valor, int ini ){
   if (ini <= valor)
            System.out.println( ini + " -");
        falsoForAsc(valor, ini + 1);
            
        }
    }
    

