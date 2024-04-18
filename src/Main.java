// Descrizione:
// Si richiede di implementare un'applicazione Java per la gestione di una libreria.
// Si devono utilizzare classi astratte per rappresentare sia i libri che gli autori, con metodi concreti per ottenere informazioni su di essi.
// Gli autori devono avere un nome e una lista di libri associati, mentre i libri devono avere un titolo e uno stato che indica se sono in prestito o meno.
// Si richiede inoltre l'implementazione di un'interfaccia Prestito che contenga i metodi prendiInPrestito() e restituisci(), con la possibilità di lanciare un'eccezione PrestitoException nel caso in cui un libro sia già in prestito.

// Requisiti:

//     Utilizzare almeno una classe astratta per rappresentare gli autori e una per rappresentare i libri.
//     Implementare un'interfaccia Prestito con i metodi prendiInPrestito() e restituisci(), che deve essere implementata dalla classe Libro.
//     Gestire l'eccezione PrestitoException nel caso in cui un libro sia già in prestito quando si tenta di prenderlo in prestito.
//     Utilizzare stream e lambda per operare su collezioni di libri o autori, ad esempio per filtrare i libri di un determinato autore.

// Nota:
// Assicurarsi di gestire correttamente tutte le operazioni relative al prestito dei libri, garantendo che non sia possibile prendere in prestito un libro già in prestito e che sia possibile restituirlo correttamente.
import java.awt.Color;
import java.time.LocalDate;

import model.TextDisplay;
import model.Genre;
import model.Journal;
import model.PeriodicalFrequence;

public class Main {
  public static void main (String [] args){
    TextDisplay textDisplay = new TextDisplay();
    
    // Create your books here
    // Then display them
    Journal p = new Journal("Bollettino economico", 10, Genre.ECONOMY, LocalDate.now(),Color.BLACK, PeriodicalFrequence.DAILY, "La gazzetta");
    Journal p1 = new Journal("Bollettino sportivo", 10, Genre.SPORT, LocalDate.now(), Color.GREEN, PeriodicalFrequence.DAILY,"La gazzetta");
    textDisplay.addText(p);
    textDisplay.addText(p1);

  }
}
