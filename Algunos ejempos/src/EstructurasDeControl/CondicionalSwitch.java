/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstructurasDeControl;

public class CondicionalSwitch {
    public static void main(String args[]) {
        int caso = 1;
        
        //condicion
        switch(caso) {
            
            case 1:
                System.out.println("Elegiste la opción 1");
            break;
            
            case 2:
                System.out.println("Elegiste la opción 2");
            break;
            
            //no es completamente necesario
            default:
                System.out.println("Elegiste la opción 3");
            break;
        }           
    }
}
