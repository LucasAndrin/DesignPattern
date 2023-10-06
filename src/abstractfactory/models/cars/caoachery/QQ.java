package abstractfactory.models.cars.caoachery;

import abstractfactory.models.cars.interfaces.PopularCar;

public class QQ implements PopularCar {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: QQ");
        System.out.println("Fabrica: Caoa Chery");
        System.out.println("Categoria: Popular");
    }
}
