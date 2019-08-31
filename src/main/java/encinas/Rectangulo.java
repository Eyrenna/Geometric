package encinas;

public class Rectangulo extends Figura{

    //PROPIEDADES

    private double ladoMenor = 0d;
    private double ladoMayor = 0d;


    //CONSTRUCTOR

    public Rectangulo() {
    }

    public Rectangulo(String name, double ladoMenor, double ladoMayor) {
        super(name);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }


    //MÉTODOS
    //Getters & Setters

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }


    //MÉTODOS
    //Otros - HEREDADOS

    @Override
    public double area() {
        return getLadoMenor() * getLadoMayor();
    }
}
