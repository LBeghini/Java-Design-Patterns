package com.language.programming.model.states;

import com.language.programming.model.Music;
import com.language.programming.model.MusicState;

public class Play implements MusicState {

    private static Play instance = new Play();

    public static Play getInstance() {
        return instance;
    }

    @Override
    public String getState() {
        return "▶️";
    }

    @Override
    public String play(Music music) {
        return "⚠️ Operation not allowed";
    }

    @Override
    public String pause(Music music) {
        music.setState(Pause.getInstance());
        return "⏸";
    }

    @Override
    public String skip(Music music) {
        music.setState(Skip.getInstance());
        return "⏭️";
    }

    @Override
    public String stop(Music music) {
        music.setState(Stop.getInstance());
        return "⏹️";
    }

}
