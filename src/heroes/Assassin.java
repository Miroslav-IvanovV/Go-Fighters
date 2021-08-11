package heroes;

import gameRules.GameEngine;

public class Assassin extends Hero {

    public Assassin() {
        this.healthPoints = 50;
        this.attackPoints = 9;
        this.armourPoints = 3;
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
            return normalAttack * 3;
        }
        return normalAttack;
    }
}
