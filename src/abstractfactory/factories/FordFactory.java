package abstractfactory.factories;

import abstractfactory.models.cars.interfaces.PopularCar;
import abstractfactory.models.cars.interfaces.SedanCar;
import abstractfactory.models.cars.ford.Fiesta;
import abstractfactory.models.cars.ford.FiestaSedan;

public class FordFactory implements CarFactory {
    @Override
    public SedanCar createSedanCar() {
        return new FiestaSedan();
    }

    @Override
    public PopularCar createPopularCar() {
        return new Fiesta();
    }
}
