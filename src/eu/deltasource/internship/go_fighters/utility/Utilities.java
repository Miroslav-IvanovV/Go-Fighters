package eu.deltasource.internship.go_fighters.utility;

import java.util.Random;

public final class Utilities {

    private Utilities(){

    }

    /**
     * It will create a random percentage between min and max.
     * @param min takes the lower bound.
     * @param max takes the upper bound.
     * @return a random percentage.
     */
    public static double randomPercentage(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return (double) randomNum / 100;
    }

}
