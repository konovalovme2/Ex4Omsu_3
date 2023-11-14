package ru.omsu.fctk.lab4.ex3;

import org.junit.Test;
import ru.omsu.fctk.exercise1.Product;
import ru.omsu.fctk.exercise1.ProductPiece;
import ru.omsu.fctk.exercise1.ProductWeight;

import static org.junit.Assert.*;

public class ComparatorDemoTest {

    @Test
    public void sortGoods() {
        ProductComparator c = new ProductComparator();

        Product [] A = new Product[5];

        Product a = new Product("E","BCT");
        Product a1 = new ProductPiece("B",12,"BCT");
        Product a2 = new ProductWeight("A","BLD");
        ProductPiece a3 = new ProductPiece("B",16,"YCD");
        ProductWeight a4 = new ProductWeight("A","BCF");

        A[0]=a;
        A[1]=a1;
        A[2]=a2;
        A[3]=a3;
        A[4]=a4;

        ComparatorDemo.sortGoods(A,c);

        assertArrayEquals(new Product[]{a4,a2,a1,a3,a},A);
    }
}