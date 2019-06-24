package people;

import entity.Item;

import java.util.ArrayList;
import java.util.List;

public class Dude {

    private String name;
    private List<Item> basket;

    public Dude(String name) {
        this.name = name;
        basket = new ArrayList<>();
        System.out.println("Escho Na Odnogo Chuvaka V Etom Mire Stalo Bolshe!\nPrivet " + name);
    }

    public void addItemToBasket(Item item) {
        System.out.println(name + " polozhil " + item.getName() + " v svou bezdonnyu korzinu pokupok");
        basket.add(item);
    }


    public String getName() {
        return name;
    }

    public void checkKorzinu() {
        if (basket.size() == 0) {
            System.out.println("Nima nichego v nashei bezdonnoi korzine pokupok");
            return;
        }
        System.out.println("V vashei bezdonnoi korzine next items:");
        for (Item item : basket) {
            System.out.println(item);
        }
    }

    public List<Item> getBasket() {
        return basket;
    }
}
