package abstractfactory.factories;

import abstractfactory.models.cars.interfaces.PopularCar;
import abstractfactory.models.cars.interfaces.SedanCar;

public interface CarFactory {
    SedanCar createSedanCar();
    PopularCar createPopularCar();
}
