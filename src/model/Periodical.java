package model;

import java.awt.Color;
import java.time.LocalDate;

public abstract class Periodical extends Text{
    private LocalDate releaseDate;
    private PeriodicalFrequence periodicalFreqeunce;

    public Periodical(String title, int numPages, Genre genre, LocalDate releaseDate,Color color,
            PeriodicalFrequence periodicalFreqeunce) {
        super(title, numPages, genre, color);
        this.releaseDate = releaseDate;
        this.periodicalFreqeunce = periodicalFreqeunce;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public PeriodicalFrequence getPeriodicalFreqeunce() {
        return periodicalFreqeunce;
    }

    

}
