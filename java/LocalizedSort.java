
import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class LocalizedSort {
    public static List sort(List data, String lang) {
        return sort(data, new Locale(lang));
    }

    public static List sort(List data, Locale locale) {
        Collator collator = Collator.getInstance(locale);
        Collections.sort(data, collator);
        return data;
    }

    public static <T> Map<String, T> sort(Map data, String lang) {
        return sort(data, new Locale(lang));
    }

    public static <T> Map<String, T> sort(Map data, Locale locale) {
        Collator collator = Collator.getInstance(locale);
        TreeMap<String, T> result = new TreeMap<String, T>(collator);
        result.putAll(data);
        return result;
    }
}
