package org.yael.poo.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;


public class Libro implements Imprimible {
    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;


    public Libro(String autor, String titulo, Genero genero){
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPage( Hoja page ){ // encadenamiento de agregar paginas
        this.paginas.add(page);
        return this;
    }


    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ")
                .append(this.titulo).append("\n")
                .append("Genero: ").append(this.genero)
                .append("\n").append("Autor ")
                .append(this.autor).append("\n");

        for( Hoja page: this.paginas ){
            sb.append(page.imprimir()).append("\n");
        }

        return sb.toString();
    }
}
