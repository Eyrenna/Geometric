package encinas;

public abstract class Figura {

    //PROPIEDADES

    public String name;

    //CONSTRUCTOR

    public Figura() {
    }

    public Figura(String name) {
        this.name = name;
    }


    //MÉTODOS
    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //MÉTODOS
    //Otros - ABSTRACTOS

    public abstract double area();

}
