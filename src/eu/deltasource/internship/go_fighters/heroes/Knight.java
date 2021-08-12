package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.utility.Utilities;

public class Knight extends Hero {

    public Knight() {
        this.healthPoints = 100;
        this.attackPoints = 5;
        this.armourPoints = 5;
        this.specialAttackPercentage = 0.10;
        this.specialDefencePercentage = 0.20;
    }

    /**
     * calculates how much damage the fighter would do after the class bonuses.
     *
     * @return the damage that the fighter does.
     */
    @Override
    public double attack() {
        double normalAttack = super.attack();
        if (Utilities.randomPercentage(1, 100) <= specialAttackPercentage) {
            return normalAttack * 2;
        }
        return normalAttack;
    }

    /**
     * Calculates how much damage the fighter takes after the class bonuses for defence and
     * calculate how much health the fighter will have after the damage.
     *
     * @param damage takes the value from the other fighter for the attack.
     */
    @Override
    public void defence(double damage) {
        double normalDefence = Utilities.randomPercentage(80, 120) * armourPoints;
        if (Utilities.randomPercentage(1, 100) <= specialDefencePercentage) {
            return;
        } else if (damage - normalDefence > 0) {
            healthPoints = healthPoints - (damage - normalDefence);
        }
    }
}
