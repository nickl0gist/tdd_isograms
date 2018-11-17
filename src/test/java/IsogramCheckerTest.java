import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsogramCheckerTest {

    @Test
    public void testEmptyString() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram(""));
    }


    @Ignore
    @Test
    public void testLowercaseIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("isogram"));
    }


    @Ignore
    @Test
    public void testNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("eleven"));
    }


    @Ignore
    @Test
    public void testMediumLongIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("subdermatoglyphic"));
    }


    @Ignore
    @Test
    public void testCaseInsensitive() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("Alphabet"));
    }


    @Ignore
    @Test
    public void testIsogramWithHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("thumbscrew-japingly"));
    }


    @Ignore
    @Test
    public void testIsogramWithDuplicatedHyphen() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("six-year-old"));
    }


    @Ignore
    @Test
    public void testMadeUpNameThatIsAnIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertTrue(iso.isIsogram("Emily Jung Schwartzkopf"));
    }


    @Ignore
    @Test
    public void testDuplicatedCharacterInTheMiddleIsNotIsogram() {
        IsogramChecker iso = new IsogramChecker();
        assertFalse(iso.isIsogram("accentor"));
    }

}
