package model;

import java.awt.*;

public class Book extends Text {
    private final Color coverColor;
    private final boolean pictures;

    public Book(String title, int numPages, Genre genre, Color coverColor, boolean pictures) {
        super(title, numPages, genre);
        this.coverColor = coverColor;
        this.pictures = pictures;
    }

    public Color getCoverColor() {
        return coverColor;
    }

    public boolean containsPictures() {
        return pictures;
    }
}
