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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String pause(Music music) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String skip(Music music) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String stop(Music music) {
        // TODO Auto-generated method stub
        return null;
    }

}
