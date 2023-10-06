package abstractfactory.models.cars.caoachery;

import abstractfactory.models.cars.interfaces.SedanCar;

public class Arrizo6 implements SedanCar {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Arrizo6");
        System.out.println("Fabrica: Caoa Chery");
        System.out.println("Categoria: Sedan");
    }
}
