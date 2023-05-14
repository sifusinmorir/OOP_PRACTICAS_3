/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_throw_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        do{
        try {
            // TODO code application logic here
            
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un valor positivo:");
            int valor = input.nextInt();
            Prueba obj = new Prueba();
            obj.setValor(valor);
            break;
        } catch (Exception ex) { //ES LA SUPERCLASE DE TODAS LAS EXCEPCIONES
                                 //POR LO TANTO, CAPTURA TODAS LAS EXCEPCIONES
                                 //COMPLICA DECLARAR EL TIPO DE EXCEPCIONES, Y DAR LA
                                 //SOLUCION CORRECTA
               
                System.out.println(ex.getMessage());
                }
         }while(true);
        
        //obj no existe fuera del bloque try, porque ahi 
        //fue declarado
        //System.out.println(obj.getValor());
       
    }
    
}

class Prueba{
    private int valor;

    public int getValor() {
        return valor;
    }
        //checked exception: se debe resolver 
        //en tiempo de compilaciones
        //unchecked exception: errores de lógica, del programador.
        //java no te ovliga a resolverlo
    public void setValor(int valor) throws Exception {
        if(valor < 0)
            throw new Exception("El valor " + valor + " es invalido. Debe ser igual o mayor que cero.");
        else
        this.valor = valor;
    }            
}