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
public class Memoria {
    private UniidadTiempo deci;
    private UniidadTiempo seg;
    private UniidadTiempo min;
    private UniidadTiempo horas;
            
   public Memoria(){
        deci = new UniidadTiempo(10);
        seg = new UniidadTiempo(60);
        min = new UniidadTiempo(60);
        horas = new UniidadTiempo(24);
   }

    public UniidadTiempo getDeci() {
        return deci;
    }

    public void setDeci(UniidadTiempo deci) {
        this.deci = deci;
    }

    public UniidadTiempo getSeg() {
        return seg;
    }

    public void setSeg(UniidadTiempo seg) {
        this.seg = seg;
    }

    public UniidadTiempo getMin() {
        return min;
    }

    public void setMin(UniidadTiempo min) {
        this.min = min;
    }

    public UniidadTiempo getHoras() {
        return horas;
    }

    public void setHoras(UniidadTiempo horas) {
        this.horas = horas;
    }
   
    public String obtenerTiempo(){
        return horas.obtenerValorFormateado()+":"+
                min.obtenerValorFormateado()+":"+
                 seg.obtenerValorFormateado()+":"+
                  deci.obtenerValorFormateado();
       
    }
}
