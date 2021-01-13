package org.sla ;

import java.util.ArrayList;

public class ElectronicGame {

    private static ArrayList<ElectronicGame> games;
    private int ReleaseDate;
    private String GameTitle;
    private int AmountSold;

    public ElectronicGame(int releaseDate, String GameTitle, int amountSold) {
        this.ReleaseDate = releaseDate;
        this.GameTitle = GameTitle;
        this.AmountSold = amountSold;

        if (games == null) {
            games = new ArrayList<ElectronicGame>();
        }
        games.add(this);
    }

    public int getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String getGameTitle() {
        return GameTitle;
    }


    public int getAmountSold() {
        return AmountSold;
    }

    public void setAmountSold(int amountSold) {
        AmountSold = amountSold;
    }

    public String toString() {
        String description = "\"" + this.getGameTitle();
        description = description + " Was released in " + this.getReleaseDate();
        return description;
    }

    static void describeAll() {
        games.forEach(film -> {
            System.out.println(film.toString());
        });
    }
}
