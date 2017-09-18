package com.sandeep;

import org.codefx.libfx.listener.handle.ListenerHandle;
import org.codefx.libfx.listener.handle.ListenerHandles;

public class ListenerExperiements {

    public static void main(String[] args) {
        MyCustomObservable customObservable = new MyCustomObservable();
        MyCustomListener customListener = new MyCustomListener();

        ListenerHandle r = ListenerHandles
                .createFor(customObservable, customListener)
                .onAttach((observable, listener) -> observable.addListener(listener))
                .onDetach((observable, listener) -> observable.removeListener(listener))
                .buildAttached();

         r.attach();
         customObservable.change();

    }
}
