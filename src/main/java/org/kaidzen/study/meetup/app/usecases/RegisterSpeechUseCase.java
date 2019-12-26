package org.kaidzen.study.meetup.app.usecases;

import org.kaidzen.study.meetup.app.IUnitOfWork;
import org.kaidzen.study.meetup.app.events.RegisterSpeechCommandMessage;
import org.kaidzen.study.meetup.domen.aggregate.Speech;
import org.kaidzen.study.meetup.domen.service.SpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class RegisterSpeechUseCase implements IRegisterSpeechUseCase {

    private final IUnitOfWork unitOfWork;
    private final SpeechService speechService;

    @Autowired
    public RegisterSpeechUseCase(IUnitOfWork unitOfWork, SpeechService speechService) {
        this.unitOfWork = unitOfWork;
        this.speechService = speechService;
    }

    @Override
    public void handle(RegisterSpeechCommandMessage command) {
        if (Objects.isNull(command)) {
            throw new IllegalArgumentException("Command should be presented!");
        }
        Speech speech = new Speech(
                command.getTitle(),
                command.getUrlValue(),
                command.getDescription(),
                command.getSpeechType()
        );
        speechService.create(speech);
        unitOfWork.commit();
    }
}
