package prototype;

public class PalioPrototype extends CarPrototype {
    public PalioPrototype() {
        price = 0.0;
    }

    protected PalioPrototype(PalioPrototype palioPrototype) {
        this.price = palioPrototype.getPrice();
    }

    @Override
    public String showInfo() {
        return "Modelo: Palio\nMontadora: Fiat\nValor: R$" + getPrice();
    }

    @Override
    public CarPrototype clone() {
        return new PalioPrototype(this);
    }
}
