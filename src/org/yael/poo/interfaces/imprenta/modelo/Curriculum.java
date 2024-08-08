package org.yael.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;


public class Curriculum extends Hoja{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String content, String persona, String carrera){
        super(content);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperience(String exp){
        this.experiencias.add(exp);
        return this;
    }


    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(this.persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("/n")
                .append("Experiencias: \n");

        for( String exp: this.experiencias ){
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();
    }
}
