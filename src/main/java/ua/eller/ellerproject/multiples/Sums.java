/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.eller.ellerproject.multiples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class Sums {

    List<Integer> multimpleList = new ArrayList<>();

    public int getSum(int borderNumber) {
        int sum = 0;
        
        getMultiples(borderNumber);
        
        for (Integer a : multimpleList){
            sum+=a;
        }       
        
        return sum;
    }

    public void getMultiples(int borderNumber) {
        for (int i = 1; i < borderNumber; i++) {
            if (i % 3 == 0) {
                multimpleList.add(i);
            } else if (i % 5 == 0) {
                multimpleList.add(i);
            }
        }
    }

}
