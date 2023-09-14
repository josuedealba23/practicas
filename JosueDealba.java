/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuedealba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class JosueDealba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dinero = new Scanner (System.in);
        System.out.println("dime la cantidad en pesos");
        double cantidad = dinero.nextInt();
        dinero. close();
        double convdo11=(double)(cantidad*17.13);
        double conveur = (double) (cantidad*18.27);
        System.out.println("De pesos a dolares es:"+convdo11 +"De pesos a euros es:"+conveur);
    }
    
}
