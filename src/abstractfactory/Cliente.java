package abstractfactory;

import abstractfactory.factories.CaoaCheryFactory;
import abstractfactory.factories.CarFactory;
import abstractfactory.factories.FiatFactory;
import abstractfactory.factories.FordFactory;
import abstractfactory.models.cars.interfaces.PopularCar;
import abstractfactory.models.cars.interfaces.SedanCar;

public class Cliente {
    public static void main(String[] args) {
        CarFactory factory = new FiatFactory();
        SedanCar sedan = factory.createSedanCar();
        PopularCar popular = factory.createPopularCar();

        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();

        factory = new FordFactory();
        sedan = factory.createSedanCar();
        popular = factory.createPopularCar();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
        System.out.println();

        factory = new CaoaCheryFactory();
        sedan = factory.createSedanCar();
        popular = factory.createPopularCar();
        sedan.exibirInfoSedan();
        System.out.println();
        popular.exibirInfoPopular();
    }
}
