package com.pluralsight;

public class SuperApp {
    public static void main(String[] args) {
        //create two superPeoples
        SuperPerson superTaylor= new SuperPerson("Taylor",100);
      SuperHero superKevin= new SuperHero("Kevin",100,25);

      //get health status
        System.out.println(superTaylor.getStatus());
        System.out.println(superKevin.getStatus());
       //take damage
        superTaylor.takeDamage(20);
        superKevin.takeDamage(25);

        //get health
        System.out.println(superTaylor.getStatus());
        System.out.println(superKevin.getStatus());

        //Make the super peoples fight each other
        superTaylor.fight(superKevin);
        superKevin.fight(superTaylor);

        //get health
        System.out.println(superTaylor.getStatus());
        System.out.println(superKevin.getStatus());

        // Second fight: Blaze vs Shadow
        SuperHero hero = new SuperHero("Alex", 100, 20);
        SuperVillain villain = new SuperVillain("Chris", 80, 15, "Rule the world");

        villain.useRage();     // Boost attack
        villain.fight(hero);   // Attack the hero
        villain.useHeal();     // Heal up

        System.out.println(hero.getStatus());
        System.out.println(villain.getStatus());
        /// //////////////////////////////////////////////////////////

        System.out.println(" Class assignment");
        //create a hero object with a name, health, and power level
        SuperHero superhero = new SuperHero("Floki",100,20);

        //create a villain object with a name, health, and evilness

        SuperVillain supperVillain =new SuperVillain("Ragnar",100,30," Rule the world ");

        //DISPLAY AN INTRO MESSAGE

        System.out.println("The battle between " + superhero.name + " and " + supperVillain.name + " begins! ");

        //show the starting status of both characters
        System.out.println(superhero.getStatus());
        System.out.println(supperVillain.getStatus());

        //Loop while both the hero and villain are still alive
        while (superhero.isAlive() && supperVillain.isAlive()){
            //indicate the hero turn
            System.out.println("it's " + superhero.name + "'s turn");

            //have the hero fight the villain
            superhero.fight(supperVillain);
            //SHOW THE VILLAIN'S UPDATE STATUS

            System.out.println(supperVillain.getStatus());

            //if the villain is no longer alive break the loop
            if (!supperVillain.isAlive()){
                System.out.println(supperVillain.name + "has been defeated");
                break;
            }
            //indicate the villains turn
            System.out.println("it's " + supperVillain.name + "'s turn");

            //have the villain fight the hero

            supperVillain.fight(superhero);

            //show the hero updated status

            System.out.println(superhero.getStatus());

        }
        //End the loop
        System.out.println("The battle is over!");

        //if the hero is still alive,announce the hero as the winner

        if(superhero.isAlive()){
            System.out.println(superhero.name + " is the winner");
        }else {
            System.out.println(supperVillain.name + " is the winner");
        }

    }
}
