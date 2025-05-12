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

    }
}
