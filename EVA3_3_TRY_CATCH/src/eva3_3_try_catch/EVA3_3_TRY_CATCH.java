/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PROGRAMA INICIA");
        int x = 5, y = 0;
        try{
            //ES UNA SECCION DEL CODIGO QUE POTENCIALMENTE 
            //GENERA UNA EXCEPCION
        int resu = x / y;
        System.out.println("Resultado: " + resu);
        }catch(ArithmeticException e){
            //se genera un objeto Excepcion llanmado e
            //de tipo ArithmeticException
            System.out.println("Se produce un error: "+e.getMessage());
            
        }
        System.out.println("PROGRAMA TERMINA");
    }
    
}
