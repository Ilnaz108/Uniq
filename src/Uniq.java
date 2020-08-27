import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Uniq {
    public static class UniqSymbol {

        public static void main(String[] args) {
            String s = "qqwwerrrrrty";
            Pattern pattern = Pattern.compile("(?:(.)\\1+)*(.?)");
            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                System.out.println(matcher.group(2)); // выведет "e"
                break;
            }
        }
    }
}
