/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;
import cronometro.logica.Cronometro;
import cronometro.logica.UniidadTiempo;
/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cronometro c= new Cronometro();
        for (int i = 0; i < 1000; i++) {
            c.avanzar();
            System.out.println(c.obtenerTiempo());
            if (i%100==0)
        }
                
    }
    
}
