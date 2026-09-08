/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_paso_parametros;

/**
 *
 * @author TheGa
 */
public class EVA1_5_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int i = 5;
        System.out.println("valor de i = " + i);
        incrementar(i);
        System.out.println("valor de i (despues de incrementar)" + i);
        //ahora por preferencia 
        Prueba prueba = new Prueba();
        System.out.println("Valor de prueba.y = " + prueba.y);
        incrementarObj(prueba);
        System.out.println("Valor de prueba.y (despues de incrementar) = " + prueba.y);
     }
    public static void incrementar(int valor){//PASO POR VALOR (RECIBO UNA COPIA)
      valor++;  
    }
    public static void incrementarObj(Prueba objeto){
        objeto.y++;
    }
    }

class Prueba{
    int y = 5;
   
}
    

