package com.language.programming.model;

public interface MusicState {

    String getState();

    String play(Music music);

    String pause(Music music);

    String skip(Music music);

    String stop(Music music);
}
