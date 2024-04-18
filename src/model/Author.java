package model;

import java.time.LocalDate;

public class Author {
    private final String fisrtname;
    private final String lastname;
    private final LocalDate birthDate;
    private final TextRepository textRepository;

    public Author(String fisrtname, String lastname, LocalDate birthDate, TextRepository textRepository) {
        this.fisrtname = fisrtname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.textRepository = textRepository;
    }

    public String getFisrtname() {
        return fisrtname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

}
