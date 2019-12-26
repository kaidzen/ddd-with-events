package org.kaidzen.study.meetup.app.events;

public class RegisterSpeechCommandMessage {
    private final String title;
    private final String description;
    private final String urlValue;
    private final String speechType;

    public RegisterSpeechCommandMessage(String title, String description, String urlValue, String speechType) {
        this.title = title;
        this.description = description;
        this.urlValue = urlValue;
        this.speechType = speechType;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrlValue() {
        return urlValue;
    }

    public String getSpeechType() {
        return speechType;
    }
}
