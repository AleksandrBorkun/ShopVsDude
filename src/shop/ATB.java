package shop;

public class ATB extends BaseShop{

    public ATB(){
        super();
        shopName = "ATB";
        AddItemToPolka("Bulka");
        AddItemToPolka("Tuborg");
        AddItemToPolka("Dniprovske");
        AddItemToPolka("Kefir");
        AddItemToPolka("Sugar");
        AddItemToPolka("Bread");
        AddItemToPolka("JavaBook");
        System.out.println("Welcome To " + shopName);
    }

}
