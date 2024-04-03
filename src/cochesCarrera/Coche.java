package cochesCarrera;

public class Coche {
    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private String matricula;
    private double velocidad;
    private double kmRecorridos;

//constructors

    public Coche() {
    }

    public Coche(double velocidad) {
        this.velocidad = velocidad;
    }

    public Coche(String marca, String modelo, int cv, int cc, String matricula, double velocidad, double kmRecorridos) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.kmRecorridos = kmRecorridos;
    }

//metodos

    public void acelerar(int sumaVelocidad) {
        if (cv < 100) {
            this.velocidad += Math.random() * sumaVelocidad;
            this.kmRecorridos += (velocidad / 2);
        } else if (cv >= 100) {
            this.velocidad += (Math.random() * sumaVelocidad) + 10;
            this.kmRecorridos += (velocidad / 2);
        }
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("cv: " + cv);
        System.out.println("cc: " + cc);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("km recorridos: " + kmRecorridos);
    }


    //getter and setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}
