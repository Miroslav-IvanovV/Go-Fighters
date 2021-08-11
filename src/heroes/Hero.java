package heroes;

import gameRules.GameEngine;

import java.util.Random;

public abstract class Hero {

    protected double healthPoints;
    protected double attackPoints;
    protected double armourPoints;
    protected double specialAttackPercentage;
    protected double specialDefencePercentage;

    public double getHealthPoints() {
        return healthPoints;
    }

    /**
     * @return the damage that fighter does
     */
    public double attack() {
        return Hero.randomPercentage(80, 120) * attackPoints;
    }

    /**
     * Calculates how much damage the fighter takes after the resistance.
     *
     * @param damage takes the value from the attack.
     */
    public void defence(double damage) {
        double resist = Hero.randomPercentage(80, 120) * armourPoints;
        if (resist < damage) {
            healthPoints = healthPoints - (damage - resist);
        }
    }

    /**
     * @param min takes the lower bound.
     * @param max takes the upper bound.
     * @return a random percentage.
     */
    public static double randomPercentage(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return (double) randomNum / 100;
    }

}
