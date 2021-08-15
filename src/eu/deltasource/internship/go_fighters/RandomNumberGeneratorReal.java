package eu.deltasource.internship.go_fighters;

import java.util.Random;

public class RandomNumberGeneratorReal implements RandomGenerator {

    /**
     * It will create a random percentage between min and max.
     *
     * @param min takes the lower bound.
     * @param max takes the upper bound.
     * @return a random percentage.
     */
    public double randomPercentage(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return (double) randomNum / 100;
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
