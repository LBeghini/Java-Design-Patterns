package com.language.programming.model.states;

import com.language.programming.model.Music;
import com.language.programming.model.MusicState;

public class Pause implements MusicState {

    private static Pause instance = new Pause();

    public static Pause getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "⏸";
    }

    @Override
    public String play(Music music) {
        music.setState(Play.getInstance());
        return "▶️";
    }

    @Override
    public String pause(Music music) {
        return "⚠️ Operation not allowed";
    }

    @Override
    public String skip(Music music) {
        music.setState(Skip.getInstance());
        return "⏭️";
    }

    @Override
    public String stop(Music music) {
        return "⚠️ Operation not allowed";

    }

}
