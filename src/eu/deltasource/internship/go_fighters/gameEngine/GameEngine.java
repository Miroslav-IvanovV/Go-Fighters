package eu.deltasource.internship.go_fighters.gameEngine;

import eu.deltasource.internship.go_fighters.heroes.Hero;

public class GameEngine {

    /**
     * It plays the fight between the two fighters.
     *
     * @return the winner of the fight.
     */
    public static String fight(Hero firstFighter, Hero secondFighter) {
        while (true) {
            double damage, damageDone;
            damage = firstFighter.attack();
            damageDone = secondFighter.defence(damage);
            System.out.println("player two took " + damageDone + " damage and his current health is "
                    + secondFighter.getHealthPoints());
            if (secondFighter.getHealthPoints() < 0) {
                return "Player one won";
            }

            damage = secondFighter.attack();
            damageDone = firstFighter.defence(damage);
            System.out.println("player one took " + damageDone + " damage and his current health is "
                    + firstFighter.getHealthPoints());
            if (firstFighter.getHealthPoints() < 0) {
                return "player two won";
            }
        }
    }
}
