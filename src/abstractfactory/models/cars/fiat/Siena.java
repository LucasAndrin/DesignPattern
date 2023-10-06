package abstractfactory.models.cars.fiat;

import abstractfactory.models.cars.interfaces.SedanCar;

public class Siena implements SedanCar {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena");
        System.out.println("Fabrica: Fiat");
        System.out.println("Categoria: Sedan");
    }
}
