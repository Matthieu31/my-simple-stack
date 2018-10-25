package deqo.mlen.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item itemATester;
    @Before
    public void init(){
        itemATester=new Item();
    }

    @Test
    public void testGetValeurAvecNull() {
        assertNull(itemATester.getValeur());
    }

    @Test
    public void testConstructeurAvecArg() {
        itemATester= new Item(4);
        assertEquals(4,(int)itemATester.getValeur());
    }

    @Test
    public void testSetValeur() {
        itemATester.setValeur(1);
        assertEquals(1,(int)itemATester.getValeur());
    }
}