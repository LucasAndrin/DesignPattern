package abstractfactory.models.cars.ford;

import abstractfactory.models.cars.interfaces.SedanCar;

public class FiestaSedan implements SedanCar {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: FiestaSedan");
        System.out.println("Fabrica: Ford");
        System.out.println("Categoria: Sedan");
    }
}
