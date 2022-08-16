package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    @Autowired
    private final GamingConsole gc;

    public GameRunner(GamingConsole gc) {
        this.gc = gc;
    }

    public void runGame() {
        gc.up();
        gc.down();
        gc.left();
        gc.right();
        gc.right();
    }

}
