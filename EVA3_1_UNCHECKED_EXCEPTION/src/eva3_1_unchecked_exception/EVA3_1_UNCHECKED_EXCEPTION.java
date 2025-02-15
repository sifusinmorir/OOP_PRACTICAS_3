/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_unchecked_exception;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_1_UNCHECKED_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*  // TODO code application logic here
        //ARITMETIC EXCEPTION: DIVISION ENTRE 0
        System.out.println("INICIO DE PROGRAMA");
        System.out.println("DECLARACION DE VARIABLES");
        int x = 4, y = 0;
        System.out.println("INTENTAR DIVISION");
        int resu = x / y; //AQUUI SE GENERA LA EXCEPTION 
                            //SI NO SE ATIENDE, EL PROGRAMA TERMINA
        System.out.println("FIN DE PROGRAMA");        
        
        //INTERACTUAR CON EL USUARIO
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE NUMERO");
        int nume = input.nextInt();//si el usuario captura una cadan
                                    //que no puede convertirce a numero
                                    //se produce la excepcion y en programa termina
        System.out.println("El numero es: "+nume);    
        
        //ARRAYINDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5];//arreglo con 5 pociciones
        arreglo[0] = 50;//no se 
        arreglo[2] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600; //<----? 5 no es un idice valido,
                                // el arreglo va de 0 a 4
        
        
        //NULLPOINTER EXCEPTION
     
        Prueba ObjPrueba = null; //el objeto no exste,  es nulo
        System.out.println("Valor x = " + ObjPrueba.x);*/
        System.out.println("hola mundo");   
    }
}

class Prueba{
    int x = 100;
}