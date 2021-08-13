package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomGenerator;

public class Warlock extends Hero {

    public Warlock(RandomGenerator randomNumber) {
        super(randomNumber);
        this.healthPoints = 100;
        this.attackPoints = 5;
        this.armourPoints = 5;
        this.specialAttackPercentage = 0.40;
    }

    /**
     * calculates how much damage the warlock would do and for how much gonna heal after the class attack bonus.
     *
     * @return the damage that the fighter does and for.
     */
    @Override
    public double attack() {
        double normalAttack = super.attack();
        if (randomNumber.randomPercentage(1, 100) <= specialAttackPercentage) {
            lifeSteal(normalAttack);
            return normalAttack;
        }
        return normalAttack;
    }

    private void lifeSteal(double damage) {
        healthPoints = healthPoints + damage;
    }
}
