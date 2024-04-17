package model;

import java.time.LocalDate;

public class Journal extends Periodical{
    private String editorialBoardName;

   

    public Journal(String title, int numPages, Genre genre, LocalDate releaseDate,
            PeriodicalFrequence periodicalFreqeunce, String editorialBoardName) {
        super(title, numPages, genre, releaseDate, periodicalFreqeunce);
        this.editorialBoardName = editorialBoardName;
    }



    public String getEditorialBoardName() {
        return editorialBoardName;
    }

    
}
