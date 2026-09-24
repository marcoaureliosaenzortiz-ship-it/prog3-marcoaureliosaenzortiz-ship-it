package uam.prog3.tarea02;

public class Docente extends Persona implements Evaluable {
    private String materiaImpartida;
    private int aniosExperiencia;

    public Docente(String nombre, String cedula, String materiaImpartida, int aniosExperiencia) {
        super(nombre, cedula);
        this.materiaImpartida = materiaImpartida;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String describirRol() {
        return "Docente de " + materiaImpartida;
    }

    @Override
    public String getEvaluacion() {
        if (aniosExperiencia >= 10) return "Senior";
        if (aniosExperiencia >= 3) return "Intermedio";
        return "Junior";
    }
}
