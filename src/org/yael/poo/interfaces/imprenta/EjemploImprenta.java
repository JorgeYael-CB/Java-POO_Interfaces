package org.yael.poo.interfaces.imprenta;

import org.yael.poo.interfaces.imprenta.modelo.*;


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

        Informe informe = new Informe("Estudio sobre MicroServicios", "Martin Fowler", "James");

        EjemploImprenta.imprimir(informe);
        System.out.println("=============================================");
        EjemploImprenta.imprimir(cv);
    }

    public static void imprimir(Hoja imprimible ){ // cualquier clase que herede de hoja, sera imprimible.
        System.out.println(imprimible.imprimir());
    }
}
