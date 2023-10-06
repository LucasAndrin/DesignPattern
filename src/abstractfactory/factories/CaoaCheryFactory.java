package abstractfactory.factories;

import abstractfactory.models.cars.caoachery.Arrizo6;
import abstractfactory.models.cars.caoachery.QQ;
import abstractfactory.models.cars.interfaces.PopularCar;
import abstractfactory.models.cars.interfaces.SedanCar;

public class CaoaCheryFactory implements CarFactory {
    @Override
    public SedanCar createSedanCar() {
        return new Arrizo6();
    }

    @Override
    public PopularCar createPopularCar() {
        return new QQ();
    }
}
