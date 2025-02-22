package com.taran.singleton;

import java.awt.event.WindowStateListener;

public class SingleTon {
    int num = 0;

    private SingleTon() {};
    private static SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;
    }
}
