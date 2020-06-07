import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {
        String regex = "^(3(0|1)|[0-2]?\\d)(\\-|\\.|\\s)(0?[1-9]|1[0-2])(\\-|\\.|\\s)((19|20)?\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateString);
        return matcher;
    }
}
