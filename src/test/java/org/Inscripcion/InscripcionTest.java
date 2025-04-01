package org.Inscripcion;

import org.Personas.Alumno;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void pruebaInscripcionAprobada() {

        //Materias
        Materia pdp = new Materia();
        Materia ayed = new Materia();
        Materia dsi = new Materia();

        pdp.setNombre("Paradgimas");
        ayed.setNombre("Algoritmos");
        dsi.setNombre("Diseño de Sistemas");
        pdp.agregarCorrelativa(ayed);
        dsi.agregarCorrelativa(pdp);

        // Alumno
        Alumno lucio=new Alumno();
        lucio.setNombre("Lucio");
        lucio.setApellido("de Goñi");
        lucio.agregarMateriaAprobada(ayed);
        lucio.agregarMateriaAprobada(pdp);

        // Inscripcion
        Inscripcion inscripcionTest = new Inscripcion();
        inscripcionTest.setAlumno(lucio);
        inscripcionTest.agregarMateriaDeseada(dsi);

        assertTrue(inscripcionTest.aprobada());

    }

    @Test
    public void pruebaInscripcionRechazada() {

        //Materias
        Materia pdp = new Materia();
        Materia ayed = new Materia();
        Materia dsi = new Materia();

        pdp.setNombre("Paradgimas");
        ayed.setNombre("Algoritmos");
        dsi.setNombre("Diseño de Sistemas");
        pdp.agregarCorrelativa(ayed);
        dsi.agregarCorrelativa(pdp);

        // Alumno
        Alumno lucio = new Alumno();
        lucio.setNombre("Lucio");
        lucio.setApellido("de Goñi");

        // Inscripcion
        Inscripcion inscripcionTest = new Inscripcion();
        inscripcionTest.setAlumno(lucio);
        inscripcionTest.agregarMateriaDeseada(dsi);

        assertFalse(inscripcionTest.aprobada());
    }
}