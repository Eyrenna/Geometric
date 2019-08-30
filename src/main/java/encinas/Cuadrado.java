package encinas;

public class Cuadrado extends Figura {

    //PROPIEDADES

    private double lado = 0d;


    //CONSTRUCTOR

    public Cuadrado() {
    }

    public Cuadrado(String name, double lado) {
        super(name);
        this.lado = lado;
    }


    //MÉTODOS
    //Getters & Setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    //MÉTODOS
    //Otros - HEREDADOS

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }
}
