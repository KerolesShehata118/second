package first;

import com.microsoft.playwright.*;
import org.junit.Test;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.regex.Pattern;


public class firstTest {
    @Test
     public void shouldHaveCorrectTitle() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://playwright.dev");
            assertThat(page).hasTitle(Pattern.compile("Playwright"));
        }
    }
}
