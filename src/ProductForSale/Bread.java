package ProductForSale;

public class Bread extends ProductForSale{
    private boolean isRye ;
    public Bread(String type, double price, String description,boolean isRye) {
        super(type, price, description);
        this.isRye=isRye ;
    }

    public boolean getIsRye() {
        return isRye;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread  {" +
                "isRye='" + getIsRye() + '\'' +
                ", type='" + getType() + '\'' +
                ", price=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}');
    }
}
