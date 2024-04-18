package model;

import java.util.*;
import java.util.stream.Collectors;

public class TextRepository {
    //non vogliamo testi duplicati
    private final List<Text> textList;

    public TextRepository() {
        this.textList = new ArrayList<>();
    }

    public void addText(Text t) {
        //TODO fai il controllo per evitare testi duplicati (titolo e genere)
        textList.add(t);
    }

    public Optional<Text> findText(String textName) {
        List<Text> found = textList.stream().filter(t -> t.getTitle().equals(textName)).collect(Collectors.toList());
        if (found.isEmpty()) {
            return Optional.empty();
        }
        //dobbiamo controllare che in caso positivo ci sia un unico elemento
        return Optional.of(found.remove(0));
    }

    public Optional<Text> findText(Text text) {
        List<Text> found = textList.stream().filter(t -> t.equals(text)).collect(Collectors.toList());
        if (found.isEmpty()) {
            return Optional.empty();
        }
        //dobbiamo controllare che in caso positivo ci sia un unico elemento
        return Optional.of(found.remove(0));
    }





    //TODO fare le rimozioni

    /*
    public void removeText(String t) {
        //TODO fai il controllo per evitare testi duplicati (titolo e genere)
        textList.add(t);
    }



    public void removeText(Text t) {
        //TODO fai il controllo per evitare testi duplicati (titolo e genere)
        textList.add(t);
    }

     */
}
