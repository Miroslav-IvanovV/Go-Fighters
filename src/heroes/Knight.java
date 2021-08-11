package heroes;

import gameRules.GameEngine;

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
        double normalAttack = Hero.randomPercentage(80, 120) * attackPoints;
        if (Hero.randomPercentage(1, 100) <= specialAttackPercentage) {
            return normalAttack * 2;
        }
        return normalAttack;
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
