package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.utility.Utilities;

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
        double normalAttack = super.attack();
        if (Utilities.randomPercentage(1, 100) <= specialAttackPercentage) {
            return normalAttack * 3;
        }
        return normalAttack;
    }
}
