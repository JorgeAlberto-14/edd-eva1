/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8_arreglos_objetos;

/**
 *
 * @author TheGa
 */
public class EVA1_8_ARREGLOS_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo[] arreglo = null; 
        //System.out.println("Arreglo = " + arreglo);
        arreglo = new Ejemplo[2];
        System.out.println("Arreglo = " + arreglo);
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        arreglo[0] = new Ejemplo();
        arreglo[1] = new Ejemplo();
        System.out.println("arreglo[0] = " + arreglo[0]);
        System.out.println("arreglo[1] = " + arreglo[1]);
        
        System.out.println("arreglo[0].i = " + arreglo[0].i);
        System.out.println("arreglo[1].i = " + arreglo[1].i); 
    }
    
}
class Ejemplo{
    int i = 5;
}
