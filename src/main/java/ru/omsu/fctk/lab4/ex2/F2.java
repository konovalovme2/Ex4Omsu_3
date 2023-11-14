package ru.omsu.fctk.lab4.ex2;

import java.util.concurrent.ExecutionException;

import static java.lang.Math.sin;


public class F2 extends FTrig{
    private double begin,end;
    private double a,b;

    public F2(double begin, double end, double a, double b) {
        this.begin = begin;
        this.end = end;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getTheFunctionResult (double x) {
        if(x<begin || x>end){
            throw new IllegalArgumentException("Не входит в границы отрезка [a,b]");
        }
        return a*sin(b*x);
    }

    @Override
    public double getTheBeginOfInterval() {
        return begin;
    }

    @Override
    public double getTheEndOfInterval() {
        return end;
    }
}
