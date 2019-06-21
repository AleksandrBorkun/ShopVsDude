import people.Dude;
import shop.BaseShop;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    static BaseShop shop;

    public static void main(String[] args) {
        System.out.println("Kak Tebya Zovut?");
        Dude dude = new Dude(in.next());
    }
}
