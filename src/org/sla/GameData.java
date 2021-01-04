package org.sla;

public class GameData {

    public static void main(String[] args) {

        ArcadeGame Game1 = new ArcadeGame(1980, "Pac-man", 400000, 3.5, 10.9);
        ConsoleGame Game2 = new ConsoleGame(2018, "Grand Theft Auto V", 20000000, "Action Adventure", "Rockstar North", "Rockstar Games");

    System.out.println("\" In" + Game1.ReleaseDate + "\"" + Game1.GameTitle + "\" was released." + "\" It sold" + Game1.AmountSold + "units to arcades." + "\" With revenue the game made" + Game1.RevWithInf + "." + "\" Without revenue the game made" + Game1.RevWithoutInf + "." );
    System.out.println("\" In" + Game2.ReleaseDate + "\"" + Game2.GameTitle + "\" was released." + "\" It sold" + Game2.AmountSold + "copies." + "\" The game genre was" + Game2.Genre + "." + "\" The Developers were" + Game2.Developer + "." + "\"" + Game2.Publisher + "published the game." );
    }
}

