package abstractfactory.factories;

import abstractfactory.models.cars.interfaces.PopularCar;
import abstractfactory.models.cars.interfaces.SedanCar;
import abstractfactory.models.cars.fiat.Palio;
import abstractfactory.models.cars.fiat.Siena;

public class FiatFactory implements CarFactory {
    @Override
    public SedanCar createSedanCar() {
        return new Siena();
    }

    @Override
    public PopularCar createPopularCar() {
        return new Palio();
    }
}
