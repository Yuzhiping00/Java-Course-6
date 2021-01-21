/**
 * This class is a subclass of Human, and it overrides attacks() method and toString() method.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class Fighter extends Human {
    /**
     * Constructor with one parameter
     *
     * @param name initialize a fighter's name
     */
    public Fighter(String name) {
        super(name); // call super class constructor with one parameter

    }

    /**
     * Constructor with seven parameters to set a character of a fighter
     *
     * @param name       initialize a fighter's name
     * @param strength   initialize a fighter's strength
     * @param dexterity  initialize a fighter's dexterity
     * @param armour     initialize a fighter's armour
     * @param moxie      initialize a fighter's moxie
     * @param coins      initialize a fighter's coins amount
     * @param health initialize a fighter's health state
     * @param enemy      initialize an object of Elf which is the enemy of the fighter
     */
    public Fighter(String name, int strength, int dexterity, int armour, int moxie, int coins, int
            health, Elf enemy) {
        super(name, strength, dexterity, armour, moxie, coins, health, enemy);
    }

    /**
     * Override the method attacks() and a fighter can produces twice damage score compared to normal
     * humanoid. Plus, dead fighters can not attack.
     *
     * @param opponent the target which a fighter is attacking
     */
    public void attacks(Humanoid opponent) {
        int damageScore;
        if (getHealth() > 0) {
            if (this.equals(opponent)) {
                System.out.printf("\nHowever, Fighter: %s cannot  attack himself/herself!\n", getName());
            } else {
                damageScore = (getStrength() + getDexterity() + getHealth()) / 3 * 2;
                if (opponent.getArmour() > 1) {
                    opponent.setHealth(opponent.getHealth() - damageScore / opponent.getArmour());
                } else {
                    opponent.setHealth(opponent.getHealth() - damageScore);
                }
            }
        }else {
            System.out.println("Attack and defense cannot be taken when the Humanoid is dead!");
        }


    }

    /**
     * Override toString() method and represent the fighter character
     *
     * @return the representation of a fighter object as a String
     */
    public String toString() {
        return super.toString();
    }

}
