/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author TheGa
 */
public class EVA1_7_ARREGLOS_SIZE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] original = new int[10];
        System.out.println(original);
        for (int i = 0; i < original.length; i++) { //LLENAR CON DATOS ALEATORIOS
            original[i] = (int) (Math.random() * 100);
            
        }
        for (int i = 0; i < original.length; i++) { //IMPRIMIR
            System.out.println("[" + original[i] + "]");
        }
        System.out.println("");
        //CAMBIAR EL TAMAÑO
        //RESPALDO
        int[] copia = original;//copio la direccion del arreglo original
        original = new int[5]; //AQUI DESCONECTAMOS 
        System.out.println(original);
        //TRANSFERIR LA INFORMACION
        for (int i = 0; i < original.length; i++){
            original[i] = copia[i]; 
        }
        for (int i = 0; i < original.length; i++){
            System.out.println("[" + original[i] + "]");
        }  
    }
    
}
