package prototype;

public abstract class CarPrototype {
    protected  double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String showInfo();

    public abstract CarPrototype clone();
}
