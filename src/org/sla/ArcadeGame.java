package org.sla;

public class ArcadeGame extends ElectronicGame {

    Double RevWithoutInf;
    Double RevWithInf;

    public ArcadeGame(int releaseDate, String gameTitle, int amountSold, double RevWithoutInf, double RevWithInf) {
        super(releaseDate, gameTitle, amountSold);

        this.RevWithoutInf = RevWithoutInf;
        this. RevWithInf = RevWithInf;
    }
}
