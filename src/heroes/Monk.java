package heroes;

import gameRules.GameEngine;

public class Monk extends Hero {

    public Monk() {
        this.healthPoints = 70;
        this.attackPoints = 8;
        this.armourPoints = 3;
        this.specialDefencePercentage = 0.30;
    }

    /**
     * Calculates how much damage the fighter takes after the class bonuses for defence.
     *
     * @param damage takes the value from the other fighter for the attack.
     */
    @Override
    public void defence(double damage) {
        double normalDefence = Hero.randomPercentage(80, 120) * armourPoints;
        if (Hero.randomPercentage(1, 100) <= specialDefencePercentage) {
            return;
        } else if (damage - normalDefence > 0) {
            healthPoints = healthPoints - (damage - normalDefence);
        }
    }
}
