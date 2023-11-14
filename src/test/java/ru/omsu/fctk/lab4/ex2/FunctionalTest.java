package ru.omsu.fctk.lab4.ex2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionalTest {

    @Test
    public void getTheFunctionalResult() {
        Function f1 = new F1(0,10,1,1);
        Function f2 = new F2(0,1,1,Math.PI);
        Function f3 = new F3(0,10,1,1,2,2);
        Function f4 = new F4(0,2,1,0); //exp(x)

        Functional1 ff1 = new Functional1();
        Functional2 ff2 = new Functional2(0,10,0.01);

        assertEquals(18,ff1.getTheFunctionalResult(f1),0.01);
        assertEquals(1,ff1.getTheFunctionalResult(f2),0.01);
        assertEquals(1.5,ff1.getTheFunctionalResult(f3),0.01);
        assertEquals(11.05,ff1.getTheFunctionalResult(f4),0.1);

        assertEquals(60,ff2.getTheFunctionalResult(f1),0.01);
        assertEquals(5,ff2.getTheFunctionalResult(f3),0.01);

        ff2.setEnd(1);
        assertEquals(2/Math.PI,ff2.getTheFunctionalResult(f2),0.01);


        ff2.setEnd(10);
        try{
            ff2.getTheFunctionalResult(f4);
        }
        catch (Exception e){
            System.out.println("Error");
        }


        Functional2 ff3 = new Functional2(1,10,0.001);
        Function f5 = new F2(1,10,0.024,1); // 0,024*sin(x)

        assertEquals(0.033,ff3.getTheFunctionalResult(f5),0.001);
    }
}