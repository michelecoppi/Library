package model;

import java.awt.Color;
import java.time.LocalDate;

public class Comic extends Periodical{
    private boolean colored;
    private boolean manga;

  
    public Comic(String title, int numPages, Genre genre, LocalDate releaseDate, Color color,
            PeriodicalFrequence periodicalFreqeunce, boolean colored, boolean manga) {
        super(title, numPages, genre, releaseDate, color, periodicalFreqeunce);
        this.colored = colored;
        this.manga = manga;
    }

    public boolean isColored() {
        return colored;
    }

    public boolean isManga() {
        return manga;
    }

    

    


}
