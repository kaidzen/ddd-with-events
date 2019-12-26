package org.kaidzen.study.meetup.app;

public interface CommandHandler<T extends Command> {

    Runnable handle(T message);
}
