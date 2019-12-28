package org.kaidzen.study.meetup.app.usecases;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kaidzen.study.meetup.app.IUnitOfWork;
import org.kaidzen.study.meetup.app.events.RegisterSpeechCommandMessage;
import org.kaidzen.study.meetup.domen.aggregate.Speech;
import org.kaidzen.study.meetup.domen.aggregate.SpeechType;
import org.kaidzen.study.meetup.domen.aggregate.Title;
import org.kaidzen.study.meetup.domen.aggregate.UrlValue;
import org.kaidzen.study.meetup.domen.service.SpeechService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RegisterSpeechUseCaseTest {

    private static final String TITLE = "Microservices getting started";
    private static final String DESCRIPTION = "A microservices from the scratch by DDD approach";
    private static final String URL_VALUE = "http://mivroservices-by-ddd.kaidzen.com";
    private static final String SPEECH_TYPE = "2";

    @Mock
    private IUnitOfWork unitOfWork;
    @Mock
    private SpeechService speechService;
    @InjectMocks
    private RegisterSpeechUseCase useCase;

    @Test
    public void test_registered() {
        final Speech speech = new Speech(
                new Title(TITLE),
                new UrlValue(URL_VALUE),
                DESCRIPTION,
                new SpeechType(SPEECH_TYPE));
        when(speechService.create(any(Speech.class))).thenReturn(speech);

        RegisterSpeechCommandMessage registerSpeechCommand = new RegisterSpeechCommandMessage(
                TITLE,
                DESCRIPTION,
                URL_VALUE,
                SPEECH_TYPE
        );

        useCase.handle(registerSpeechCommand);

        verify(speechService).create(isA(Speech.class));
        verify(unitOfWork).commit();
    }
}