import com.greenfoxacademy.teas.Tea;

import java.util.ArrayList;
import java.util.List;

// OO Principles:
// 1. Encapsulation - egysegbe zaras
// 2. Inheritance - oroklodes
// 3. Polymorphism


public class Main {

    public static void main(String[] args) {

        Tea tea1 = new Tea("Long Jing"); // uj peldany, new instance, lefoglal egy memoria teruletet

        tea1.type = "green";
        tea1.amount = 15;
        tea1.origin = "Hangzhou";

        Tea tea2 = new Tea("Bai Hao");

        tea2.type = "white";
        tea2.amount = 5;
        tea2.origin = "Fujian";

        tea1.PrintTea();
        tea2.PrintTea();
        tea2.NeedsRefill();

        tea2.Fill(10); // hozzaad 10et a tea2 amountjahoz

        Tea tea3 = new Tea("Holly Molly", 10);

        Tea tea4 = new Tea("tea4", 56, "Oulong");

        List<Tea> teas = new ArrayList<>(); // Tea tipusu listam lesz

        teas.add(tea1);
        teas.add(tea2);

        Tea.teaCount = 1; // mindegyik osztaly kozos valtozoja, nem letezik peldanyonkent

    }
}
