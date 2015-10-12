import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class ISOUtils {
  private static final Set<String> ISO_LANGUAGES = new HashSet<String>
    (Arrays.asList(Locale.getISOLanguages()));
  private static final Set<String> ISO_COUNTRIES = new HashSet<String>
    (Arrays.asList(Locale.getISOCountries()));

  private ISOUtils() {}

  public static boolean isValidISOLanguage(String languageCode) {
    return ISO_LANGUAGES.contains(languageCode);
  }

  public static boolean isValidISOCountry(String countryCode) {
    return ISO_COUNTRIES.contains(countryCode);
  }
}
