package org.sla;

public class GameData {

    public static void main(String[] args) {

        ArcadeGame Game1 = new ArcadeGame(1980, "Pac-man", 400000, 3.5, 10.9);
        ConsoleGame Game2 = new ConsoleGame(2018, "Grand Theft Auto V", 20000000, "Action Adventure", "Rockstar North", "Rockstar Games");

    System.out.println(" In"+ " " + Game1.getReleaseDate() + " " +"\"" + Game1.getGameTitle() + "\" was released." + "\" It sold"+ " " + Game1.getAmountSold() + " " + "units to arcades." + "\" With revenue the game made"+ " " + Game1.getRevWithInf() + "." + "\" Without revenue the game made" + " " + Game1.getRevWithoutInf() + "." );
    System.out.println(" In" + " " + Game2.getReleaseDate() + " " + "\"" + Game2.getGameTitle() + " was released." + "It sold"+ " " + Game2.getAmountSold() + " " + "copies." + "\" The game genre was" + " " + Game2.getGenre() + "." + "\" The Developers were" + " " + Game2.getDeveloper() + "." + "\"" + Game2.getPublisher() + " " + "published the game." );
    }
}

