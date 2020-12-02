package com.greenfoxacademy.teas;

public class Tea { // itt a tervrajz, hogy hogyan kell teakat csinalni. Azert kell public, hogy a tobbi packageban lathato legyen

        public String name; // spec valtozok, "field" vagy "member vars", vagy "tagvaltozo"
        public String type;
        public int amount;
        public String origin;

        public static int teaCount = 0; // peldanytol fuggetlen, globalis valtozot hozok letre

        public Tea(String teaName) { // konstruktor, akkor hivodik meg, amikor egy uj pld-t hozunk letre
                name = teaName;      // VAGY this.name = name, TEHAT a field kell, a bemeno paramnak meg mindegy mi a neve
                amount = 10;         // tehat lehet name is, es akkor kell a this.name = name!!
        }

        public Tea(String name, int amount) { // uj konstruktor, ketfelekepp tudok teat letrehozni
               this.name = name;
               this.amount = amount;
        }

        // ONNAN TUDJA A FORDITO HOGY MELYIK KONSTRUKTORRAL KELL DOLGOZNI, HOGY MILYEN TIPUSU BEMENO
        // PARAMETEREI VANNAK!!! tehat nem fog menni ha mind2 String int, String int
        // lehet meghivni konstruktort - az elsoben megadhatjuk a default ertekeket, utana meghivjuk

        public Tea(String name, int amount, String type) {
                this(name, amount); // meghivja a masodikat!
                this.type = type;
        }

        public void PrintTea() {
                System.out.println(name);
                System.out.println(type);
                System.out.println(amount);
                System.out.println(origin);
        }

        public void NeedsRefill() {
                if (amount < 10) {
                System.out.println(name + " needs refill");
                }
        }

        public void Fill(int amount) {
                this.amount += amount; // ha tea1-en hivtuk meg akkor a 'this' arra mutat!!!
        }
}