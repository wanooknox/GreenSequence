package com.company.Interfaces;

public interface Action {

    void dependsOn(Action dependency);

    boolean hasExecuted();

    boolean invokable();

    void invoke();
}
