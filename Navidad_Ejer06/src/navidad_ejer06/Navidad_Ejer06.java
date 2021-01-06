/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navidad_ejer06;

/**
 *
 * @author cristian
 */
public class Navidad_Ejer06 {
    boolean leenum;
   
    public static void main(String[] args) {
     numero prueba = new numero();
        
        
        do {
        System.out.print("Escriba un numero (0 para salir): ");
        prueba.escribeNum();
        if(prueba.getLeenum()==true) {
        
            
            
        if (prueba.getNum()>0 && prueba.restoNum()==1) {
            System.out.println("El numero que ha introducido es positivo e impar");
            } else if (prueba.getNum()>0 && prueba.restoNum()==0) {
            System.out.println("El numero que ha introducido es positivo y par");
            } else if (prueba.getNum()<0 && prueba.restoNum()==0) {
            System.out.println("El numero que ha introducido es negativo y par");    
            } else if (prueba.getNum()!=0) {
            System.out.println("El numero que ha introducido es negativo e impar");
                }
            }
        
        }while (prueba.getNum()!=0);
        
        System.out.println("*Fin del programa*");
    }
    
}
