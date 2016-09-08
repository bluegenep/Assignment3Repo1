package edu.gatech.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test
    public void testCountNumbers1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    // This test for empty, the method should return 0.
    @Test
    public void testCountNumbers2() {
        mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }

    // Test for contiguous sequence of digits
    @Test
    public void testCountNumbers3() {
        mycustomstring.setString("12 and 32 should give 32 and 12");
        assertEquals(4, mycustomstring.countNumbers());
    }

    //Test for non contiguous sequence of digits
    @Test
    public void testCountNumbers4() {
        mycustomstring.setString("1232 should give 32ab2ffg3 and 12");
        assertEquals(5, mycustomstring.countNumbers());
    }

    //Test when no numbers are present in the string
    @Test
    public void testCountNumbers5() {
        mycustomstring.setString("Apple oranges and lemons");
        assertEquals(0, mycustomstring.countNumbers());
    }

    //Test for NullPointer Exception when the string is null
    @Test(expected = NullPointerException.class)
    public void testCountNumbers6() {
        MyCustomString tester = new MyCustomString();
        tester.setString(null);
        tester.countNumbers();

    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    //Test for IllegalArgumentException where n = 0
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        //MyCustomString tester = new MyCustomString();
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true));
    }

    //Test for IllegalArgumentException where n < 0
    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1, true));
    }

    //Test for NullPointerException where the string is null
    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        MyCustomString tester = new MyCustomString();
        tester.setString(null);
        tester.getEveryNthCharacterFromBeginningOrEnd(1, true);

    }

    //Test for if the currentString is empty
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        MyCustomString tester = new MyCustomString();
        tester.setString("");
        assertEquals("", tester.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    // Test for if the currentString has less than n characters, the method should return an empty String
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        MyCustomString tester = new MyCustomString();
        tester.setString("abcd");
        assertEquals("", tester.getEveryNthCharacterFromBeginningOrEnd(5, true));
    }

    //Test for if the currentString is equal to n characters, the method should return first occurance
    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        MyCustomString tester = new MyCustomString();
        tester.setString("abcd");
        assertEquals("d", tester.getEveryNthCharacterFromBeginningOrEnd(4, false));
        assertEquals("a", tester.getEveryNthCharacterFromBeginningOrEnd(4, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        fail("Not yet implemented");
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    //Check if all the first letters of the number are capitalized
    @Test
    public void testConvertDigitsToNamesInSubstring2() {
        MyCustomString tester = new MyCustomString();
        tester.setString("apple123xyz apple1 abc0");
        tester.convertDigitsToNamesInSubstring(1, 23);
        assertEquals("appleOneTwoThreexyz appleOne abcZero", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring3() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring4() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring5() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        fail("Not yet implemented");
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        fail("Not yet implemented");
    }

}
