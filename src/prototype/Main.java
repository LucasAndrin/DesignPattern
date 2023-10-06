package prototype;

public class Main {
    public static void main(String[] args) {
        PalioPrototype palioPrototype = new PalioPrototype();
        CarPrototype newPalio = palioPrototype.clone();
        newPalio.setPrice(27900);
        CarPrototype usedPalio = palioPrototype.clone();
        usedPalio.setPrice(21000);
        System.out.println(newPalio.showInfo());
        System.out.println(usedPalio.showInfo());
    }
}
