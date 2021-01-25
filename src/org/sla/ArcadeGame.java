package org.sla;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
        description = description + "The revenue without inflation was" + " " + this.getRevWithoutInf();
        description = description + "The revenue with inflation was" + " " + this.getRevWithInf();
        return description;
    }
        static void read(String dataFilePath) {
            // try to create Scanner
            Scanner scanner = null;
            try {
                File file = new File(dataFilePath);
                scanner = new Scanner(file);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Problem opening file: " + dataFilePath);
            }
            if (scanner == null) {
                // I can't scan without a scanner, so we're done.
                return;
            }

            // Read from each line in data file until there are no more
            while (scanner.hasNext()) {
                String next = scanner.nextLine();
                // Construct a new scanner for each to get its tokens
                Scanner lineScanner = new Scanner(next);
                // Data tokens are separated by tabs
                lineScanner.useDelimiter("\t");


                String title = lineScanner.next();
                int year = lineScanner.nextInt();
                String next1 = lineScanner.next().trim();
                int unitssold = Integer.parseInt(next1);
                long revwithoutint = lineScanner.nextLong();
                long revwithint = lineScanner.nextLong();

                ElectronicGame games = new ArcadeGame( year, title, unitssold, revwithoutint, revwithint);
                System.out.println(games);
            }
    }
}
