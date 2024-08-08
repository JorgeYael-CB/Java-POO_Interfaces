package org.yael.poo.interfaces.imprenta;

import org.yael.poo.interfaces.imprenta.modelo.*;
import static org.yael.poo.interfaces.imprenta.modelo.Genero.TERROR;


public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("John Doe", "Ingeniero en Sistemas", "Resumen laboral");
        cv.addExperience("Java");
        cv.addExperience("C#");
        cv.addExperience("Node.js");
        cv.addExperience("Angular");
        cv.addExperience("Oracle DBA");
        cv.addExperience("Spring");
        cv.addExperience(".NET Core 8");
        cv.addExperience("React");

        Libro libro = new Libro("Yael", "El programador que no sabia programar", TERROR);

        libro.addPage(new Pagina("Aprendiendo java..."))
                .addPage(new Pagina("Aprendiendo algoritmos"))
                .addPage(new Pagina("Mi primer prueba tecnica!!!...."));

        Informe informe = new Informe("Estudio sobre MicroServicios", "Martin Fowler", "James");


        EjemploImprenta.imprimir(informe);
        EjemploImprenta.imprimir(cv);
        EjemploImprenta.imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible ){ // cualquier clase que herede de hoja, sera imprimible.
        System.out.println(imprimible.imprimir());
    }
}
