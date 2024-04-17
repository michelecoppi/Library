package model;
//mentre i libri devono avere un titolo e uno stato che indica se sono in prestito o meno.
public abstract class Text {

    private String title;
    private boolean lent;
    private int numPages;
    private Genre genre; 
    

    public Text(String title, int numPages, Genre genre) {
        this.title = title;
        this.numPages = numPages;
        this.genre = genre;
        this.lent = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isLent() {
        return lent;
    }

    public int getNumPages() {
        return numPages;
    }

    public Genre getGenre() {
        return genre;
    }

    
}
