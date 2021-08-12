package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.utility.Utilities;

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
        return Utilities.randomPercentage(80, 120) * attackPoints;
    }

    /**
     * Calculates how much damage the fighter takes after the resistance and
     * calculate how much health the fighter will have after the damage.
     *
     * @param damage takes the value from the attack.
     */
    public void defence(double damage) {
        double resist = Utilities.randomPercentage(80, 120) * armourPoints;
        if (resist < damage) {
            healthPoints = healthPoints - (damage - resist);
        }
    }
}
