package eu.deltasource.internship.go_fighters;

import eu.deltasource.internship.go_fighters.gameEngine.GameEngine;
import eu.deltasource.internship.go_fighters.heroes.Assassin;
import eu.deltasource.internship.go_fighters.heroes.Knight;
import eu.deltasource.internship.go_fighters.heroes.Monk;

public class Main {

    public static void main(String[] args) {
        RandomNumberGeneratorReal randomNumber = new RandomNumberGeneratorReal();
        Assassin assassin = new Assassin(randomNumber);
        Knight knight = new Knight(randomNumber);

        System.out.println(GameEngine.fight(assassin, knight));
    }
}
