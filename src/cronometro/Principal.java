/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import cronometro.logica.Cronometro;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    static boolean  frozen = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cronometro c = new Cronometro();
        Timer timer = new Timer();

        TimerTask task;
        task = new TimerTask() {
            @Override
            public void run() {
                if (frozen == false) {
                    c.avanzar();
                    System.out.println(c.obtenerTiempo());
                    if (c.segundos.getValor() ==10) {
                        frozen = true;
                        timer.cancel();
                    }
                }
            }
        };
        timer.schedule(task, 0, 100);
    }

}
