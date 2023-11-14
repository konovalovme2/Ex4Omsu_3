package ru.omsu.fctk.lab4.ex2;

public class F3 extends FLin{
    private double begin,end;
    private double a,b,c,d;

    public F3(double begin, double end, double a, double b, double c, double d) {
        this.begin = begin;
        this.end = end;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getTheFunctionResult (double x) {
        if(x<begin || x>end){
            throw new IllegalArgumentException("Не входит в границы отрезка [a,b]");
        }
        else if(c*x+d==0){
            throw new IllegalArgumentException("Значение в заменателе равно 0");
        }
        return (a*x+b)/(c*x+d);
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
