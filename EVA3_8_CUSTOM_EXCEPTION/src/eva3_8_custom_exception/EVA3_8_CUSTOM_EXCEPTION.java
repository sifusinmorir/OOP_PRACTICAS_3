/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_custom_exception;

/**
 *
 * @author invitado
 */
public class EVA3_8_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNomnre("Sinue");
        perso.setApellido("Mendoza");
        try{
        perso.setEdad(-4);
        }catch(DatoincorrectoCheckEx e){
            System.out.println(e.getMessage());
        }
    }
    
}

class Persona{
    private String nomnre;
    private String apellido;
    private int edad;

    public Persona(String nomnre, String apellido, int edad) throws DatoincorrectoCheckEx {
        this.nomnre = nomnre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public Persona() {
        this.nomnre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public String getNomnre() {
        return nomnre;
    }

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoincorrectoCheckEx {
        if(edad < 0)
            //throw new DatoIncorrectoException(); // UNCHEKED EXCEPTION
            throw new DatoincorrectoCheckEx(); //CHEKED EXCEPTION
        this.edad = edad;
    }
    
}

class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {
        super("Dato incorrecto!! El valor introducido no puede ser no puede ser negativo");
    }
    
}

class DatoincorrectoCheckEx extends Exception{

    public DatoincorrectoCheckEx() {
        super("Dato incorrecto!! El valor introducido no puede ser no puede ser negativo");
    }
    
}