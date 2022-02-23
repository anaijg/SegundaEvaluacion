package examen2021;

import org.demo.A;

import java.util.ArrayList;

public class Curso {
    Grado grado;
    CicloFormativo ciclo;
    int año;
    Horario horario;
    int plazasDisponibles;
    ArrayList<Asignatura> asignaturasCurso = new ArrayList<>();
    private Profesor tutor;
    ArrayList<Alumno> alumnosMatriculados = new ArrayList<>();

    public String getTutor() {
        return tutor.getNombre();
    }

    /*
            Tiene un constructor que recibe el ciclo formativo y el
        año (1 o 2), y los inicializa.
             */
    public Curso(CicloFormativo ciclo, int año) {
        this.ciclo = ciclo;
        this.año = año;
        /*
        Si el ciclo formativo es SMR, el grado del curso es
MEDIO. En caso contrario, el grado es SUPERIOR.
         */
        if (ciclo.equals(CicloFormativo.SMR)) {
            grado = Grado.MEDIO;
            /*
            El grado MEDIO se imparte en horario de MAÑANA. El
grado SUPERIOR se imparte en horario de TARDE.
             */
            horario = Horario.MAÑANA;
        } else {
            grado = Grado.SUPERIOR;
            horario = Horario.TARDE;
        }

        /*
        asignaturasCurso: las asignaturas se crean y se
añaden al ArrayList teniendo en cuenta lo siguiente:
         */
        if (grado.equals(Grado.MEDIO)) {
            if (año == 1) {
                Asignatura mme = new Asignatura("MME", 7);
                asignaturasCurso.add(mme);
                Asignatura ao = new Asignatura("AO", 7);
                asignaturasCurso.add(ao);
                Asignatura som = new Asignatura("SOM", 6);
                asignaturasCurso.add(som);
                Asignatura rl = new Asignatura("RL", 7);
                asignaturasCurso.add(rl);
                Asignatura fol = new Asignatura("FOL", 3);
                asignaturasCurso.add(mme);
            } else {
                Asignatura sr = new Asignatura("SR", 6);
                asignaturasCurso.add(sr);
                Asignatura sor = new Asignatura("SOR", 6);
                asignaturasCurso.add(sor);
                Asignatura si = new Asignatura("SI", 6);
                asignaturasCurso.add(si);
                Asignatura aw = new Asignatura("RL", 7);
                asignaturasCurso.add(aw);
                Asignatura eie = new Asignatura("EIE", 3);
                asignaturasCurso.add(eie);
            }
        } else {
            // si no es grado medio es grado superior
            if (año == 1) {
                // aquí creamos las asignatura s de 1 DAW
            } else {
                // aquí creamos las asignaturas de 2 DAW
            }
        }

        // Plazas disponibles: en 1º se comienza con 30 plazas;
        //en 2º, con 20.
        if (año == 1) {
            plazasDisponibles = 30;
        } else {
            plazasDisponibles = 20;
        }




    }
}
