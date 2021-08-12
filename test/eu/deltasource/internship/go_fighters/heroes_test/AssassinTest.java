package eu.deltasource.internship.go_fighters.heroes_test;

import eu.deltasource.internship.go_fighters.heroes.Assassin;
import eu.deltasource.internship.go_fighters.heroes.Hero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssassinTest {

    @Test
    void attack() {
        final int minimumAttack = 8;
        final int maximumAttack = 46;
        Hero assassin = new Assassin();
        assertTrue(assassin.attack() <= maximumAttack && assassin.attack() >= minimumAttack);
    }

    @Test
    void getHealthPoints() {
        Assassin assassin = new Assassin();
        assertEquals(50, assassin.getHealthPoints());
    }
}