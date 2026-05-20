package Semana07.servicio;

import Semana07.modelo.Alumno;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AlumnoServicio {

    private List<Alumno> alumnos;
    private Set<Integer> codigosRegistrados;
    private Map<Integer, Alumno> alumnosPorCodigo;

    public AlumnoServicio() {
        alumnos = new ArrayList<>();
        codigosRegistrados = new HashSet<>();
        alumnosPorCodigo = new HashMap<>();
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (codigosRegistrados.contains(alumno.getCodigo())) {
            return false;
        }

        alumnos.add(alumno);
        codigosRegistrados.add(alumno.getCodigo());
        alumnosPorCodigo.put(alumno.getCodigo(), alumno);

        return true;
    }

    public Alumno buscarPorCodigo(int codigo) {
        return alumnosPorCodigo.get(codigo);
    }

    public List<Alumno> obtenerTodos() {
        return alumnos;
    }

    public List<Alumno> obtenerAprobados() {
        List<Alumno> aprobados = new ArrayList<>();

        for (Alumno alumno : alumnos) {
            if (alumno.getNota() >= 11) {
                aprobados.add(alumno);
            }
        }

        return aprobados;
    }

    public void ordenarPorNotaDescendente() {
        alumnos.sort((a1, a2) -> Double.compare(a2.getNota(), a1.getNota()));
    }
}
