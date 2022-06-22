/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente( String n) {
        super(n);
    }

    public double getPromedioSueldos() {
        return promedioSueldos;
    }

    public void setPromedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();
            
            
        }
        promedioSueldos = promedioSueldos/lista.size();
    }
    

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
      @Override
    public String toString(){
        String cadenaEstudiante = String.format("Lista Estudiantes");
        
        for(int i = 0;i<lista.size();i++){
            cadenaEstudiante = String.format("%s%s\n",
                    cadenaEstudiante,
                    lista.get(i));
        }
            
        String cadena = String.format("\nCodigo: %s \n"
                +"%s"
                + "El total de matriculas es: %.2f\n", 
                codigo,
                
                cadenaEstudiante,
                getPromedioSueldos());
        return cadena;
    }

 

   
    
    
}
