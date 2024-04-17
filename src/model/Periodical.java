package model;

import java.time.LocalDate;

public abstract class Periodical extends Text{
    private LocalDate releaseDate;
    private PeriodicalFrequence periodicalFreqeunce;

    public Periodical(String title, int numPages, Genre genre, LocalDate releaseDate,
            PeriodicalFrequence periodicalFreqeunce) {
        super(title, numPages, genre);
        this.releaseDate = releaseDate;
        this.periodicalFreqeunce = periodicalFreqeunce;
    }

    

}
