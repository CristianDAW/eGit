/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navidad_ejer06;

import java.util.Scanner;
public class numero {
   private int num;    
   private boolean leenum;
    public numero() {
    
    }
    
    public int escribeNum() {
    Scanner teclado = new Scanner(System.in);
    
    if (teclado.hasNextInt()) {
    num=teclado.nextInt();
    leenum=true;
        } else {
    leenum=false;
        }
    return num;
    }
   
    public int getNum() {
    return num;
    }
    
    public int restoNum() {
    int resto;
    resto=num%2;
    return resto;
    }
    public boolean getLeenum() {
    return leenum;
    }
    
}
