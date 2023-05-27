/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_read_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "c:\\Archivos\\SifuSinMorir.txt";
        try {
            readUsingFiles(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();//imprimir la exception
        }
    }
 
    /*
        Files --> lee todo el archivo y lo carga en
    */
    
    public static void readUsingFiles(String ruta) throws IOException{
        //recibimos la ruta en formato de texto
        //la convertimos a formato Path
        Path path = Paths.get(ruta);
        
        //readAllLines me regresa una lista de tipo String
        List<String> contenidoArch = Files.readAllLines(path);
        //System.out.println(contenidoArch.toString());
        /*for (int i = 0; i < contenidoArch.size(); i++) {
            System.out.println(contenidoArch.get(i));
        }*/
        byte[] arregloBytes = Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }

    
}
