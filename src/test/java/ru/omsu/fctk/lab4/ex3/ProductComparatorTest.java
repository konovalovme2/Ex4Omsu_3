package ru.omsu.fctk.lab4.ex3;

import org.junit.Test;
import ru.omsu.fctk.exercise1.Product;
import ru.omsu.fctk.exercise1.ProductPiece;
import ru.omsu.fctk.exercise1.ProductWeight;

import static org.junit.Assert.*;

public class ProductComparatorTest {

    @Test
    public void compare() {
        ProductComparator c = new ProductComparator();

        Product a = new Product("A","BCT");
        Product a1 = new ProductPiece("A",12,"BCT");
        Product a2 = new ProductWeight("A","BCD");
        ProductPiece a3 = new ProductPiece("B",16,"BCD");
        ProductWeight a4 = new ProductWeight("A","BCD");

        assertTrue(c.compare(a,a1)==0);
        assertTrue(c.compare(a,a2)>0);
        assertTrue(c.compare(a,a3)<0);
        assertTrue(c.compare(a,a4)>0);

        assertTrue(c.compare(a1,a2)>0);
        assertTrue(c.compare(a1,a3)<0);
        assertTrue(c.compare(a1,a4)>0);

        assertTrue(c.compare(a2,a3)<0);
        assertTrue(c.compare(a2,a4)==0);

        assertTrue(c.compare(a3,a4)>0);
    }
}