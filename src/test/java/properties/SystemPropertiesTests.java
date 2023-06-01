package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    void simplePropertyTest() {
        String browser = System.getProperty("browser");
        System.out.println(browser); //null
    }

    @Test
    void simpleProperty1Test() {
        System.setProperty("browser", "opera");
        String browser = System.getProperty("browser");
        System.out.println(browser); //opera
    }

    @Test
    void simpleProperty2Test() {
        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser); //mozilla
    }

    @Test
    void simpleProperty3Test() {
        System.setProperty("browser", "opera");
        String browser = System.getProperty("browser", "mozilla");
        System.out.println(browser); //opera
    }

    @Test
    @Tag("one_property")
    void simpleProperty4Test() {
        String browsers = System.getProperty("browser", "chrome");
        // gradle clean one_property_test
        // gradle clean one_property_test -Dbrowser=safari

    }
}
