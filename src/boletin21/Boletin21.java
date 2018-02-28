
package boletin21;

import javax.swing.JOptionPane;

public class Boletin21 {

    public static void main(String[] args) {
        Palabras palabra = new Palabras();
        int opcion = 0;
        
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Leer lista de palabras\n"
                + "2. Ordenar palabras\n"
                + "3. Escribir fichero\n"));
        
            switch(opcion){
                case 1:
                    palabra.guardar();
                    break;
                case 2:
                    palabra.ordenar();
                    break;
                case 3:
                    palabra.escribirFichero();
                    break;
                case 0:
                    System.exit(opcion);
            }
        }while(opcion<3);
    }
    
}
