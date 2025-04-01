package org.Personas;

import lombok.Getter;
import lombok.Setter;
import org.Inscripcion.Materia;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> listaMateriasAprobadas;


    public void agregarMateriaAprobada(Materia materia) {
        listaMateriasAprobadas.add(materia);
    }

    public Alumno(){ // Inializo el constructor así le puedo pasar por parámetro
        listaMateriasAprobadas = new HashSet(); //Agrego el constructor con la lista inicializada de base para no tener un problema a la hora de evaluar la inscripción
    }
}





