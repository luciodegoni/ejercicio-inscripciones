package org.Inscripcion;

import lombok.Getter;
import lombok.Setter;
import org.Personas.Alumno;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Inscripcion{
    private Alumno alumno;
    private Set<Materia> materiasACursar;
    private boolean aproboMateria;

    public boolean aprobada(){
        Set <Materia> aprobadas = alumno.getListaMateriasAprobadas();

        return materiasACursar.stream()
                .allMatch(m -> m.cumpleCorrelatividades(aprobadas));
    };

    public void agregarMateriaDeseada(Materia materia){
        this.materiasACursar.add(materia);
    }

    public Inscripcion(){
        materiasACursar = new HashSet();
    }
}



