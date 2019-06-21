package shop;

import entity.Item;

import java.util.ArrayList;
import java.util.List;

public class BaseShop {

    private List<Item> polka;
    String shopName;

    //делаю конструктор protected чтобы только наследники могли использовать
    protected BaseShop() {
        polka = new ArrayList<>();
    }

    public void showItemsOnPolka() {
        System.out.println("******************************************************");
        for (Item item : polka) {
            System.out.println(item + "\t");
        }
        System.out.println("******************************************************");
    }

    public Item findItemOnPolka(String itemName) {
        for (Item item : polka) {
            if (item.getName().contains(itemName)) {
                return item;
            }
        }
        System.out.println("Item with name " + itemName + " wasn't found on polka");
        return null;
    }

    //Магазин считает сколько ты платишь. Для этого нужно передать твою корзину
    public void getReciept(List<Item> dudeBucket) {
        if (dudeBucket.size() == 0) {
            System.out.println("Debil! Snachala napolni korzinu!");
            return;
        }
        double totalPrice = 0.0;
        System.out.println("Thanks for using " + shopName);
        System.out.println("******************************************************");
        System.out.println("Here what you bought ");
        for (Item item : dudeBucket) {
            System.out.println(item.getName() + " - " + item.getPrice());
            totalPrice += item.getPrice();
        }
        System.out.println();
        System.out.println("******************************************************");
        System.out.println("\ttotal price: " + totalPrice);
        dudeBucket.clear();
    }

    //делаю protected чтобы только наследники могли использовать
    protected void AddItemToPolka(String name) {
        polka.add(new Item(name, getRandomNumber()));
    }

    private static double getRandomNumber() {
        int wholeNum = 1000 + (int) (Math.random() * ((9900 - 1000) + 1));
        return ((double) wholeNum) / 100.0;
    }

    @Override
    public String toString() {
        return shopName + "Shop";
    }
}
