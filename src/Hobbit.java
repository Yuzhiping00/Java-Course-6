/**
 * This class is a subclass of Humanoid. It has its own methods, which are stealing() method
 * and overrides toString() method.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class Hobbit extends Humanoid {
    /**
     * Constructor with only one parameter
     *
     * @param name initialize instance variable name.
     */
    public Hobbit(String name) {
        super(name); // call super class's constructor with one parameter

    }

    /**
     * Constructor with seven parameters
     *
     * @param name      initialize hobbit'sname
     * @param strength  initialize hobbit's strength
     * @param dexterity initialize hobbit's dexterity
     * @param armour    initialize hobbit's armour
     * @param moxie     initialize hobbit's moxie
     * @param coins     initialize the number of coins the hobbits own
     * @param health    initialize the hobbit's health level
     */
    public Hobbit(String name, int strength, int dexterity, int armour, int moxie, int coins,
                  int health) {
        // call super class constructor with seven parameters
        super(name, strength, dexterity, armour, moxie, coins, health);


    }

    /**
     * Hobbits can steal coins from any Humanoid objects. It can only steal the number of coins which objects
     * own. In addition, dead hobbits can not steal coins.
     *
     * @param target an object of Humanoids, which hobbits can steal money from.
     */
    public void stealing(Humanoid target) {
        int successScore;
        if (getHealth() > 0) { // check if hobbits is alive or dead
            successScore = getDexterity() / 2;
            if (successScore <= target.getCoins()) { // check how many coins can be stolen
                setCoins(getCoins() + successScore);
                target.setCoins(target.getCoins() - successScore);
            } else {
                setCoins(getCoins() + target.getCoins());
                target.setCoins(0);
            }
        } else {
            System.out.println("Dead Hobbits can't steal!");
        }


    }


    /**
     * Override toString() method used to represent hobbits character
     *
     * @return the hobbits' name and other attributes as a String.
     */
    public String toString() {
        return super.toString();
    }

}
