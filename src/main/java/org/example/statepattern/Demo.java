package org.example.statepattern;

import org.example.statepattern.ui.Player;
import org.example.statepattern.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
