package it.ifinet.test.Util;

public class TextUtil {

    public String sanitaze(String textToSanitize) {
        return textToSanitize.replaceAll("\\s+", "");
    }

}
