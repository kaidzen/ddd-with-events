package org.kaidzen.study.meetup.domen.repository;

import org.kaidzen.study.meetup.domen.aggregate.Speech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeechRepository extends JpaRepository<Speech, Long> {

    Speech save(Speech entity);
}
