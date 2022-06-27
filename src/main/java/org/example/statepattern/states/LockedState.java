package org.example.statepattern.states;

import org.example.statepattern.ui.Player;

public class LockedState extends State {
    LockedState(Player player) {
        super();
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        return null;
    }

    @Override
    public String onPlay() {
        return null;
    }

    @Override
    public String onNext() {
        return null;
    }

    @Override
    public String onPrevious() {
        return null;
    }
}
