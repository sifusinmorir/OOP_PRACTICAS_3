/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_CAPTURAR_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor de valor (numero entro):");
                valor = input.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("El valor es erroneo, no se puede convertir a numero");
                System.out.print("\n");
            }
        }while(true);
        System.out.println("El valor es capturado: " + valor);
    }
    
}
