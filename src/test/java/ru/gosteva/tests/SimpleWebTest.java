package ru.gosteva.tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SimpleWebTest {

    @BeforeEach
    void setup() {
        Selenide.open("https://ya.ru/");
    }


    @ValueSource(strings = {
            "Selenide", "Allure"
    })
    @ParameterizedTest(name = "В поисковой выдаче Яндекса дожно отображаться 10 результатов по запросу {0}")
    @Tags({
            @Tag("Blocker"),
            @Tag("Web")
    })
    void searchResultsShouldBeGreaterThanOrEqual10(String testData) {
        $("#text").setValue(testData);
        $("button[type='submit']").click();
        $$("li.serp-item").shouldHave(sizeGreaterThanOrEqual(10));
    }

    //   @Test
    //   @DisplayName("В поисковой выдаче Яндекса дожно отображаться 10 результатов по запросу 'Allure'")
    //   @Tags({
    //          @Tag("Blocker"),
    //          @Tag("Web")
    //  })
 //   @Blocker
 //    void searchResultsShouldBeGreaterThanOrEqual10ForQueryAllure() {
 //        $("#text").setValue("Allure");
 //       $("button[type='submit']").click();
 //       $$("li.serp-item").shouldHave(sizeGreaterThanOrEqual(10));
 //    }

    @Test
    void photoSearchTest() {
        $(".search3__icon-camera svg").click();
    }
}
