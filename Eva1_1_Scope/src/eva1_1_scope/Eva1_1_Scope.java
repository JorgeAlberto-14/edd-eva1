/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;


public class Eva1_1_Scope {

    
    public static void main(String[] args) {
        int x = 100;//existe dentro del main
        for ( int i = 0; i < 10; i++){ //existe dentro de el for
        System.out.print("i = "+ 1);
        x++;//VISIBLE 
    }
    
    System.out.print("valor final de la i = " + i);//YA NO EXISTE
    System.out.print("valor final de la i = " + x);//TODAVIA EXISTE
    
}
    public static void OtraFuncion(){
        System.out.print("valor de x " + x);//NO EXISTE
    

