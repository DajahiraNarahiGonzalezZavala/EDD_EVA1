
package eva1_20_factorial;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_20_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(factorial (5));
    }
    public static int  factorial  (int valor ){
        
        if (valor == 0)
            return 1;
        else 
            return valor * factorial ( valor  - 1);
    }
    
}
