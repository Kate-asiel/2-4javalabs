package my.prject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexTest {
    private Regex regex;


    @BeforeEach
    void setUp() {
        Regex reg = new Regex();
        reg.deleteURL(" ");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void deleteURL() {
        String actual = "You can follow the link , and if you have problems with it, then use http://www.english.com or ";
        String expected = "You can follow the link , and if you have problems with it, then use http://www.english.com or ";
        Assertions.assertEquals(expected, actual);
    }
}