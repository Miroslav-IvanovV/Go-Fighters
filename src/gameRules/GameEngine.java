package gameRules;

import heroes.Hero;

import java.util.Random;

public class GameEngine {

    public GameEngine(Hero playerOne, Hero playerTwo) {
        fight(playerOne, playerTwo);
    }

    /**
     * It plays the fight between the two fighters.
     */
    public void fight(Hero firstFighter, Hero secondFighter) {
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
