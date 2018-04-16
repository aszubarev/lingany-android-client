package ru.tp.lingany.lingany.sdk.categories;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import ru.tp.lingany.lingany.sdk.Api;
import ru.tp.lingany.lingany.sdk.reflections.Reflection;


public class Category implements Serializable {

    private UUID id;

    private String href;

    private String title;

    private Reflection reflection;

    private List<String> randomWords;

    public Category(UUID id, String href, String title, Reflection reflection) {
        this.id = id;
        this.href = href;
        this.title = title;
        this.reflection = reflection;
        fillrandomWords();
    }

    public UUID getId() {
        return id;
    }

    public String getHref() {
        return href;
    }

    public String getTitle() {
        return title;
    }

    public Reflection getReflection() {
        return reflection;
    }

    public String getRandomWords() {
//        < 3 for having some time
        if (randomWords.size() < 3) {
            fillrandomWords();
        }
        String word = randomWords.get(0);
        randomWords.remove(0);
        return word;
    }

    private void fillrandomWords() {
        Api.getInstance().categories().getRandomWords(this.reflection.getId(), getRandomWordsListener);
    }



}
