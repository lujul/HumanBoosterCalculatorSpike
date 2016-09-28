package com.androidand.humanboostercalculatorspike;

import com.androidand.humanboostercalculatorspike.business.Palimdrome;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BusinessUnitTest {
    @Test
    public void ShouldReturnTrueWhenItsAPalimdrome() throws Exception {
        Palimdrome palimdrome=new Palimdrome();
        assertEquals(palimdrome.isPalimdrome("été"), true);
    }
    @Test
    public void ShouldReturnTheGoodReverseWord() throws Exception {
        Palimdrome palimdrome=new Palimdrome();
        assertEquals(palimdrome.reve("toto"), "otot");
    }
}