package ru.gosteva.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
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
            @Tag("BLOCKER"),
            @Tag("WEB")
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

    @CsvSource(value = {
            "Selenide          | лаконичные и стабильные UI тесты на Java",
            "Allure Framework  | Allure Framework · GitHub"
    },
            delimiter = '|'
    )
//    @CsvFileSource(resources = "/testdata/firstSearchResultsShouldContainExpectedText.csv")
    @ParameterizedTest(name = "В поисковой выдаче для {0} должен отображаться текст {1}")
    @Tags({
            @Tag("BLOCKER"),
            @Tag("WEB")
    })
    void firstSearchResultsShouldContainExpectedText(String testData, String expectedText) {
        $("#text").setValue(testData);
        $("button[type='submit']").click();
        $$("li.serp-item").first().shouldHave(Condition.text(expectedText));
    }

    @Test
    void photoSearchTest() {
        $(".search3__icon-camera svg").click();
    }
}
