package org.yael.poo.interfaces.imprenta;

import org.yael.poo.interfaces.imprenta.modelo.*;
import static org.yael.poo.interfaces.imprenta.modelo.Genero.TERROR;
import static org.yael.poo.interfaces.imprenta.modelo.Imprimible.imprimir;


public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("John Doe", "Ingeniero en Sistemas", "Resumen laboral");
        cv.addExperience("Java")
        .addExperience("C#")
        .addExperience("Node.js")
        .addExperience("Angular")
        .addExperience("Oracle DBA")
        .addExperience("Spring")
        .addExperience(".NET Core 8")
        .addExperience("React");

        Libro libro = new Libro("Yael", "El programador que no sabia programar", TERROR);

        libro.addPage(new Pagina("Aprendiendo java..."))
                .addPage(new Pagina("Aprendiendo algoritmos"))
                .addPage(new Pagina("Mi primer prueba tecnica!!!...."));

        Informe informe = new Informe("Estudio sobre MicroServicios", "Martin Fowler", "James");


        imprimir(informe); // metodo estatico de la inferfaz
        imprimir(cv);
        imprimir(libro);


        // Clases anonimas, pueden ser creadas mediante inferfaces o clases abstractas
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Metodo imprimible";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFECTO); // llamar un metodo estatico de una interfaz
    }
}
