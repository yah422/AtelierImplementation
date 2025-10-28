package com.dawan.atelier_implementation.interfaces;

public class CalcSimpleImpl implements CalcSimple {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }
}
