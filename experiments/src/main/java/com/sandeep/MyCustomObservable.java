package com.sandeep;

import java.util.ArrayList;
import java.util.List;

public class MyCustomObservable {

    private final List<MyCustomListener> listeners = new ArrayList<>();

    public void addListener(MyCustomListener listener) {
        // do nothing - just for demo
        System.out.println("listener is being added");
        listeners.add(listener);
    }

    public void removeListener(MyCustomListener listener) {
        // do nothing - just for demo
        System.out.println("listener is being removed");
    }

    public void change() {
        listeners.forEach(l -> l.onChange());
    }
}
