
package eva1_21_recursividad;

/**
 *
 * @author  DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_21_RECURSIVIDAD {

    public static void main(String[] args) {
        System.out.println("Main "   +   A ());
    }
    
    public static String A() {
        return "A "   +  B ();
    }
    public static String B () {
       return  " B "   +  C (); 
    }
    public static String C (){
        return "C";
    }
}
