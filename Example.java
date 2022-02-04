public class Example {
    public static String firstWord(String str) {
        if(str.indexOf(" ") == -1) {
            return str;
        }
        return str.substring(0, str.indexOf(" "));
    }
}
