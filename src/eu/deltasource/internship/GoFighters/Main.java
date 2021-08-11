package eu.deltasource.internship.GoFighters;

import gameRules.GameEngine;
import heroes.Assassin;
import heroes.Monk;

public class Main {

    public static void main(String[] args) {
        Assassin assassin = new Assassin();
        Monk monk = new Monk();

        GameEngine game1 = new GameEngine(assassin, monk);
    }
}
