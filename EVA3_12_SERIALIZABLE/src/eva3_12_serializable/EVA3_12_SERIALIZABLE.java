/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_12_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //GUARDAR EL OBJETO EN ARCHIVO
            String ruta = "C:\\sifu\\archivosObjetos.txt";
            Persona perso = new Persona("Borrador","R2D2",1);
            guardarObj(perso, ruta);        
            //LEER EL OBJETO DESDE UN ARCHIVO
            Persona resu = leerObj(ruta);
            System.out.println("Nombre: " + resu.getNombre());
            System.out.println("Nombre: " + resu.getApellido());
            System.out.println("Nombre: " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_12_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void guardarObj(Persona perso, String ruta) throws IOException{
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream =
        new ObjectOutputStream(foStream);
        ooStream.writeObject(perso);
        ooStream.close();
    }
    public static Persona leerObj(String ruta) throws IOException, ClassNotFoundException{
        Persona perso = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStram = new ObjectInputStream(fiStream);
        perso = (Persona)oiStram.readObject();
        return perso;
    }
}

class Persona implements Serializable{
    private String nombre;
    private String Apellido;
    private int edad;
    public Persona() {
        this.nombre = "";
        this.Apellido = "";
        this.edad = 0;
    }

    public Persona(String nombre, String Apellido, int edad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

}
