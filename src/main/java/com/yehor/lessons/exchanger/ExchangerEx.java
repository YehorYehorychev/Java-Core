package com.yehor.lessons.exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {

    }
}

enum Action {
    STONE,
    SCISSORS,
    PAPER
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
    }
}
