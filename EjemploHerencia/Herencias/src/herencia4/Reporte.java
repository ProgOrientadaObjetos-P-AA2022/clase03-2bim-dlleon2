/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {
   protected String codigo;

    public Reporte(String n) {
        codigo = n;
    }
    
    public void establecerCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("%s",obtenerCodigo());
        return cadena;
    }
    
    
   
   
   
    
}
