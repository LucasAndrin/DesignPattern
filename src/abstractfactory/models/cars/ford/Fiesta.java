package abstractfactory.models.cars.ford;

import abstractfactory.models.cars.interfaces.PopularCar;

public class Fiesta implements PopularCar {

    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta");
        System.out.println("Fabrica: Ford");
        System.out.println("Categoria: Popular");
    }
}
