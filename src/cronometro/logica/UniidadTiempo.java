/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro.logica;

/**
 *
 * @author Estudiantes
 */
public class UniidadTiempo {
    private int tope;
    private int valor;

    public UniidadTiempo(int tope) {
        this.tope = tope;
        this.valor=0;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String obtenerValorFormateado(){
        if (this.valor<10)
            return "0" + this.valor;
        else
            return String.valueOf(this.valor);
    }
    public void avanzar (){
        valor++;
        if (valor ==tope){
            valor = 0;
        }
    }
}
