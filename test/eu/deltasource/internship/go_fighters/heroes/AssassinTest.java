package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomNumberGeneratorTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssassinTest {

    /**
     * Tests if the special attack of the class actually works.
     */
    @Test
    void attack() {
        final int minimumAttack = 24;
        final int maximumAttack = 36;
        RandomNumberGeneratorTest randomNumber = new RandomNumberGeneratorTest();
        Hero assassin = new Assassin(randomNumber);
        assertTrue(assassin.attack() <= maximumAttack && assassin.attack() >= minimumAttack);
    }
}