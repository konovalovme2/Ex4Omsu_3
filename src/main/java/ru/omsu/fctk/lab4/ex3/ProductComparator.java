package ru.omsu.fctk.lab4.ex3;

import ru.omsu.fctk.exercise1.*;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        int res = o1.getName().compareTo(o2.getName());
        if(res!=0){
            return res;
        }
        return o1.getDescription().compareTo(o2.getDescription());
    }
}
