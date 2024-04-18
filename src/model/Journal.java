package model;

import java.time.LocalDate;

public class Journal extends Periodical {
    private final String researchTopic;


    public Journal(String title, int numPages, Genre genre, LocalDate releaseDate,
            PeriodicalFrequence periodicalFreqeunce, String researchTopic) {
        super(title, numPages, genre, releaseDate, periodicalFreqeunce);
        this.researchTopic = researchTopic;
    }


    public String getResearchTopic() {
        return researchTopic;
    }

    
}
