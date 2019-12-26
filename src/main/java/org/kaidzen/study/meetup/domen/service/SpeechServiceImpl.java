package org.kaidzen.study.meetup.domen.service;

import org.kaidzen.study.meetup.domen.aggregate.Speech;
import org.kaidzen.study.meetup.domen.repository.SpeechRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpeechServiceImpl implements SpeechService {

    private final SpeechRepository speechRepository;

    @Autowired
    public SpeechServiceImpl(SpeechRepository speechRepository) {
        this.speechRepository = speechRepository;
    }

    @Override
    public Speech create(Speech speech) {
        return speechRepository.save(speech);
    }
}
