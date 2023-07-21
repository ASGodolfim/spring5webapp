package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.currency.Dollar;
import guru.springframework.spring5webapp.currency.Franc;
import guru.springframework.spring5webapp.currency.Money;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class MoneyTest {

    @Test
    public void testMultiplicationDollar(){
        Money five = Money.dollar (5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEqualityDollar(){
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar (8));
    }
    @Test
    public void testMultiplicationFranc(){
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEqualityFranc(){
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc (8));
    }

    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency);
        assertEquals("CHF", Money.franc(1).currency);
    }
}












