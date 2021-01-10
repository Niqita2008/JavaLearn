package algs;

public class StringRevers {

    public static String revers(String s) {
        String result = "";
        if (s != null) {
            for (int i = 0; i < s.length(); i++) {
                result = s.charAt(i) + result;
            }
        }
        return result;
    }
}
