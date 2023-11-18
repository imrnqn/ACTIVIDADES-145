package actividad.pkg1;

import java.util.List;
import java.util.Objects;

public class Materia {

    private int idMateria;
    private String Nombre;
    private List<Integer> materiasAprobadas;
    private List<Integer> materiasCursadas;

    public Materia() {
    }

    public Materia(int idMateria, String Nombre, List materiaAprobadas, List materiasCursadas) {
        this.idMateria = idMateria;
        this.Nombre = Nombre;
        this.materiasAprobadas = materiaAprobadas;
        this.materiasCursadas = materiasCursadas;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public List getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public List getMateriasCursadas() {
        return materiasCursadas;
    }

    public void setMateriasCursadas(List materiasCursadas) {
        this.materiasCursadas = materiasCursadas;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", Nombre=" + Nombre + ", materiasAprobadas=" + materiasAprobadas + ", materiasCursadas=" + materiasCursadas + '}';
    }

   

}