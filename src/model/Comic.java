package model;

import java.time.LocalDate;

public class Comic extends Periodical {
    private final boolean colored;
    private final boolean manga;

  
    public Comic(String title, int numPages, Genre genre, LocalDate releaseDate,
            PeriodicalFrequence periodicalFreqeunce, boolean colored, boolean manga) {
        super(title, numPages, genre, releaseDate, periodicalFreqeunce);
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
