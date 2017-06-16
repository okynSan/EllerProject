/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ua.eller.ellerproject.multiples.Sums;

/**
 *
 * @author andrey_zatvornitskiy
 */
public class SumsTest {

    @Test
    public void getSumsTest() {
        Sums sums = new Sums();

        int sum = sums.getSum(1000);

        System.out.println("Sum is = " + sum);

    }
}
