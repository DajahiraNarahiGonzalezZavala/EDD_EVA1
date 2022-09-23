
package javaapplication5;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_22_FIBONACCI {

    public static void main(String[] args) {
     practica objFIBO  = new practica();
    System.out.println("La sucesion fibonacci de 7");
    objFIBO.FibonacciRecur(7);
    }
    public int  FibonacciRecur (int n){
        if (n==0||n==2){
            return 1;
            
        }else {
            return FibonacciRecur (n-1) + FibonacciRecur (n-2);
                    
                   
        }
            
    }
}
