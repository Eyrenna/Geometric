package encinas;

public class Circulo extends Figura {

    //PROPIEDADES

    private double radio = 0d;


    //CONSTRUCTOR

    public Circulo() {
    }

    public Circulo(String name, double radio) {
        super(name);
        this.radio = radio;
    }


    //MÉTODOS
    //Getters & Setters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    //MÉTODOS
    //Otros - HEREDADOS

    @Override
    public double area() {
        return 2 * Math.PI * getRadio();
    }
}
