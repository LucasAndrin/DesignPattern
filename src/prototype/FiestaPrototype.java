package prototype;

import abstractfactory.models.cars.ford.Fiesta;

public class FiestaPrototype extends CarPrototype {

    public FiestaPrototype() {
        price = 0.0;
    }

    protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
        this.price = fiestaPrototype.getPrice();
    }

    @Override
    public String showInfo() {
        return "Modelo: Fiesta\nMontadora: Ford\nValor: R$" + getPrice();
    }

    @Override
    public CarPrototype clone() {
        return new FiestaPrototype(this);
    }
}
