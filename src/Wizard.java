import java.util.Random;

/**
 * This class is a subclass of Human, and it overrides toString() method and has other unique methods.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class Wizard extends Human {
    /* the magic rate of a wizard as an integer */
    private int magicRate;

    /**
     * Constructor with one parameter which is used to provide a wizard name
     *
     * @param name initialize a wizard's name
     */
    public Wizard(String name) {
        super(name); // call super class constructor
        Random random = new Random();
        this.magicRate = random.nextInt(21); // randomly obtain the magic rate of a wizard
    }

    /**
     * Constructor with seven parameters which are used to set up an object of a wizard
     *
     * @param name       initialize a wizard's name
     * @param strength   initialize a wizard's strength
     * @param dexterity  initialize a wizard's dexterity
     * @param armour     initialize a wizard's armour
     * @param moxie      initialize a wizard's moxie
     * @param coins      initialize a wizard's coins amount
     * @param health initialize a wizard's health state
     * @param magicRate  initialize a wizard's magic rate
     * @param enemy      initialize an enemy of a wizard which is an object of Elf
     */
    public Wizard(String name, int strength, int dexterity, int armour, int moxie, int coins, int
            health, int magicRate, Elf enemy) {
        super(name, strength, dexterity, armour, moxie, coins, health, enemy);
        if (0 <= magicRate && magicRate <= 20) { // check if magic rate value is out of range
            this.magicRate = magicRate;
        } else {
            System.out.println("Parameter of magicRate is out of range!");
        }
    }

    /**
     * Heal the other Humanoid object which will produce helath boost points for the sick humanoid, but the
     * wizard who cast a spell will lose 3 poins from its magic rate.
     *
     * @param patient an object of Humanoid, which can be healed by a spell
     */
    public void healing(Humanoid patient) {
        int healthBoostScore;
        if (getHealth() > 0 && magicRate > 0) { // check if wizard is able to cast a spell or not
            healthBoostScore = magicRate / 2;
            patient.setHealth(patient.getHealth() + healthBoostScore);
            setMagicRate(magicRate-3);

        } else {
            System.out.println("Dead Wizards or Wizards with magic rate is 0 or less cannot heal!");
        }
    }

    /**
     * Get the magic rate of a wizard
     *
     * @return the magic rate of a wizard as an integer
     */
    public int getMagicRate() {
        return magicRate;
    }

    /**
     * Change the magic rate of a wizard
     *
     * @param magicRate the magic rate of a wizard
     */
    private void setMagicRate(int magicRate) {
        if (0 <= magicRate && magicRate <= 20) { // check if the magic rate of a wizard is out of range
            this.magicRate = magicRate;
        } else {
            System.out.println("Parameter for magicRate is out of range!");
        }
    }

    /**
     * Override toString() method and represent the wizard character
     *
     * @return the representation of a wizard object as a String
     */
    public String toString() {
        return super.toString() + "\n" + " { magicRate = " + getMagicRate() + " }";
    }
}
