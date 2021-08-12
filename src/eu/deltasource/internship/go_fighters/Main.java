package eu.deltasource.internship.go_fighters;

import eu.deltasource.internship.go_fighters.gameEngine.GameEngine;
import eu.deltasource.internship.go_fighters.heroes.Assassin;
import eu.deltasource.internship.go_fighters.heroes.Monk;

public class Main {

    public static void main(String[] args) {
        Assassin assassin = new Assassin();
        Monk monk = new Monk();

        GameEngine.fight(assassin, monk);
    }
}
