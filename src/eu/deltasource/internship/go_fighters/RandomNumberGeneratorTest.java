package eu.deltasource.internship.go_fighters;

import java.util.Random;

public class RandomNumberGeneratorTest implements RandomGenerator {

    /**
     * It will return 0 so the special attack or defence will be activated in the unit test.
     */
    public double randomPercentage(int min, int max) {
        return 0;
    }

    /**
     * @return a random percentage between 80 and 120.
     */
    public double randomPercentageBetween80And120() {
        int min = 80, max = 120;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return (double) randomNum / 100;
    }
}
