package model;

import java.awt.Color;
import java.time.LocalDate;

public class Journal extends Periodical{
    private String editorialBoardName;


    public Journal(String title, int numPages, Genre genre, LocalDate releaseDate, Color color,
            PeriodicalFrequence periodicalFreqeunce, String editorialBoardName) {
        super(title, numPages, genre, releaseDate, color, periodicalFreqeunce);
        this.editorialBoardName = editorialBoardName;
    }


    public String getEditorialBoardName() {
        return editorialBoardName;
    }

    
}
