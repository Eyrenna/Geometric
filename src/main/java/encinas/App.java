package encinas;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        Figura circulo = new Circulo("circulo", 5);
        Figura cercle = new Circulo("cercle", 4);
        Figura circle = new Circulo("circle", 3);
        Figura cuadrado = new Cuadrado("cuadrado", 5);
        Figura quadrat = new Cuadrado("quadrat", 3);
        Figura square = new Cuadrado("square", 2);
        Figura rectangulo = new Rectangulo("rectangulo", 4,5);
        Figura rectangle = new Rectangulo("rectangle", 2,3);

        figuras.add(circulo);
        figuras.add(cercle);
        figuras.add(circle);
        figuras.add(cuadrado);
        figuras.add(quadrat);
        figuras.add(square);
        figuras.add(rectangulo);
        figuras.add(rectangle);

        for(Figura figura : figuras) {
            System.out.println("Figura: " + figura.getName() + " Área: " + figura.area());
        }
    }
}
