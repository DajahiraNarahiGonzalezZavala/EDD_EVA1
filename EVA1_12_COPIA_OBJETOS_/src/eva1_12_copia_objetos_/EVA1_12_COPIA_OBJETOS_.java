/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_copia_objetos_;

/**
 *
 * @author DAJAHIRA NARAHI GONZALEZ ZAVALA 21550340
 */
public class EVA1_12_COPIA_OBJETOS_ {

    
    public static void main(String[] args) {
int valor,copiaValor;
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor  = " + valor);
        System.out.println("Copia = " + copiaValor);
        valor++;
        System.out.println("Valor = " + valor);
        System.out.println("Copia =" +  copiaValor);
        
   
        
   Pruebavalor prueba = new Pruebavalor();
         prueba.x = 1000;
         Pruebavalor pruebaCopia = new Pruebavalor ();
         pruebaCopia = prueba;
         
System.out.println( "Ahora con objetos");
System.out.println("Prueba " + prueba.x);
System.out.println("Prueba Copia " + pruebaCopia.x);

prueba.x++;
System.out.println( "Prueba" + prueba.x);
System.out.println( " Prueba copi a" + pruebaCopia.x);

         
    }
    
}
