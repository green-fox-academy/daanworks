package alltogether;

import java.util.Random;

public class Pirates {

    int intoxication;
    int drinkTimes = 0;
    boolean isDead = false;

    public void drinkSomeRum() {
        if(isDead = false) {
            intoxication = intoxication + 2;
            drinkTimes++;
        } else {
            System.out.println("he's dead");
        }
    }

    public void howsItGoingMate() {
        if(isDead = false) {
            if(drinkTimes < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            }
        } else {
            System.out.println("he's dead");
        }

    }

    public void die() {
        if(isDead = true) {
            System.out.println("This pirate is already dead.");
        } else {
            isDead = true;
        }
    }

    public void brawl(Pirates anotherPirate) {

        Random random = new Random();
        int outCome = random.nextInt(3) + 1;

        if(anotherPirate.isDead = false) {
            if (outCome == 1) {
                this.isDead = true;
            } else if (outCome == 2) {
                anotherPirate.isDead = true;
            } else if (outCome == 3) {
                this.isDead = true;
                anotherPirate.isDead = true;
            }
        } else {
            System.out.println("The other pirate is already dead.");
        }
    }
}
