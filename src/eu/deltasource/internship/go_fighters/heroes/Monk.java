package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.utility.Utilities;

public class Monk extends Hero {

    public Monk() {
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
    public void defence(double damage) {
        double normalDefence = Utilities.randomPercentage(80, 120) * armourPoints;
        if (Utilities.randomPercentage(1, 100) <= specialDefencePercentage) {
            return;
        } else if (damage - normalDefence > 0) {
            healthPoints = healthPoints - (damage - normalDefence);
        }
    }
}
