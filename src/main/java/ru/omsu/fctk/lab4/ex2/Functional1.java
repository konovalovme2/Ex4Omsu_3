package ru.omsu.fctk.lab4.ex2;

public class Functional1 <T extends Function> implements Functional<T>{
    @Override
    public double getTheFunctionalResult(T f) {
        return f.getTheFunctionResult(f.getTheBeginOfInterval()) + f.getTheFunctionResult(f.getTheEndOfInterval()) + f.getTheFunctionResult((f.getTheBeginOfInterval()+f.getTheEndOfInterval())/2);
    }
}
