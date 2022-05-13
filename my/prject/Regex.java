package my.prject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    final String pattern = "http://www\\.[\\w.-]*(?:xxx|charmes|hacking|crack)[\\w.-]*\\.com";


    public void deleteURL(String text) {

        Pattern p = Pattern.compile(pattern);
        String replaced = p.matcher(text).replaceAll("");
        System.out.println(replaced);
    }
}