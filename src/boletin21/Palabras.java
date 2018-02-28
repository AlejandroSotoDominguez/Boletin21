
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Palabras {
    private int numeroPalabras;
    ArrayList<String> lista = new ArrayList(numeroPalabras);
    private File fich;
    private PrintWriter escribir;
    
    public void guardar(){
        numeroPalabras = Integer.parseInt(JOptionPane.showInputDialog("Número de palabras"));
        lista.clear();
        for(int i=0;i<numeroPalabras;i++){
            lista.add(JOptionPane.showInputDialog("Escribe una palabra"));
            System.out.print(lista.get(i)+" "); 
        }
        System.out.println("\n");
    }
    
    public void ordenar(){
        Collections.sort(lista);
        for(int i=0;i<lista.size();i++){
            System.out.print(lista.get(i)+" ");
        }
        System.out.println("\n");
    }
    
    public void escribirFichero(){
        fich = new File("palabras.txt");
        try {
            escribir = new PrintWriter(fich);
            
            for(int i=0;i<lista.size();i++){
                lista.get(i);
                escribir.println(i+1+" "+lista.get(i)+" ");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
        }
        escribir.close();
    }
}
