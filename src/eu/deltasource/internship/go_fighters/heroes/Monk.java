package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomGenerator;

public class Monk extends Hero {

    public Monk(RandomGenerator randomNumber) {
        super(randomNumber);
        this.healthPoints = 70;
        this.attackPoints = 8;
        this.armourPoints = 3;
        this.specialDefencePercentage = 0.30;
    }

    /**
     * Calculates how much damage the fighter takes after the class bonuses for defence and
     * calculate how much health the fighter will have after the damage.
     *
     * @param damage takes the value from the other fighter for the attack.
     */
    @Override
    public double defence(double damage) {
        double normalDefence = randomNumber.randomPercentage(80, 120) * armourPoints;
        if (randomNumber.randomPercentage(1, 100) <= specialDefencePercentage) {
            return 0;
        } else if (damage - normalDefence > 0) {
            healthPoints = healthPoints - (damage - normalDefence);
            return damage - normalDefence;
        }
        return 0;
    }
}
