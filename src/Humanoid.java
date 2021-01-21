import java.util.Objects;
import java.util.Random;

/**
 * This class is the base class, which provides fields and methods to be inherited by its subclass.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class Humanoid {
    /* declare name of Humanoid as String */
    private final String name;
    /* declare four attributes of Humanoid as integer */
    private int strength;
    private int dexterity;
    private int armour;
    private int moxie;
    /* declare number of coins Humanoid own as integer */
    private int coins;
    /* declare health state of Humanoid as integer */
    private int health;

    /**
     * Constructor with one parameter and initialize all instance variables. Strength, dexterity, armour
     * and moxie are in range from 0 to 20. NumberOfCoins and health are in range from 0-100.
     *
     * @param name initialize a humanoid's name based on parameter
     */
    public Humanoid(String name) {
        Random random = new Random();
        this.name = name;
        this.strength = random.nextInt(21);
        this.dexterity = random.nextInt(21);
        this.armour = random.nextInt(21);
        this.moxie = random.nextInt(21);
        this.coins = random.nextInt(101);
        this.health = random.nextInt(101);
    }

    /**
     * Constructor with seven parameters, which are used to initialize instance variables and check
     * if parameters are out of range.
     *
     * @param name      initialize a humanoid's name
     * @param strength  initialize a humanoid's strength
     * @param dexterity initialize a humanoid's dexterity
     * @param armour    initialize a humanoid's armour
     * @param moxie     initialize a humanoid's moxie
     * @param coins     initialize a humanoid's coins amount
     * @param health    initialize a humanoid's health state
     */
    public Humanoid(String name, int strength, int dexterity, int armour, int moxie, int coins, int
            health) {
        this.name = name;
        if (0 <= strength && strength <= 20) { // check if parameter is out of range
            this.strength = strength;
        } else {
            System.out.println("Parameter for strength out of range!");
        }

        if (0 <= dexterity && dexterity <= 20) {
            this.dexterity = dexterity;
        } else {
            System.out.println("Parameter for dexterity out of range!");
        }

        if (0 <= armour && armour <= 20) {
            this.armour = armour;
        } else {
            System.out.println("Parameter for armour out of range!");
        }
        if (0 <= moxie && moxie <= 20) {
            this.moxie = moxie;
        } else {
            System.out.println("Parameter moxie out of range!");
        }
        if (0 <= coins && coins <= 100) {
            this.coins = coins;
        } else {
            System.out.println("Parameter numOfCoins out of range!");
        }
        if (0 <= health && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Parameter health out of range!");
        }
    }

    /**
     * Get the humanoid's name
     *
     * @return the humanoid's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the humanoid's strength
     *
     * @return the humanoid's strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Get the humanoid's dexterity
     *
     * @return the humanoid's dexterity
     */
    public int getDexterity() {
        return dexterity;
    }


    /**
     * Get the humanoid's armour
     *
     * @return the humanoid's armour
     */
    public int getArmour() {
        return armour;
    }

    /**
     * Get the humanoid's moxie
     *
     * @return the humanoid's moxie
     */
    public int getMoxie() {
        return moxie;
    }

    /**
     * Get the number of coins which humanoid owns
     *
     * @return the number of coins
     */
    public int getCoins() {
        return coins;
    }

    /**
     * Get the humanoid's health state
     *
     * @return the humanoid's health level
     */
    public int getHealth() {
        return health;
    }


    /**
     * Set the numberOfCoins humanoid owns which is in range from 0-100
     *
     * @param coins the number of coins which the humanoid owns
     */
    public void setCoins(int coins) {
        if (0 <= coins && coins <= 100) {
            this.coins = coins;
        }
        if (coins < 0) {
            this.coins = 0;
        }
        if (coins > 100) {
            this.coins = 100;
        }
    }

    /**
     * Set the health of a humanoid which is in range from 0-100
     *
     * @param health the health state of a humanoid
     */
    public void setHealth(int health) {
        if (0 <= health && health <= 100) {
            this.health = health;
        }
        if (health < 0) {
            this.health = 0;
        }
        if (health > 100) {
            this.health = 100;
        }
    }

    /**
     * Increase the point of strength by one at a time, but the value cannot be more than 20
     */
    public void increaseStrength() {
        strength += 1;
        if (strength > 20) {
            this.strength = 20;
        }
    }

    /**
     * Increase the point of dexterity by one at a time, but the value cannot be more than 20
     */
    public void increaseDexterity() {
        dexterity += 1;
        if (dexterity > 20) {
            this.dexterity = 20;
        }
    }

    /**
     * Increase the point of armour by one at a time, but the value cannot be more than 20
     */
    public void increaseArmour() {
        armour += 1;
        if (armour > 20) {
            this.armour = 20;
        }
    }

    /**
     * Increase the point of moxie by one at a time, but the value cannot be more than 20
     */
    public void increaseMoxie() {
        moxie += 1;
        if (moxie > 20) {
            this.moxie = 20;
        }
    }

    /**
     * Reduce the point of strength by one at a time, but the value cannot be less than 0
     */
    public void reduceStrength() {
        strength -= 1;
        if (strength < 0) {
            this.strength = 0;
        }

    }


    /**
     * Reduce the point of dexterity by one at a time, but the value cannot be less than 0
     */
    public void reduceDexterity() {
        dexterity -= 1;
        if (dexterity < 0) {
            this.dexterity = 0;
        }

    }

    /**
     * Reduce the point of armour by one at a time, but the value cannot be less than 0
     */
    public void reduceArmour() {
        armour -= 1;
        if (armour < 0) {
            this.armour = 0;
        }

    }

    /**
     * Reduce the point of moxie by one at a time, but the value cannot be less than 0
     */
    public void reduceMoxie() {
        moxie -= 1;
        if (moxie < 0) {
            this.moxie = 0;
        }

    }

    /**
     * A humanoid can attack any other humanoid, which makes opponent humanoid lose health points.
     * However, dead humanoid can not attack others.
     *
     * @param opponent the target which a humanoid is attacking
     */
    public void attacks(Humanoid opponent) {
        int damageScore;
        if (health > 0) { // check if humanoid is dead or alive
            if (this.equals(opponent)) {
                System.out.printf("\nHowever, Humanoid: %s cannot  attack himself/herself!\n", getName());
            } else {
                damageScore = (strength + dexterity + health) / 3;
                if (opponent.getArmour() > 1) { // compare opponent's armour with 1
                    opponent.setHealth(opponent.getHealth() - damageScore / opponent.getArmour());
                } else {
                    opponent.setHealth(opponent.getHealth() - damageScore);
                }
            }

        } else {
            System.out.println("Attack and defense cannot be taken when the Humanoid is dead!");
        }

    }

    /**
     * override toString() method to present humanoid character
     *
     * @return the representation of the humanoid as a String.
     */
    @Override
    public String toString() {
        if (health <= 0) {
            return getClass().getSimpleName() + " { name= " + name + " [dead]" + ", strength=" + strength +
                    ", dexterity=" + dexterity + ", armour=" + armour + ", moxie=" + moxie +
                    ", coins=" + coins + ", health= " + health + " }";

        }
        return getClass().getSimpleName() + " { name= " + name + " [alive]" + ", strength=" + strength +
                ", dexterity=" + dexterity + ", armour=" + armour + ", moxie=" + moxie +
                ", coins=" + coins + ", health=" + health + " }";

    }

}
