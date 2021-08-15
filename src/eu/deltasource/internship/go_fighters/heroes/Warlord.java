package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomGenerator;

public class Warlord extends Hero {

    public Warlord(RandomGenerator randomNumber) {
        super(randomNumber);
        this.randomNumber = randomNumber;
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
        double normalAttack = super.attack();
        if (randomNumber.randomPercentage(1, 100) <= specialAttackPercentage) {
            healthPoints = healthPoints - 5;
            return normalAttack * 3.5;
        }
        return normalAttack;
    }
}
