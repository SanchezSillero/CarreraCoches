import cochesCarrera.Carrera;
import cochesCarrera.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Seat", "Ibiza", 120, 1400, "18124S", 0, 0);
        Coche coche2 = new Coche("Audi", "A4", 150, 1800, "41614A", 0, 0);

        Carrera carrera = new Carrera();
        carrera.iniciarCarrera(coche1, coche2, 10, 600);
        System.out.println("El ganador es el " + carrera.getGanador());
    }
}
