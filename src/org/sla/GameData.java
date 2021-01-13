package org.sla;

public class GameData {

    public static void main(String[] args) {

        ArcadeGame Game1 = new ArcadeGame(1980, "Pac-man", 400000, 3.5, 10.9);
        ConsoleGame Game2 = new ConsoleGame(2018, "Grand Theft Auto V", 20000000, "Action Adventure", "Rockstar North", "Rockstar Games");

        ElectronicGame.describeAll();
    }
}

