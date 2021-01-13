package org.sla;

public class ArcadeGame extends ElectronicGame {

    private Double RevWithoutInf;
    private Double RevWithInf;

    public ArcadeGame(int releaseDate, String gameTitle, int amountSold, double RevWithoutInf, double RevWithInf) {
        super(releaseDate, gameTitle, amountSold);

        this.RevWithoutInf = RevWithoutInf;
        this.RevWithInf = RevWithInf;
    }

    public Double getRevWithoutInf() {
        return RevWithoutInf;
    }

    public void setRevWithoutInf(Double revWithoutInf) {
        RevWithoutInf = revWithoutInf;
    }

    public Double getRevWithInf() {
        return RevWithInf;
    }

    public void setRevWithInf(Double revWithInf) {
        RevWithInf = revWithInf;
    }

    public String toString() {
        String description = "\"" + this.getGameTitle();
        description = description + " Was released in " + this.getReleaseDate();
        description = description + " It sold" + " " + this.getAmountSold() + " " + "units.";
        description = description + "The revenue without inflation was" + " " + this.getRevWithInf();
        description = description + "The revenue without inflation was" + " " + this.getRevWithoutInf();
        return description;
    }
}
