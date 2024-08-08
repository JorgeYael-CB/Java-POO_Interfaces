package org.yael.poo.interfaces.imprenta.modelo;

public class Informe extends Hoja{

    private String autor;
    private String revisor;


    public Informe(String content, String autor, String revisor){
        super(content);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: \"" + this.autor +"\" revisado por: " + this.revisor + "\n" + this.contenido;
    }
}
