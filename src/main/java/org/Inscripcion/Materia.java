package org.Inscripcion;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Materia {
    private String nombre;
    private Set<Materia> listaCorrelativas;

    public boolean cumpleCorrelatividades(Set<Materia>materiasAprobadas){
        if(listaCorrelativas == null){
             return true;
        }
        else{
            return materiasAprobadas.containsAll(this.listaCorrelativas);
        }
    }

    public void agregarCorrelativa(Materia materia) {
        this.listaCorrelativas.add(materia);
    }

    public Materia(){
        listaCorrelativas = new HashSet();
    }
}
