package com.mkk.pattens.memento;

import java.util.ArrayList;
import java.util.List;

public class StatusMemento implements IMemento {
    private IStatus mementoObject;
    private List<OrderState> stateHistory;
    private int index=-1;

    public StatusMemento() {
        this.stateHistory = new ArrayList<>();
    }

    @Override
    public void listen(IStatus object) {
        mementoObject = object;
    }

    @Override
    public void onChange(OrderState state) {
        stateHistory.add(state);
        index++;
    }

    public void Undo() {
//        if ((--index) >= 0) {
            mementoObject.setState(stateHistory.get(--index));
//        }
    }

    public void Redo() {
//        if ((++index) < stateHistory.size()) {
            mementoObject.setState(stateHistory.get(++index));
//        }
    }
}
