package prototype;

public class GolPrototype extends CarPrototype {
    public GolPrototype() {
        price = 0.0;
    }

    protected GolPrototype(GolPrototype golPrototype) {
        this.price = golPrototype.getPrice();
    }

    @Override
    public String showInfo() {
        return "Modelo: Gol\nMontadora: Wolkswagen\nValor: R$" + getPrice();
    }

    @Override
    public CarPrototype clone() {
        return new GolPrototype(this);
    }
}
