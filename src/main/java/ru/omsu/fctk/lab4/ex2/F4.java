package ru.omsu.fctk.lab4.ex2;

public class F4 extends FLin{
    private double begin,end;
    private double a,b;

    public F4(double begin, double end, double a, double b) {
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
        return a*Math.exp(x)+b;
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
