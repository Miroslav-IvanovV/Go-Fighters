package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomGenerator;

public abstract class Hero {

    protected RandomGenerator randomNumber;
    protected double healthPoints = 100;
    protected double attackPoints = 10;
    protected double armourPoints = 5;
    protected double specialAttackPercentage;
    protected double specialDefencePercentage;

    public Hero(RandomGenerator randomNumber) {
        this.randomNumber = randomNumber;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    /**
     * @return the damage that fighter does
     */
    public double attack() {
        return randomNumber.randomPercentageBetween80And120() * attackPoints;
    }

    /**
     * Calculates how much damage the fighter takes after the resistance and
     * calculate how much health the fighter will have after the damage.
     *
     * @param damage takes the value from the attack.
     */
    public double defence(double damage) {
        double resist = randomNumber.randomPercentageBetween80And120() * armourPoints;
        if (resist < damage) {
            healthPoints = healthPoints - (damage - resist);
            return damage - resist;
        }
        return 0;
    }
}
