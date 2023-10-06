package abstractfactory.models.cars.fiat;

import abstractfactory.models.cars.interfaces.PopularCar;

public class Palio implements PopularCar {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio");
        System.out.println("Fabrica: Fiat");
        System.out.println("Categoria: Popular");
    }
}
