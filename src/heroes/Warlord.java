package heroes;

import gameRules.GameEngine;

public class Warlord extends Hero {

    public Warlord() {
        this.healthPoints = 100;
        this.attackPoints = 5;
        this.armourPoints = 5;
        this.specialAttackPercentage = 0.30;
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
            healthPoints = healthPoints - 5;
            return normalAttack * 3.5;
        }
        return normalAttack;
    }
}
