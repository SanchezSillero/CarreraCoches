package cochesCarrera;

public class Carrera {
    private Coche coche1, coche2;
    private String ganador;
    private int kmTotales;
    private int numeroVueltas;

    //constructors
    public Carrera() {
    }

    public Carrera(Coche coche1, Coche coche2, String ganador, int kmTotales, int numeroVueltas) {
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.ganador = ganador;
        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;
    }

    //metodos
    public void iniciarCarrera(Coche coche1, Coche coche2, int numeroVueltas, int kmTotales) {
        this.ganador = "";
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
        if (coche1.getKmRecorridos() >= getKmTotales() || coche2.getKmRecorridos() >= getKmTotales()) {
            System.out.println("Datos del Coche 1: ");
            coche1.mostrarDatos();
            System.out.println("-----------------------------");
            System.out.println("Datos del Coche 2: ");
            coche2.mostrarDatos();
            if (coche1.getKmRecorridos() > coche2.getKmRecorridos()) {
                System.out.println("La carrera ha finalizado. El ganador ha sido el coche con matrícula: " + coche1.getMatricula());
            }else {
                System.out.println("La carrera ha finalizado. El ganador ha sido el coche con matrícula: " + coche2.getMatricula());
            }
        } else {}

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

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getNumeroVueltas() {
        return numeroVueltas;
    }

    public void setNumeroVueltas(int numeroVueltas) {
        this.numeroVueltas = numeroVueltas;
    }
}