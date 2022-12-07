import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {

        String str = """
                href="https://vk.com/euronews"
                href="https://www.facebook.com/ru.euronews"
                href="https://t.me/russian_euronews\"""";
        Pattern pattern = Pattern.compile("https?://(?:www\\.|)([\\w.-]+)\\.\\w*");
        Matcher matcher = pattern.matcher(str);
        StringBuilder s = new StringBuilder();
        while (matcher.find()) {
            s.append(matcher.group(1)).append(" ");
        }
        System.out.println(s);
    }
}
