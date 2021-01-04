package org.sla;

public class ConsoleGame extends ElectronicGame {
 String  Genre;
 String  Developer;
 String  Publisher;

    public ConsoleGame(int releaseDate, String gameTitle, int amountSold,String  Genre, String  Developer,String  Publisher) {
        super(releaseDate, gameTitle, amountSold);

        this.Genre = Genre;
        this.Developer = Developer;
        this.Publisher = Publisher;
    }
}
