package org.example.statepattern.states;

import org.example.statepattern.ui.Player;

public abstract class State {
    Player player;
    State (){
        this.player = player;
    }
    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
