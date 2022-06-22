/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String e){
        super(e);
    }
     public double getPromedioMatriculas() {
        return promedioMatriculas;
    }
     public void setPromedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas + lista.get(i).getMatricula();
            
            
        }
        promedioMatriculas = promedioMatriculas/lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiante> lista) {
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
            
        String cadena = String.format("\nmatricula: %s \n"
                +"%s"
                + "El total de matriculas es: %.2f\n", 
                codigo,
                
                cadenaEstudiante,
                getPromedioMatriculas());
        return cadena;
    }
    
     
}