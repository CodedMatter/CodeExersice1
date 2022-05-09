import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


class CheckerTest {

    Checker checker;

    @BeforeEach
    void setUp(){
        checker = new Checker();
    }

    // are there more open parenthesis
    @Test
    void moreOpenParenthesis(){
        String stringToCheck = "()(()";
        Assert.assertFalse("Should return false", checker.areParenThesisCloseAndNested(stringToCheck));
    }

    // are there more close parenthesis
    @Test
    void moreCloseParenthesis(){
        String stringToCheck = "())()";
        Assert.assertFalse("Should return false", checker.areParenThesisCloseAndNested(stringToCheck));
    }

    // are parenthesis not nested
    @Test
    void parenthesisNotNested(){
        String stringToCheck = ")()()(";
        Assert.assertFalse("Should return false", checker.areParenThesisCloseAndNested(stringToCheck));
    }

    // are parenthesis close and nested properly
    @Test
    void parenthesisClosedAndNested(){
        String stringToCheck = "((())(()))";
        Assert.assertTrue("Should return true", checker.areParenThesisCloseAndNested(stringToCheck));
    }
}