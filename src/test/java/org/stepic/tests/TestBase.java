package org.stepic.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.stepic.helpers.AllureAttachments;
import org.stepic.helpers.DriverSettings;
import org.stepic.helpers.DriverUtils;


@ExtendWith({AllureJunit5.class})
public class TestBase {
    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.screenshotAs("Last screenshot");
        AllureAttachments.pageSource();
        AllureAttachments.addVideo(sessionId);
//        AllureAttachments.attachNetwork(); // todo
        AllureAttachments.browserConsoleLogs();

    //    Selenide.closeWebDriver();
    }
}
