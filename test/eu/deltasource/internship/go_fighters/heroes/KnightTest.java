package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomNumberGeneratorTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    /**
     * Tests if the special attack of the class actually works.
     */
    @Test
    void attack() {
        final int minimumAttack = 8;
        final int maximumAttack = 12;
        RandomNumberGeneratorTest randomNumber = new RandomNumberGeneratorTest();
        Hero knight = new Knight(randomNumber);
        assertTrue(knight.attack() <= maximumAttack && knight.attack() >= minimumAttack);
    }

    /**
     * Tests if the special defence of the class actually works.
     */
    @Test
    void defence() {
        int testDamage = 100;
        RandomNumberGeneratorTest randomNumber = new RandomNumberGeneratorTest();
        Hero knight = new Knight(randomNumber);
        assertTrue(0 == knight.defence(testDamage));
    }
}