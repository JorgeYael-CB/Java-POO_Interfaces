package org.yael.poo.interfaces.imprenta.modelo;

public class Pagina extends Hoja{

    public Pagina(String content){
        super(content);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }
}
