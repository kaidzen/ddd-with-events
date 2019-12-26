package org.kaidzen.study.meetup.domen.aggregate;

public class Speech {
    private final String title;
    private final String urlValue;
    private final String description;
    private final String speechType;

    public Speech(String title, String urlValue, String description, String speechType) {

        this.title = title;
        this.urlValue = urlValue;
        this.description = description;
        this.speechType = speechType;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlValue() {
        return urlValue;
    }

    public String getDescription() {
        return description;
    }

    public String getSpeechType() {
        return speechType;
    }
}
