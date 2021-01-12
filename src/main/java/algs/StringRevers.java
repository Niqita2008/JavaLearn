package algs;

import org.junit.Assert;
import org.junit.Test;

public class StringRevers {

    public String revers(String s) {
        String result = "";
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                result = s.charAt(i) + result;
            }
        }
        return result;
    }

    @Test
    public void testRevers() {
        String forRevers = "1234567890";
        String expected = "87654321";
        String actual;
        StringRevers stringRevers = new StringRevers();
        actual = stringRevers.revers(forRevers);
        Assert.assertEquals("Реверс не работает", expected, actual);
    }
}
