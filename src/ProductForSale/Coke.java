package ProductForSale;

public class Coke extends ProductForSale{
    private boolean isZero ;
    public Coke(String type, double price, String description,boolean isZero) {
        super(type, price, description);
        this.isZero=isZero ;
    }

    public boolean getIsZero() {
        return isZero;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke {" +
                "isZero='" + getIsZero() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}');
    }
}
