package org.kaidzen.study.meetup.app.usecases;

import org.kaidzen.study.meetup.app.events.RegisterSpeechCommandMessage;

public interface IRegisterSpeechUseCase {

    void handle(RegisterSpeechCommandMessage command);
}
