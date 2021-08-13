package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomGenerator;

public class Warrior extends Hero {

    public Warrior(RandomGenerator randomNumber) {
        super(randomNumber);
        this.healthPoints = 150;
        this.attackPoints = 10;
        this.armourPoints = 6;
    }
}
