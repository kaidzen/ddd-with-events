package org.kaidzen.study.meetup.domen.aggregate;

public class Speech {
    private final Title title;
    private final UrlValue urlValue;
    private final String description;
    private final SpeechType speechType;

    public Speech(Title title, UrlValue urlValue, String description, SpeechType speechType) {

        this.title = title;
        this.urlValue = urlValue;
        this.description = description;
        this.speechType = speechType;
    }

    public Title getTitle() {
        return title;
    }

    public UrlValue getUrlValue() {
        return urlValue;
    }

    public String getDescription() {
        return description;
    }

    public SpeechType getSpeechType() {
        return speechType;
    }
}
