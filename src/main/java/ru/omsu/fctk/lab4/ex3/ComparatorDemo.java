package ru.omsu.fctk.lab4.ex3;

import ru.omsu.fctk.exercise1.Product;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void sortGoods(Product [] a, Comparator<Product> r){
        Arrays.sort(a,r);
    }
}
