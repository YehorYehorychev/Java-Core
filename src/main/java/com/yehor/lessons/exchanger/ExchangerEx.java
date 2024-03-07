package com.yehor.lessons.exchanger;

import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {

    public static void main(String[] args) {

    }
}

enum Action {
    STONE, SCISSORS, PAPER
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

    private void whoWins(Action myAction, Action friendAction) {
        if ((myAction == Action.STONE && friendAction == Action.SCISSORS) || (myAction == Action.SCISSORS && friendAction == Action.PAPER) || (myAction == Action.PAPER && friendAction == Action.STONE)) {
            System.out.println(name + " Wins!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
