package eu.deltasource.internship.go_fighters.heroes;

import eu.deltasource.internship.go_fighters.RandomNumberGeneratorTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarlordTest {

    /**
     * Tests if the special attack of the class actually works.
     */
    @Test
    void attack() {
        final int minimumAttack = 14;
        final int maximumAttack = 21;
        RandomNumberGeneratorTest randomNumber = new RandomNumberGeneratorTest();
        Hero warlord = new Warlord(randomNumber);
        assertTrue(warlord.attack() <= maximumAttack && warlord.attack() >= minimumAttack);
    }
}