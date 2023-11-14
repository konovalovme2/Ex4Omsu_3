package ru.omsu.fctk.lab4.ex2;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    @Test
    public void getTheFunctionResult() {
        Function f1 = new F1(0,10,1,1);
        Function f2 = new F2(0,10,1,3.14);
        Function f3 = new F3(0,10,1,1,2,2);
        Function f4 = new F4(0,10,1,1);

        assertEquals(2,f1.getTheFunctionResult(1),0.01);
        assertEquals(0,f2.getTheFunctionResult(1),0.01);
        assertEquals(0.5,f3.getTheFunctionResult(1),0.01); //(x+1)/(2x+2)
        assertEquals(3.71,f4.getTheFunctionResult(1),0.01); //exp(x)+1

        try{
            f1.getTheFunctionResult(11);
        }
        catch (Exception e){
            System.out.println("Error");
        }

        try{
            f2.getTheFunctionResult(11);
        }
        catch (Exception e){
            System.out.println("Error");
        }

        try{
            f3.getTheFunctionResult(11);
        }
        catch (Exception e){
            System.out.println("Error");
        }

        try{
            f4.getTheFunctionResult(11);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }

    @Test
    public void getTheBeginOfInterval() {
        Function f1 = new F1(0,10,1,1);
        Function f2 = new F2(0,10,1,3.14);
        Function f3 = new F3(0,10,1,1,2,2);
        Function f4 = new F4(0,10,1,1);

        assertEquals(0,f1.getTheBeginOfInterval(),0.01);
        assertEquals(0,f2.getTheBeginOfInterval(),0.01);
        assertEquals(0,f3.getTheBeginOfInterval(),0.01);
        assertEquals(0,f4.getTheBeginOfInterval(),0.01);
    }

    @Test
    public void getTheEndOfInterval() {
        Function f1 = new F1(0,10,1,1);
        Function f2 = new F2(0,10,1,3.14);
        Function f3 = new F3(0,10,1,1,2,2);
        Function f4 = new F4(0,10,1,1);

        assertEquals(10,f1.getTheEndOfInterval(),0.01);
        assertEquals(10,f2.getTheEndOfInterval(),0.01);
        assertEquals(10,f3.getTheEndOfInterval(),0.01);
        assertEquals(10,f4.getTheEndOfInterval(),0.01);
    }
}