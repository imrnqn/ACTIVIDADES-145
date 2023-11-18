package actividad.pkg1;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    private int idInscripcion;
    private Alumno alumno;
    private Carrera carrera;
    private List<Integer> materias;
    private List<Estado> estado;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Carrera carrera, List<Integer> materias, List<Estado> estado) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.carrera = carrera;
        this.materias = materias;
        this.estado = estado;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Estado> getEstado() {
        return estado;
    }

    public void setEstado(List<Estado> estado) {
        this.estado = estado;
    }

    public List<Integer> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Integer> materias) {
        this.materias = materias;
    }

    public boolean Aprobada (Inscripcion inscripcion, Materia materia) {
        List<Integer> listaMateNec = new ArrayList();
        List<Integer> listaMateAlu = new ArrayList();
        List<Estado> listaEstado = new ArrayList();
        listaMateNec = materia.getMateriasAprobadas();
        listaMateAlu = inscripcion.getMaterias();
        listaEstado = inscripcion.getEstado();
        int contMatNec, contMatEst, i;
        contMatNec = contMatEst = i = 0;
        for (Integer matNec : listaMateNec) {
            contMatNec++;
            for (Integer matEst : listaMateAlu){
                if (matEst==matNec && listaEstado.get(i)==Estado.APROBADA){
                    contMatEst++;
                }
            i++;
            }
        }
        System.out.println("materias necesaria "+ contMatNec+" materias cursadas " + contMatEst);
        if (contMatEst == contMatNec){
            return true;
        }else{
            return false;
        }
    } 
    
    public boolean Cursada(Inscripcion inscripcion, Materia materia) {
        List<Integer> listaMateNec = new ArrayList();
        List<Integer> listaMateAlu = new ArrayList();
        listaMateNec = materia.getMateriasCursadas();
        listaMateAlu = inscripcion.getMaterias();
        int contMatNec, contMatAlu;
        contMatNec = contMatAlu = 0;
        for (Integer matNec : listaMateNec) {
            contMatNec++;
            for (Integer matAlu : listaMateAlu){
                if (matAlu == matNec){
                    contMatAlu++;
                }
            }
        }
        System.out.println("materias necesaria "+ contMatNec+" materias cursadas " + contMatAlu);
        if (contMatAlu == contMatNec){
            return true;
        }else{
            return false;
        }
    }
}

