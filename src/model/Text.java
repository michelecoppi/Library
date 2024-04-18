package model;

//mentre i libri devono avere un titolo e uno stato che indica se sono in prestito o meno.
public abstract class Text {

    private final String title;
    private boolean lent;
    private final int numPages;
    private final Genre genre;

    //FIXME aggiungi un codice identificativo -> nell'equals si controlla solo l'id
    

    public Text(String title, int numPages, Genre genre) {
        this.title = title;
        this.numPages = numPages;
        this.genre = genre;
        this.lent = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Text t = (Text) obj;
        //due testi sono uguali se hanno stesso titolo e stesso genere
        return this.title.equals(t.title) && this.genre.equals(t.genre);
    }

    @Override
    public int hashCode() {
        return title.hashCode() * 11 * genre.hashCode();
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
