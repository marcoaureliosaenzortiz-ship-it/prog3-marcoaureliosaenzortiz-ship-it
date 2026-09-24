package uam.prog3.tarea02;

public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
            new Estudiante("Mariana Solís", "1-1111-1111", "Ingeniería en Sistemas", 85),
            new Colaborador("Jorge Vargas", "2-2222-2222", "Analista de TI", 4),
            new Docente("Marco Aurelio", "3-3333-3333", "Programacion III", 12)
        };

        for (Persona p : personas) {
            System.out.println(p.getNombre() + ": " + p.describirRol());
            if (p instanceof Evaluable) {
                Evaluable ev = (Evaluable) p;
                System.out.println("   Evaluación: " + ev.getEvaluacion());
            }
        }
    }
}
