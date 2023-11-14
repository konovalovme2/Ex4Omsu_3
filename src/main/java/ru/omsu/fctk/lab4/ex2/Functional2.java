package ru.omsu.fctk.lab4.ex2;

public class Functional2 <T extends Function> implements Functional<T>{
    private double begin;
    private double end;
    private double epsilon;

    public Functional2(double begin, double end, double epsilon) {
        this.begin = begin;
        this.end = end;
        this.epsilon=epsilon;
    }

    @Override
    public double getTheFunctionalResult(T f) {
        if(begin<f.getTheBeginOfInterval() || end>f.getTheEndOfInterval()) {
            throw new IllegalArgumentException("Не входит в границы отрезка [a,b]");
        }
        double res = 0;
        double res1 = 0;
        double n = 2;
        double step;
        do {
            res1=res;
            step=(end-begin)/n;
            res=0;
            for (double i = 0; i < n; i+=1) {
                res+=step*f.getTheFunctionResult(end-i*step);
            }
            n*=2;
        }while(Math.abs(res-res1)>epsilon);
        return res;
    }

    public void setBegin(double begin) {
        this.begin = begin;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public void setEpsilon(int accuracy) {
        this.epsilon = accuracy;
    }
}
