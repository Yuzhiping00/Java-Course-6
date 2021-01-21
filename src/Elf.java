import java.util.Random;

/**
 * This class is a subclass of Humanoid, and it has its own instance variables and methods.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class Elf extends Humanoid {
    /* declare an object of Hobbit type */
    private Hobbit friend;
    /* declare the clan as a String which an elf belongs to */
    private String clan;
    /* declare the allegiance of an elf as an integer */
    private int allegiance;

    /**
     * Constructor with seven parameters which are used to set up an object of elf
     *
     * @param name       initialize an elf's name
     * @param strength   initialize an elf's strength
     * @param dexterity  initialize an elf's dexterity
     * @param armour     initialize an elf's armour
     * @param moxie      initialize an elf's moxie
     * @param coins      initialize an elf's coins amount
     * @param health     initialize an elf's health state
     * @param allegiance initialize an elf's allegiance
     * @param clan       initialize a clan which an elf belongs to
     * @param friend     initialize a friend of an elf which is a hobbit object
     */
    public Elf(String name, int strength, int dexterity, int armour, int moxie, int coins,
               int health, int allegiance, String clan, Hobbit friend) {
        super(name, strength, dexterity, armour, moxie, coins, health);
        this.friend = friend;
        this.allegiance = allegiance;
        if (clan.equals("forest") || clan.equals("city")) {
            this.clan = clan;
        } else {
            System.out.println("Elf cannot belong to other clan!");
        }
    }

    /**
     * Constructor with one parameter, which is the name of an elf
     *
     * @param name initialize an elf's name
     */
    public Elf(String name) {
        super(name); // call super class constructor with one parameter
        Random random = new Random();
        this.allegiance = random.nextInt(21); // get a random integer from 0-20 for elf's allegiance
        int choice = random.nextInt(2);
        if (choice == 0) { // randomly decide which clan does an elf belongs to
            this.clan = "forest";
        } else {
            this.clan = "city";
        }
        friend = new Hobbit("Jason"); // create a default object of Hobbit as an object's friend
    }

    /**
     * Change an elf's friend to parameter
     *
     * @param friend an object of a Hobbit
     */
    public void setHobbit(Hobbit friend) {
        this.friend = friend;
        System.out.println(friend.getName() + " is "+getName()+"'s new best friend!");
    }

    /**
     * Get the elf's friend which is an object of Hobbit
     *
     * @return an object of Hobbit
     */
    public Hobbit getHobbit() {
        return friend;
    }

    /**
     * Get the allegiance of an elf
     *
     * @return the allegiance of an elf
     */
    public int getAllegiance() {
        return allegiance;
    }

    /**
     * Override toString() method and represent the elf character
     *
     * @return the representation of an elf object as a String
     */
    public String toString() {
        return super.toString() + " { allegiance = " + allegiance + ",\n" +
                "clan = " + clan +
                ", friend = " + friend.getName() + " }";
    }
}