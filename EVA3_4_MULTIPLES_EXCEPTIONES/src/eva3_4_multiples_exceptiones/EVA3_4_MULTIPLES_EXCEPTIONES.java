/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_multiples_exceptiones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_MULTIPLES_EXCEPTIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        do{
        try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor de x (numero entro):");
                x = input.nextInt();       
                System.out.println("Introduce el valor de y (numero entro):");
                y = input.nextInt();
                int resu = x / y;
                System.out.println("Resultado de " + x + "/" + y + ": "+resu);   
                break;
            }catch(InputMismatchException e){
                System.out.println("Captura de formato incorrecto, no se puede convertir en un numero");
                System.out.print("\n");
            }catch(ArithmeticException e){
                System.out.println("No se puede dividir entre cero");
                System.out.print("\n");
            }
        }while(true);
        System.out.println("Programa terminado exitosamente");
        
        
    }
    
}
