package eu.deltasource.internship.go_fighters.gameEngine;

import eu.deltasource.internship.go_fighters.heroes.Hero;

public class GameEngine {

    /**
     * It plays the fight between the two fighters.
     */
    public static void fight(Hero firstFighter, Hero secondFighter) {
        while (true) {
            double damage;
            damage = firstFighter.attack();
            secondFighter.defence(damage);
            if (secondFighter.getHealthPoints() < 0) {
                System.out.println("player one won");
                break;
            }

            damage = secondFighter.attack();
            firstFighter.defence(damage);
            if (firstFighter.getHealthPoints() < 0) {
                System.out.println("player two won");
                break;
            }

        }
    }
}
