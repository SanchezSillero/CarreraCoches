package cochesCarrera;

public class Carrera {
    private Coche coche1, coche2;
    private String ganador;
    private double kmTotales;
    private int numeroVueltas;

    //constructors
    public Carrera() {
    }


    //metodos
    public void iniciarCarrera(Coche coche1, Coche coche2, int numeroVueltas, double kmTotales) {
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;
        this.ganador = "";
        this.coche1 = coche1;
        this.coche2 = coche2;

        System.out.println("Datos del Coche 1: ");
        coche1.mostrarDatos();
        System.out.println("-----------------------------");
        System.out.println("Datos del Coche 2: ");
        coche2.mostrarDatos();

        for (int i = 0; i < numeroVueltas; i++) {
            coche1.acelerar(10);
            coche2.acelerar(10);
        }

        System.out.println("-----------------------------");

        while (coche1.getKmRecorridos() < getKmTotales() && coche2.getKmRecorridos() < getKmTotales()) {
            System.out.println("No hay un ganador, se seguirá dando vueltas hasta que haya un ganador");
            numeroVueltas++;
            coche1.acelerar(10);
            coche2.acelerar(10);
            System.out.println("Vuelta número: " + (numeroVueltas));

        }
        if (coche1.getKmRecorridos() > coche2.getKmRecorridos()) {
            System.out.println("La carrera ha finalizado. El ganador ha sido el coche con matrícula: " + coche1.getMatricula());
            ganador = coche1.getMarca() + " " + coche1.getModelo();
        } else {
            System.out.println("La carrera ha finalizado. El ganador ha sido el coche con matrícula: " + coche2.getMatricula());
            ganador = coche2.getMarca() + " " + coche2.getModelo();
        }

    }


//getters y setters


    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public double getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(double kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
}