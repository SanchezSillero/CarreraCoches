import cochesCarrera.Coche;

public class Entrada {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Seat", "Ibiza", 75, 1400, "4562COR", 40, 100);
        coche1.mostrarDatos();
        coche1.acelerar(10);
        coche1.mostrarDatos();
    }
}
