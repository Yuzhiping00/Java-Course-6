/**
 * This class is a subclass of Humanoid and it has its own instance variable and override toString() method.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class Human extends Humanoid {
    /* declare an instance variable of Elf type */
    private Elf enemy;

    /**
     * Constructor with one parameter, which the is name of the human
     *
     * @param name initialize a human's name as a String
     */
    public Human(String name) {
        super(name); // call super class Humanoid
        enemy = new Elf("Levis"); // create a default object of Elf
    }

    /**
     * Constructor with seven parameters to set a character of a human
     *
     * @param name      initialize a human's name
     * @param strength  initialize a human's strength
     * @param dexterity initialize a human's dexterity
     * @param armour    initialize a human's armour
     * @param moxie     initialize a human's moxie
     * @param coins     initialize a human's coins amount
     * @param health    initialize a human's health state
     * @param enemy     initialize an object of Elf which is the enemy of the human
     */
    public Human(String name, int strength, int dexterity, int armour, int moxie, int coins,
                 int health, Elf enemy) {
        super(name, strength, dexterity, armour, moxie, coins, health);
        this.enemy = enemy;
    }

    /**
     * Get an Elf object as the human's enemy
     *
     * @return an object of Elf
     */
    public Elf getElf() {
        return enemy;
    }


    /**
     * Override toString() method and represent the human character
     *
     * @return the representation of a human object as a String
     */
    public String toString() {
        return super.toString() + " { enemy = " + enemy.getName() + " }";
    }
}
