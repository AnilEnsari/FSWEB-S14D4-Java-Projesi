package ProductForSale;

public class Chocolate extends ProductForSale{
    private boolean isBitter;
    public Chocolate(String type, double price, String description,boolean isBitter) {
        super(type, price, description);
        this.isBitter=isBitter ;
    }

    public boolean getIsBitter() {
        return isBitter;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate {" +
                "isBitter?='" + getIsBitter() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}');
    }
}
