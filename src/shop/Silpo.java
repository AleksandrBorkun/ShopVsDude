package shop;

public class Silpo extends BaseShop {

    public Silpo() {
        super();
        shopName = "Silpo";
        AddItemToPolka("Nescafe");
        AddItemToPolka("Tuborg");
        AddItemToPolka("Dniprovske");
        AddItemToPolka("Ganja");
        AddItemToPolka("Sugar");
        AddItemToPolka("Bread");
        AddItemToPolka("LSD");
        System.out.println("Welcome To " + shopName);
    }
}
