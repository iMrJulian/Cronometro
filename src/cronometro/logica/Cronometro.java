/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro.logica;

import java.util.Iterator;

/**
 *
 * @author Estudiantes
 */
public class Cronometro {
    private UniidadTiempo deci;
    private UniidadTiempo seg;
    private UniidadTiempo min;
    private UniidadTiempo horas;
     
   private  ArrayLIst<Memoria> memorias;
    
    public Cronometro (){
        deci = new UniidadTiempo(10);
        seg = new UniidadTiempo(60);
        min = new UniidadTiempo(60);
        horas = new UniidadTiempo(24);
        memorias = new Memoria(10);
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
        
    public void avanzar(){
        deci.avanzar();
        if(deci.getValor()==0){
            seg.avanzar();
            if(seg.getValor()==0){
                min.avanzar();;
                if(min.getValor()==0)
                    horas.avanzar();
            }
        }
    }
    
    public String obtenerTiempo(){
        return horas.obtenerValorFormateado()+":"+
                min.obtenerValorFormateado()+":"+
                 seg.obtenerValorFormateado()+":"+
                  deci.obtenerValorFormateado();
       
    }
    
    public void guardarMemoria (){
        Memoria m= new Memoria();
        m.setDeci(deci);
        m.setSeg(seg);
        m.setMin(min);
        m.setHoras(horas);
        
        memorias.add(m);
    }
    
    public void mostrarMemorias(){
        for (Iterator <Memoria> iterator = memorias.iterator(); iterator.hasNext();) {
            Memoria next = iterator.next();
            System.out.println(next.obtenerTiempo());
            
        }
    }
}
