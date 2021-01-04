package org.sla ;

public class ElectronicGame {

    int ReleaseDate;
    String GameTitle;
    int AmountSold;

    public ElectronicGame(int releaseDate, String GameTitle, int amountSold) {
        this.ReleaseDate = releaseDate;
        this.GameTitle = GameTitle;
        this.AmountSold = amountSold;

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

}
