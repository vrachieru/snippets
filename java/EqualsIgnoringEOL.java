import static org.apache.commons.io.IOUtils.contentEqualsIgnoreEOL;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.io.StringReader;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import com.google.common.base.Throwables;

public class EqualsIgnoringEOL {
  public static void assertEqualsIgnoringEOL(String expected, String actual) {
    assertThat(expected, equalsIgnoringEOL(actual));
  }

  public static Matcher<String> equalsIgnoringEOL(final String value) {
    return new TypeSafeMatcher<String>() {
      @Override
      public void describeTo(Description description) {
        description.appendValue(value);
      }

      @Override
      protected boolean matchesSafely(String item) {
        boolean result = false;
        try {
          result = contentEqualsIgnoreEOL(new StringReader(value), new StringReader(item));
        } catch (IOException e) {
          Throwables.propagate(e);
        }
        return result;
      }

      @Override
      public void describeMismatchSafely(String item, Description mismatchDescription) {
        mismatchDescription.appendText("was\n").appendValue(item);
      }
    };
  }
}
