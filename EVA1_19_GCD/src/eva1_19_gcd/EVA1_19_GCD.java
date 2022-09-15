
package eva1_19_gcd;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_19_GCD {

    public static void main(String[] args) {
        System.out.println(god(240, 80));    }
    public static int god (int a ,int b){
int residuo ;
residuo = a % b;

if (residuo == 0) {
    return  b;
}else {
    god (b,residuo);
    
    
    return residuo;
}
        

        
    }

    
   

}
