/**
 * This is the main class, which is used to test different objects' abilities and how they can interact
 * to change the relevant attributes.
 *
 * @author Zhiping Yu  Student number 000822513   Date 2020,07,21
 */
public class FakeWorld {
    /**
     * This is the main program
     *
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("\nCreate two Hobbits\n");
        Hobbit h1 = new Hobbit("Bion");
        Hobbit h2 = new Hobbit("Azog", 10, 12, 2, 15, 30, 15);
        System.out.println(h1);
        System.out.println(h2);
        System.out.printf("\n%s wants to attacks himself/herself!", h1.getName());
        h1.attacks(h1);
        System.out.println(h1);
        System.out.println();
        h2.reduceStrength();
        h2.reduceDexterity();
        h2.reduceArmour();
        h2.reduceMoxie();
        System.out.println("\nAfter lowering attributes: \n"+ h2);
        System.out.printf("\n%s steals from %s\n\n", h1.getName(), h2.getName());
        h1.stealing(h2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println("\n**************************************************************************");
        System.out.println("\nCreate two Elves \n");
        Elf elf1 = new Elf("Kymil");
        Elf elf2 = new Elf("Gael", 12, 9, 4, 14, 23, 10, 15,
                "forest", h1);

        System.out.println(elf1);
        System.out.printf("\nThe allegiance of %s is : %d \n\n", elf1.getName(),elf1.getAllegiance());
        System.out.println(elf2);
        System.out.printf("\n%s is %s's friend\n",elf2.getHobbit().getName(), elf2.getName());
        System.out.printf("\n%s changes his best friend\n\n", elf2.getName());
        elf2.setHobbit(h2);
        System.out.println(elf2);
        System.out.printf("\n\n%s steals from %s\n", h2.getName(), elf2.getName());
        h2.stealing(elf2);
        System.out.println(elf2);
        System.out.println("\n*****************************************************************************");
        System.out.println("\nCreate two Humans\n");
        Human human1 = new Human("Robert");
        Human human2 = new Human("Thomas", 10, 14, 3, 14, 40, 12, elf2);
        System.out.println(human1);
        System.out.println(human2);
        System.out.printf("\n\nThe enemy of %s is %s\n\n",human2.getName(),human2.getElf().getName());
        System.out.printf("\n%s attacks %s\n\n", human1.getName(), elf2.getName());
        human1.attacks(elf2);
        System.out.println(elf2);
        System.out.printf("\n%s steals from %s\n\n", h2.getName(), human2.getName());
        h2.stealing(human2);
        System.out.println(h2);
        System.out.println(human2);
        System.out.println("\n**************************************************************************************");
        System.out.println("\nCreate two Fighters\n");
        Fighter f1 = new Fighter("Eloise");
        Fighter f2 = new Fighter("Duncan", 15, 16, 10, 12, 80, 15, elf1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.printf("\n%s attacks %s \n\n", f1.getName(), f2.getName());
        f1.attacks(f2);
        System.out.println(f2);
        System.out.printf("\n%s steals %s!\n\n", h1.getName(), f2.getName());
        h1.stealing(f2);
        System.out.println(f2);
        System.out.printf("\n\n%s wants to attack himself/ herself (but not really)!", f1.getName());
        f1.attacks(f1);
        System.out.println(f1);
        System.out.println("\n**************************************************************************************");
        System.out.println("\nCreate two Wizards\n");
        Wizard w1 = new Wizard("Lorwen");
        Wizard w2 = new Wizard("Gandulf", 10, 12, 4, 12, 60,
                12, 16, elf2);
        System.out.println(w1);
        System.out.println(w2);
        System.out.printf("\n\nThe moxie of %s is %d\n\n", w2.getName(),w2.getMoxie());
        w2.increaseArmour();
        w2.increaseDexterity();
        w2.increaseStrength();
        w2.increaseMoxie();
        System.out.println("\nAfter increasing the attributes: \n\n"+ w2);
        System.out.printf("\n%s heals %s\n\n", w2.getName(), human2.getName());
        w2.healing(human2);
        System.out.println(w2);
        System.out.println(human2);

    }
}
