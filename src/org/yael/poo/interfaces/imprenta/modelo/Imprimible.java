package org.yael.poo.interfaces.imprenta.modelo;

public interface Imprimible {
//    public final static String TEXTO_DEFECTO = "Texto por defecto";
    String TEXTO_DEFECTO = "Texto por defecto"; // por default es static y final.

    String imprimir();

    static void imprimir( Imprimible imprimible ){
        System.out.println(imprimible.imprimir());
    }
}
