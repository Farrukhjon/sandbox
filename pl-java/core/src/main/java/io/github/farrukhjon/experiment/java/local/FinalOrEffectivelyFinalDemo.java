package io.github.farrukhjon.experiment.java.local;

import java.util.ArrayList;
import java.util.List;

public class FinalOrEffectivelyFinalDemo {

    public static void main(String[] args) {
        List<Action> actionList = new ArrayList<>();

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : ints) {
            Action action = () -> System.out.print(i);
            actionList.add(action);
        }

        actionList.forEach(Action::invoke);
    }

    interface Action {
        void invoke();
    }
}
