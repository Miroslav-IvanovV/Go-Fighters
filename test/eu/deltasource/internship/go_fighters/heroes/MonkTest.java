package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomNumberGeneratorTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonkTest {

    /**
     * Tests if the special defence of the class actually works.
     */
    @Test
    void defence() {
        int testDamage = 100;
        RandomNumberGeneratorTest randomNumber = new RandomNumberGeneratorTest();
        Hero monk = new Monk(randomNumber);
        assertTrue(0 == monk.defence(testDamage));
    }
}