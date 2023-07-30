package guru.qa;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;


public class YandexTest {


    @Test
    void yandexTest() {
    Selenide.open("https://yandex.by/");
    }
}
