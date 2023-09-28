
import MonsterForSimpleRPGGame.Monster;
import MonsterForSimpleRPGGame.Werewolf;
import ProductForSale.ProductForSale;
import ProductForSale.Bread;
import ProductForSale.Chocolate;
import ProductForSale.Coke;


public class Store {
    public static void main(String[] args) {
        ProductForSale bread = new Bread("carbonhydrate", 8, "less calories", true);
        ProductForSale chocolate = new Chocolate("desert", 12, "milky and hazelnut", false);
        ProductForSale coke = new Coke("drink", 10, "zero sugar", true);
        ProductForSale [] products = {bread,chocolate,coke};
        Monster werewolf = new Werewolf("Werewolf",100,15) ;
        System.out.println("Werewolf is bleeding. Damage is: "+ werewolf.bleed());
        System.out.println("Werewolf is poisoning. Damage is: "+ werewolf.poison());
        System.out.println("Werewolf is attacking. Damage is: "+ werewolf.attack());


        System.out.println("***************************");

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {

            product.showDetails();
        }

    }


}
