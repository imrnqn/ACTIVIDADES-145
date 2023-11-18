/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ivanm
 */
public class Actividad1 {

    // antes de cursar Diseño de Sistemas hay que cursar Paradigmas de Programación y antes de ésta hay que
    // cursar Algoritmos y Estructuras de Datos, donde esta última no tiene correlativas
    
    public static void main(String[] args) {
        Inscripcion insc1 = new Inscripcion();
        Alumno alu1 = new Alumno(1,"Perez","Juan", 12);
        
        ArrayList matCursadas = new ArrayList();
        ArrayList matAprobadas = new ArrayList();
        ArrayList<Estado> matEstado = new ArrayList();
        
        Materia mate1= new Materia(); Materia mate2= new Materia(); Materia mate3 = new Materia(); Materia mate4 = new Materia();
        
        mate1.setIdMateria(1); mate1.setNombre("Algoritmo y Estructura de Datos"); mate1.setMateriasAprobadas(null); mate1.setMateriasCursadas(null);
        mate2.setIdMateria(2); mate2.setNombre("Paradigma de Programacion"); mate2.setMateriasAprobadas(null); mate2.setMateriasCursadas(matCursadas);
        mate4.setIdMateria(4); mate4.setNombre("Analisis Matemático"); mate4.setMateriasAprobadas(null); mate4.setMateriasCursadas(null);

        matCursadas.add(1);
        matCursadas.add(2);
        matAprobadas.add(4);
                
        mate3.setIdMateria(3); mate3.setNombre("Diseño de Sistemas"); mate3.setMateriasAprobadas(matAprobadas); mate3.setMateriasCursadas(matCursadas);       
        
        System.out.println("lista matCursadas " + matCursadas);
        System.out.println("lista matAprobadas " + matAprobadas);
        System.out.println("");
        
        
        insc1.setAlumno(alu1);
        insc1.setIdInscripcion(1);
        insc1.setCarrera(Carrera.Terciaria);
        
        matCursadas.clear();
        matCursadas.add(1);
        matCursadas.add(2);
        matCursadas.add(4);
        
        insc1.setMaterias(matCursadas);
        System.out.println("lista matCursadas " + matCursadas);
        
        matEstado.add(0, Estado.APROBADA);
        matEstado.add(1, Estado.APROBADA);
        matEstado.add(2, Estado.CURSADA);
           
        insc1.setEstado(matEstado);
        System.out.println("lista estado " + matEstado);
        System.out.println("");
        
        System.out.println("La materia se encuentra en condición "+insc1.Cursada(insc1, mate3)+" para cursar...");
        System.out.println("La materia se encuentra en condición "+insc1.Aprobada(insc1, mate3)+" para cursar...");
        
        
        //insc1.getMaterias;
        
    }
    
}
